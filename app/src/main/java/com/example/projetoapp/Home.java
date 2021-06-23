package com.example.projetoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    Button BtnVerMais;
    Button BtnCriarLogin;
    ImageButton BtnFiltro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Para tela resultado hotel
        BtnVerMais=(Button) findViewById(R.id.BtnVerMais);
        BtnVerMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent resulthotel = new Intent(getApplicationContext(), TelaResultHotel.class);
                startActivity(resulthotel);
            }
        });

        //Para tela login
        BtnCriarLogin=(Button) findViewById(R.id.BtnCriarLogin);
        BtnCriarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent login = new Intent(getApplicationContext(), Activity2.class);
                startActivity(login);
            }
        });

        BtnFiltro=(ImageButton) findViewById(R.id.imgBtnFiltro);
        BtnFiltro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent filtro = new Intent(getApplicationContext(), Filtro.class);
                startActivity(filtro);
            }
        });
    }
}
