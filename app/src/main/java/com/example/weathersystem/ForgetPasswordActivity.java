package com.example.weathersystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgetPasswordActivity extends AppCompatActivity {

    private Button mBtn1,mBtn2,mBtn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        mBtn1 = findViewById(R.id.btn_mailbox);
        mBtn2 = findViewById(R.id.btn_text);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgetPasswordActivity.this,FindByMailboxctivity.class);
                startActivity(intent);
            }
        });
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgetPasswordActivity.this,FindByMailboxctivity.class);
                startActivity(intent);
            }
        });
        mBtn3 = findViewById(R.id.btn_return1);
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgetPasswordActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
