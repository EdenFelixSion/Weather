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

public class QinghaiTibetRegionActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtn1,mBtn2,mBtn01,mBtn02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qinghai_tibet_region);
        mBtn1 = findViewById(R.id.btn_homepage);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QinghaiTibetRegionActivity.this,HomePageActivity.class);
                startActivity(intent);
            }
        });
        mBtn2 = findViewById(R.id.btn_myself);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QinghaiTibetRegionActivity.this,MyselfActivity.class);
                startActivity(intent);
            }
        });
        mBtn01 = findViewById(R.id.btn_qinghai_01);
        mBtn02 = findViewById(R.id.btn_qinghai_02);
        mBtn01.setOnClickListener(this);
        mBtn02.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(QinghaiTibetRegionActivity.this);
        switch (v.getId()) {
            case R.id.btn_qinghai_01:
                builder.setTitle("成功！");
                String msg01 = "你己经成功将拉萨添加到我喜欢";
                builder.setMessage(msg01);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="拉萨"+"\n";
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
            case R.id.btn_qinghai_02:
                builder.setTitle("成功！");
                String msg02 = "你己经成功将西宁添加到我喜欢";
                builder.setMessage(msg02);
                builder.setPositiveButton("确定",null);
                try {
                    FileOutputStream fos = openFileOutput("city.txt", Context.MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    String idpassword ="西宁"+"\n";
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
