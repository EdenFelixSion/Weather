package com.example.weathersystem;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class MyselfActivity extends AppCompatActivity {

    private Button mBtn1,mBtn2,mBtn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myself);


        TextView tv=findViewById(R.id.tv_homepage_03);
        tv.setText( "用户id：" + MainActivity.user$id+EnrollTextView.user$id);


        mBtn1 = findViewById(R.id.btn_homepage);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyselfActivity.this,HomePageActivity.class);
                startActivity(intent);
            }
        });
        mBtn2 = findViewById(R.id.btn_exit);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deletefile("city.txt");
                Intent intent = new Intent(MyselfActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        mBtn3 = findViewById(R.id.btn_like);
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyselfActivity.this,MyFavorateActivity.class);
                startActivity(intent);
            }
        });
    }
    public static void deletefile(String fileName) {
        try {
            File file = new File(Environment.getExternalStorageDirectory(), fileName);
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}