package com.example.weathersystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePageActivity extends AppCompatActivity {

    private Button mBtn1,mBtn2,mBtn3,mBtn4,mBtn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        mBtn1 = findViewById(R.id.btn_01);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this,NorthwestRegionActivity.class);
                startActivity(intent);
            }
        });
        mBtn2 = findViewById(R.id.btn_02);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this,QinghaiTibetRegionActivity.class);
                startActivity(intent);
            }
        });
        mBtn3 = findViewById(R.id.btn_03);
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this,NorthernRegionActivity.class);
                startActivity(intent);
            }
        });
        mBtn4 = findViewById(R.id.btn_04);
        mBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this,SouthernRegionActivity.class);
                startActivity(intent);
            }
        });
        mBtn5 = findViewById(R.id.btn_myself);
        mBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this,MyselfActivity.class);
                startActivity(intent);
            }
        });
    }
}
