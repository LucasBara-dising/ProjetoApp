package com.example.projetoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    private Button BtnVerMais;
    private Button BtnCriarLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BtnVerMais = (Button) findViewById(R.id.BtnVerMais);
        BtnVerMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TelaResultHotel();
            }
        });

        BtnCriarLogin = (Button) findViewById(R.id.BtnCriarLogin);
        BtnCriarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity2();
            }
        });
    }

    public void TelaResultHotel() {
        Intent result = new Intent(getApplicationContext(), TelaResultHotel.class);
        startActivity(result);
    }
    public void Activity2() {
        Intent voltar = new Intent(getApplicationContext(), Activity2.class);
        startActivity(voltar);
    }
}
