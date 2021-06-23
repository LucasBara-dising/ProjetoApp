package com.example.projetoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    Button BtnVerMais;
    Button BtnCriarLogin;

    ImageButton BtnFiltro;

    ImageView BtnHistorico;
    TextView txtViewHistorico;

    ImageView btnConta;
    TextView txtViewConta;

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

        //Para tela historico
        BtnHistorico=(ImageView) findViewById(R.id.BtnHistorico);
        BtnHistorico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent historico = new Intent(getApplicationContext(), HistoricoDeReserva.class);
                startActivity(historico);
            }
        });
        txtViewHistorico=(TextView) findViewById(R.id.txtViewHistorico);
        txtViewHistorico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent historico = new Intent(getApplicationContext(), HistoricoDeReserva.class);
                startActivity(historico);
            }
        });

        //Para tela conta
        btnConta=(ImageView) findViewById(R.id.btnConta);
        btnConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent conta = new Intent(getApplicationContext(), Conta.class);
                startActivity(conta);
            }
        });
        txtViewConta=(TextView) findViewById(R.id.txtViewConta);
        txtViewConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent conta = new Intent(getApplicationContext(), Conta.class);
                startActivity(conta);
            }
        });


        //para tela filtro
        BtnFiltro=(ImageButton) findViewById(R.id.BtnFiltro);
        BtnFiltro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent filtro = new Intent(getApplicationContext(), Filtro.class);
                startActivity(filtro);
            }
        });
    }
}
