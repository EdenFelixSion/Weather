package com.example.weathersystem;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.weathersystem.bean.WeatherBean;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.StringTokenizer;

public class SouthernRegionActivity extends AppCompatActivity implements View.OnClickListener{

    public SouthernRegionActivity(){

    }

    private Button mBtn1,mBtn2,mBtn01,mBtn02,mBtn03,mBtn05,mBtn06,mBtn07,mBtn08,mBtn09,mBtn10;
    private Button mBtn11,mBtn12,mBtn13,mBtn14,mBtn15,mBtn16,mBtn17,mBtn18,mBtn19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_southern_region);
        mBtn1 = findViewById(R.id.btn_homepage);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SouthernRegionActivity.this,HomePageActivity.class);
                startActivity(intent);
            }
        });
        mBtn2 = findViewById(R.id.btn_myself);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SouthernRegionActivity.this,MyselfActivity.class);
                startActivity(intent);
            }
        });
        mBtn01 = findViewById(R.id.btn_southernregion_01);
        mBtn02 = findViewById(R.id.btn_southernregion_02);
        mBtn03 = findViewById(R.id.btn_southernregion_03);
        mBtn05 = findViewById(R.id.btn_southernregion_05);
        mBtn06 = findViewById(R.id.btn_southernregion_06);
        mBtn07 = findViewById(R.id.btn_southernregion_07);
        mBtn08 = findViewById(R.id.btn_southernregion_08);
        mBtn09 = findViewById(R.id.btn_southernregion_09);
        mBtn10 = findViewById(R.id.btn_southernregion_10);
        mBtn11 = findViewById(R.id.btn_southernregion_11);
        mBtn12 = findViewById(R.id.btn_southernregion_12);
        mBtn13 = findViewById(R.id.btn_southernregion_13);
        mBtn14 = findViewById(R.id.btn_southernregion_14);
        mBtn15 = findViewById(R.id.btn_southernregion_15);
        mBtn16 = findViewById(R.id.btn_southernregion_16);
        mBtn17 = findViewById(R.id.btn_southernregion_17);
        mBtn18 = findViewById(R.id.btn_southernregion_18);
        mBtn19 = findViewById(R.id.btn_southernregion_19);
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
        mBtn12.setOnClickListener(this);
        mBtn13.setOnClickListener(this);
        mBtn14.setOnClickListener(this);
        mBtn15.setOnClickListener(this);
        mBtn16.setOnClickListener(this);
        mBtn17.setOnClickListener(this);
        mBtn18.setOnClickListener(this);
        mBtn19.setOnClickListener(this);
    }

    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(SouthernRegionActivity.this);
        switch (v.getId()) {
            case R.id.btn_southernregion_01:
                builder.setTitle("成功！");
                String msg01 = "你己经成功将成都添加到我喜欢";
                builder.setMessage(msg01);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="成都"+"\n";
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
            case R.id.btn_southernregion_02:
                builder.setTitle("成功！");
                String msg02 = "你己经成功将昆明添加到我喜欢";
                builder.setMessage(msg02);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="昆明"+"\n";
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
            case R.id.btn_southernregion_03:
                builder.setTitle("成功！");
                String msg03 = "你己经成功将重庆添加到我喜欢";
                builder.setMessage(msg03);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="重庆"+"\n";
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
            case R.id.btn_southernregion_05:
                builder.setTitle("成功！");
                String msg05 = "你己经成功将贵阳添加到我喜欢";
                builder.setMessage(msg05);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="贵阳"+"\n";
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
            case R.id.btn_southernregion_06:
                builder.setTitle("成功！");
                String msg06 = "你己经成功将南宁添加到我喜欢";
                builder.setMessage(msg06);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="南宁"+"\n";
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
            case R.id.btn_southernregion_07:
                builder.setTitle("成功！");
                String msg07 = "你己经成功将海口添加到我喜欢";
                builder.setMessage(msg07);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="海口"+"\n";
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
            case R.id.btn_southernregion_08:
                builder.setTitle("成功！");
                String msg08 = "你己经成功将武汉添加到我喜欢";
                builder.setMessage(msg08);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="武汉"+"\n";
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
            case R.id.btn_southernregion_09:
                builder.setTitle("成功！");
                String msg09 = "你己经成功将长沙添加到我喜欢";
                builder.setMessage(msg09);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="长沙"+"\n";
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
            case R.id.btn_southernregion_10:
                builder.setTitle("成功！");
                String msg10 = "你己经成功将广州添加到我喜欢";
                builder.setMessage(msg10);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="广州"+"\n";
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
            case R.id.btn_southernregion_11:
                builder.setTitle("成功！");
                String msg11 = "你己经成功将香港添加到我喜欢";
                builder.setMessage(msg11);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="香港"+"\n";
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
            case R.id.btn_southernregion_12:
                builder.setTitle("成功！");
                String msg12 = "你己经成功将澳门添加到我喜欢";
                builder.setMessage(msg12);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="澳门"+"\n";
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
            case R.id.btn_southernregion_13:
                builder.setTitle("成功！");
                String msg13 = "你己经成功将合肥添加到我喜欢";
                builder.setMessage(msg13);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="合肥"+"\n";
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
            case R.id.btn_southernregion_14:
                builder.setTitle("成功！");
                String msg14 = "你己经成功将南昌添加到我喜欢";
                builder.setMessage(msg14);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="南昌"+"\n";
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
            case R.id.btn_southernregion_15:
                builder.setTitle("成功！");
                String msg15 = "你己经成功将福州添加到我喜欢";
                builder.setMessage(msg15);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="福州"+"\n";
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
            case R.id.btn_southernregion_16:
                builder.setTitle("成功！");
                String msg16 = "你己经成功将南京添加到我喜欢";
                builder.setMessage(msg16);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="南京"+"\n";
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
            case R.id.btn_southernregion_17:
                builder.setTitle("成功！");
                String msg17 = "你己经成功将上海添加到我喜欢";
                builder.setMessage(msg17);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="上海"+"\n";
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
            case R.id.btn_southernregion_18:
                builder.setTitle("成功！");
                String msg18 = "你己经成功将杭州添加到我喜欢";
                builder.setMessage(msg18);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="杭州"+"\n";
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
            case R.id.btn_southernregion_19:
                builder.setTitle("成功！");
                String msg19 = "你己经成功将台湾添加到我喜欢";
                builder.setMessage(msg19);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="台湾"+"\n";
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
//        builder.create().show();
        AlertDialog alertDialog=builder.create();
        //显示对话框
        alertDialog.show();
    }
}
