package com.example.weathersystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FindByMailboxctivity extends AppCompatActivity {

    private Button mBtn1,mBtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_by_mailboxctivity);
        mBtn1 = findViewById(R.id.btn_return1);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FindByMailboxctivity.this,ForgetPasswordActivity.class);
                startActivity(intent);
            }
        });
        mBtn2 = findViewById(R.id.btn_next);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FindByMailboxctivity.this,ChangePasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}
