package com.example.weathersystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChangePasswordActivity extends AppCompatActivity {

    private Button mBtn1,mBtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        mBtn1 = findViewById(R.id.btn_return2);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangePasswordActivity.this,FindByMailboxctivity.class);
                startActivity(intent);
            }
        });
        mBtn2 = findViewById(R.id.btn_finish);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangePasswordActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
