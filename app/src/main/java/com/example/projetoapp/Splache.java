package com.example.projetoapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splache extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splache);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
                startActivity(new Intent(getBaseContext(),MainActivity.class));
                finish();
           }
       },5000);

    }
}