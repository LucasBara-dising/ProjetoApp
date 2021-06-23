package com.example.projetoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HistoricoDeReserva extends AppCompatActivity {
        Button BtnMostraRecomendados;
        ImageView btnHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico_de_reserva);

        //Para tela resultado hotel
        BtnMostraRecomendados=(Button) findViewById(R.id.BtnMostraRecomendados);
        BtnMostraRecomendados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent hotelResult = new Intent(getApplicationContext(), TelaResultHotel.class);
                startActivity(hotelResult);
            }
        });

        //Para tela home
        btnHome=(ImageView) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent home = new Intent(getApplicationContext(), Home.class);
                startActivity(home);
            }
        });


    }

}