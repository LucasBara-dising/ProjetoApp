package com.example.projetoapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class Filtro extends AppCompatActivity {
private Spinner caixa;
private ImageButton ImgVoltaParaHome2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtro);

        ImgVoltaParaHome2= (ImageButton) findViewById(R.id.imgBtnVoltaHome2);
        ImgVoltaParaHome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Home2(); }
        });


        caixa = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.exibOrdlist, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        caixa.setAdapter(adapter);
        }

    public void Home2(){
        Intent voltar3 = new Intent(getApplicationContext(), Home.class);
        startActivity(voltar3);
    }
}
