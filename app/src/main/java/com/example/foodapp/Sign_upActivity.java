package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sign_upActivity extends AppCompatActivity {


    TextView register , exist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        register = findViewById(R.id.btnRegister);
        exist = findViewById(R.id.tvAlready);

        getSupportActionBar().getTitle();


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_upActivity.this , Login_Activity.class);
                startActivity(intent);
            }
        });

          exist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_upActivity.this , Login_Activity.class);
                startActivity(intent);
            }
        });























    }
}