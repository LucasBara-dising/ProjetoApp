package com.example.projetoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TelaResultHotel extends AppCompatActivity {
    private Button btnResultHotel;
    private Button BtnVoltaParaHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_result_hotel);

        btnResultHotel= (Button) findViewById(R.id.btnReserva);
        btnResultHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            //ligaçao entre resulta e tela de hotel
            public void onClick(View v) {
                TelaHotel();
            }
        });

//        BtnVoltaParaHome= (ImageButton) findViewById(R.id.ImgBtnVoltaHome);
//        BtnVoltaParaHome.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TelaHome();
//            }
//        });
    }
    public void TelaHotel(){
        Intent reserva = new Intent(getApplicationContext(), TelaHotel.class);
        startActivity(reserva);
    }

}