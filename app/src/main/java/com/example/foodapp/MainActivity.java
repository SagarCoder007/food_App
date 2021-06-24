package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView signup , tvcreate , login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup = findViewById(R.id.btnSignup);
        tvcreate = findViewById(R.id.createAccount);
        login = findViewById(R.id.btnLogin);

        getSupportActionBar().hide();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Sign_upActivity.class);
                startActivity(intent);
            }
        });


         login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Login_Activity.class);
                startActivity(intent);
            }
        });














         tvcreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Sign_upActivity.class);
                startActivity(intent);
            }
        });






































    }
}