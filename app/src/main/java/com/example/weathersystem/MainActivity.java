package com.example.weathersystem;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static String user$id = "";
    private Button mBtnEnroll;
    private Button mBtnForget;
    private Button mBtnLogin;
    private Button mBtnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnEnroll = findViewById(R.id.btn_newaccount);
        mBtnEnroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EnrollTextView.class);
                startActivity(intent);
            }
        });
        mBtnForget = findViewById(R.id.btn_forgetpassword);
        mBtnForget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForgetPasswordActivity.class);
                startActivity(intent);
            }
        });
        final EditText et_id = (EditText) findViewById(R.id.et_1);
        final EditText et_pwd = (EditText) findViewById(R.id.et_2);
        mBtnLogin = findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_id != null && et_pwd != null) {
                    String str = et_id.getText().toString();
                    Log.d("id",str);
                    String password =  et_pwd.getText().toString();
                    Log.d( "password",password);
                    if ( str != null && str.length() > 0&&password != null && password.length() > 0){
                        int id = Integer.parseInt(str);

                        User user = new User(id,null);
                        try {
                            FileInputStream fileInputStream = openFileInput("user.txt");
                            if (fileInputStream != null) {
                                InputStreamReader inputreader = new InputStreamReader( fileInputStream );
                                BufferedReader buffreader = new BufferedReader( inputreader );
                                String string;
                                int count = 0;
                                //分行读取
                                while ((string = buffreader.readLine()) != null) {
                                    StringTokenizer stringTokenizer = new StringTokenizer( string, " " );
                                    int id0 = Integer.parseInt( stringTokenizer.nextToken() );
                                    Log.d("id0", String.valueOf( id0 ) );
                                    String password0 = stringTokenizer.nextToken();
                                    Log.d("password0",password0);
                                    if (id == id0 && password.equals(password0)) {
                                        count = 1;
                                    }
                                }
                                fileInputStream.close();

                                if(count == 1){
                                    user$id =""+id;
                                    EnrollTextView.user$id="";
                                    Intent intent = new Intent( MainActivity.this, HomePageActivity.class );
                                    startActivity( intent );
                                }else {
                                    Intent intent = new Intent( MainActivity.this, MainActivity.class );
                                    startActivity( intent );
                                }
                            } else {
                                Intent intent = new Intent( MainActivity.this, MainActivity.class );
                                startActivity( intent );
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }else {
                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);
                    }

                } else {
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
        mBtnAboutUs = findViewById(R.id.btn_aboutus);
        mBtnAboutUs.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        switch (v.getId()) {
            case R.id.btn_aboutus:
                builder.setTitle("关于我们");
                String msg01 = "18组\n制作人员：王俊超，仲崇林";
                builder.setMessage(msg01);
                builder.setPositiveButton("确定",null);
                break;
        }
        AlertDialog alertDialog=builder.create();
        //显示对话框
        alertDialog.show();
    }
}