package com.example.friends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void onClick3(View view)
    {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
    public void onClick1(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}