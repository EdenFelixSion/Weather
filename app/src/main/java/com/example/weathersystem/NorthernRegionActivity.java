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

public class NorthernRegionActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtn1,mBtn2,mBtn01,mBtn02,mBtn03,mBtn05,mBtn06,mBtn07,mBtn08,mBtn09,mBtn10,mBtn11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_northern_region);
        mBtn1 = findViewById(R.id.btn_homepage);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NorthernRegionActivity.this,HomePageActivity.class);
                startActivity(intent);
            }
        });
        mBtn2 = findViewById(R.id.btn_myself);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NorthernRegionActivity.this,MyselfActivity.class);
                startActivity(intent);
            }
        });
        mBtn01 = findViewById(R.id.btn_north_01);
        mBtn02 = findViewById(R.id.btn_north_02);
        mBtn03 = findViewById(R.id.btn_north_03);
        mBtn05 = findViewById(R.id.btn_north_05);
        mBtn06 = findViewById(R.id.btn_north_06);
        mBtn07 = findViewById(R.id.btn_north_07);
        mBtn08 = findViewById(R.id.btn_north_08);
        mBtn09 = findViewById(R.id.btn_north_09);
        mBtn10 = findViewById(R.id.btn_north_10);
        mBtn11 = findViewById(R.id.btn_north_11);
        mBtn01.setOnClickListener(this);
        mBtn02.setOnClickListener(this);
        mBtn03.setOnClickListener(this);
        mBtn05.setOnClickListener(this);
        mBtn06.setOnClickListener(this);
        mBtn07.setOnClickListener(this);
        mBtn08.setOnClickListener(this);
        mBtn09.setOnClickListener(this);
        mBtn10.setOnClickListener(this);
        mBtn11.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(NorthernRegionActivity.this);
        switch (v.getId()) {
            case R.id.btn_north_01:
                builder.setTitle("成功！");
                String msg01 = "你己经成功将哈尔滨添加到我喜欢";
                builder.setMessage(msg01);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="哈尔滨"+"\n";
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
            case R.id.btn_north_11:
                builder.setTitle("成功！");
                String msg11 = "你己经成功将天津添加到我喜欢";
                builder.setMessage(msg11);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="天津"+"\n";
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
            case R.id.btn_north_02:
                builder.setTitle("成功！");
                String msg02 = "你己经成功将长春添加到我喜欢";
                builder.setMessage(msg02);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="长春"+"\n";
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
            case R.id.btn_north_03:
                builder.setTitle("成功！");
                String msg03 = "你己经成功将沈阳添加到我喜欢";
                builder.setMessage(msg03);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="沈阳"+"\n";
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
            case R.id.btn_north_05:
                builder.setTitle("成功！");
                String msg05 = "你己经成功将西安添加到我喜欢";
                builder.setMessage(msg05);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="西安"+"\n";
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
            case R.id.btn_north_06:
                builder.setTitle("成功！");
                String msg06 = "你己经成功将郑州添加到我喜欢";
                builder.setMessage(msg06);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="郑州"+"\n";
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
            case R.id.btn_north_07:
                builder.setTitle("成功！");
                String msg07 = "你己经成功将济南添加到我喜欢";
                builder.setMessage(msg07);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="济南"+"\n";
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
            case R.id.btn_north_08:
                builder.setTitle("成功！");
                String msg08 = "你己经成功将石家庄添加到我喜欢";
                builder.setMessage(msg08);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="石家庄"+"\n";
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
            case R.id.btn_north_09:
                builder.setTitle("成功！");
                String msg09 = "你己经成功将北京添加到我喜欢";
                builder.setMessage(msg09);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="北京"+"\n";
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
            case R.id.btn_north_10:
                builder.setTitle("成功！");
                String msg10 = "你己经成功将太原添加到我喜欢";
                builder.setMessage(msg10);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="太原"+"\n";
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
