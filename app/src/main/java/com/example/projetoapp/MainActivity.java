package com.example.projetoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    private Button BtnTelaBemVindo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnTelaBemVindo= (Button) findViewById(R.id.BtnTelaBemVindo);
        BtnTelaBemVindo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity2();
            }
        });
    }
   public void Activity2(){
       Intent login = new Intent(getApplicationContext(), Activity2.class);
       startActivity(login);
   }

}

