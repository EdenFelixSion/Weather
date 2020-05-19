package com.example.weathersystem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class EnrollTextView extends AppCompatActivity {

    private Button mBtnagree;
    public static  String user$id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll_text_view);
        final EditText et_id = (EditText) findViewById(R.id.et_1);
        final EditText et_pwd = (EditText) findViewById(R.id.et_2);
        final EditText et_pwd2 = (EditText) findViewById(R.id.et_3);
        mBtnagree = findViewById(R.id.btn_agree);
        mBtnagree.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if (et_id != null && et_pwd != null){
                    String str = et_id.getText().toString();
                    Log.d("id",str);
                    String password = et_pwd.getText().toString();
                    Log.d("password",password);
                    String password2 = et_pwd2.getText().toString();
                    Log.d("password",password2);
                    if (str != null && str.length() >= 4&&str.length() <= 20
                            && password != null && password.length() >= 6&&password.length()<=20) {
                        int id = Integer.parseInt(str);
                        if (password.equals(password2)) {
                            try {
                                FileInputStream fileInputStream =  openFileInput( "user.txt" );
                                if (fileInputStream != null) {
                                    InputStreamReader inputreader = new InputStreamReader(fileInputStream );
                                    BufferedReader buffreader = new BufferedReader( inputreader );
                                    String string;
                                    int count=0;
                                    //分行读取
                                    while ((string = buffreader.readLine()) != null) {
                                        StringTokenizer stringTokenizer = new StringTokenizer( string, " " );
                                        int id0 = Integer.parseInt( stringTokenizer.nextToken() );
                                        String password0 = stringTokenizer.nextToken();
                                        if (id == id0) {
                                            count++;
                                        }
                                    }
                                    fileInputStream.close();

                                    if(count==0){
                                        try {
                                            FileOutputStream fos = openFileOutput("user.txt", Context.MODE_APPEND);//openFileOutput函数会自动创建文件
                                            OutputStreamWriter osw = new OutputStreamWriter(fos);
                                            String idpassword =  id + " "+ password + "\n";
                                            Log.d("idpassword",idpassword);
                                            osw.write(idpassword);
                                            osw.flush();
                                            fos.flush();
                                            osw.close();
                                            fos.close();
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                        user$id = "" + id;
                                        MainActivity.user$id="";
                                        Intent intent = new Intent(EnrollTextView.this, HomePageActivity.class);
                                        startActivity(intent);
                                    }else {
                                        Intent intent = new Intent(EnrollTextView.this, EnrollTextView.class);
                                        startActivity(intent);
                                    }

                                } else {
                                    Intent intent = new Intent(EnrollTextView.this, EnrollTextView.class);
                                    startActivity(intent);
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        } else {
                            Intent intent = new Intent(EnrollTextView.this, EnrollTextView.class);
                            startActivity(intent);
                        }
                    }else {
                        Intent intent = new Intent(EnrollTextView.this, EnrollTextView.class);
                        startActivity(intent);
                    }

                } else {
                    Intent intent = new Intent(EnrollTextView.this, EnrollTextView.class);
                    startActivity(intent);
                }
            }
        });
    }
}
