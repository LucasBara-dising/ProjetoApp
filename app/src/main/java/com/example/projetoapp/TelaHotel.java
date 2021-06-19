package com.example.projetoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class TelaHotel extends AppCompatActivity {
    TextView txtLocHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_hotel2);


        //abiri o gogle maps ao clicar no endereço(precisa de coodenada para abrir)
        txtLocHotel=findViewById(R.id.txtLocHotel);
        txtLocHotel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent maps = new Intent(Intent.ACTION_VIEW);
                maps.setData(Uri.parse("geo:-23.550164466 -46.633664132"));
                Intent chooser=Intent.createChooser(maps,"open Google maps");
                startActivity(maps);
            }
        });

    }
}