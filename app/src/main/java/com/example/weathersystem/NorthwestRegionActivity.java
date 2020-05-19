package com.example.weathersystem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class NorthwestRegionActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtn1,mBtn2,mBtn01,mBtn02,mBtn03,mBtn04;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_northwest_region);
        mBtn1 = findViewById(R.id.btn_homepage);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NorthwestRegionActivity.this,HomePageActivity.class);
                startActivity(intent);
            }
        });
        mBtn2 = findViewById(R.id.btn_myself);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NorthwestRegionActivity.this,MyselfActivity.class);
                startActivity(intent);
            }
        });
        mBtn01 = findViewById(R.id.btn_northwest_01);
        mBtn02 = findViewById(R.id.btn_northwest_02);
        mBtn03 = findViewById(R.id.btn_northwest_03);
        mBtn04 = findViewById(R.id.btn_northwest_04);
        mBtn01.setOnClickListener(this);
        mBtn02.setOnClickListener(this);
        mBtn03.setOnClickListener(this);
        mBtn04.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(NorthwestRegionActivity.this);
        switch (v.getId()) {
            case R.id.btn_northwest_01:
                builder.setTitle("成功！");
                String msg01 = "你己经成功将乌鲁木齐添加到我喜欢";
                builder.setMessage(msg01);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="乌鲁木齐"+"\n";
                    Log.d("idpassword",idpassword);
                    osw.write(idpassword);
                    osw.flush();
                    fos.flush();
                    osw.close();
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.btn_northwest_02:
                builder.setTitle("成功！");
                String msg02 = "你己经成功将兰州添加到我喜欢";
                builder.setMessage(msg02);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="兰州"+"\n";
                    Log.d("idpassword",idpassword);
                    osw.write(idpassword);
                    osw.flush();
                    fos.flush();
                    osw.close();
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.btn_northwest_03:
                builder.setTitle("成功！");
                String msg03 = "你己经成功将呼和浩特添加到我喜欢";
                builder.setMessage(msg03);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="呼和浩特"+"\n";
                    Log.d("idpassword",idpassword);
                    osw.write(idpassword);
                    osw.flush();
                    fos.flush();
                    osw.close();
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.btn_northwest_04:
                builder.setTitle("成功！");
                String msg04 = "你己经成功将银川添加到我喜欢";
                builder.setMessage(msg04);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="银川"+"\n";
                    Log.d("idpassword",idpassword);
                    osw.write(idpassword);
                    osw.flush();
                    fos.flush();
                    osw.close();
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
        AlertDialog alertDialog=builder.create();
        //显示对话框
        alertDialog.show();
    }
}
