package com.example.projetoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Conta extends AppCompatActivity {
    private ArrayList<ContryItem> mCountryList;
    private ContryAdapter mAdapter;
    private ImageView ImgHome;
    private ImageView ImgViagens;
    private ImageButton ImgVoltaParaHome;
    private Button btnLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conta);

        initList();

        Spinner spinnerCountries = findViewById(R.id.spinner_countries);

        mAdapter = new ContryAdapter(this, mCountryList);
        spinnerCountries.setAdapter(mAdapter);

        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                ContryItem clickedItem = (ContryItem) parent.getItemAtPosition(position);
                String clickedContryName = clickedItem.getContryName();
                Toast.makeText(Conta.this, clickedContryName + "selected",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });

        ImgHome= (ImageView) findViewById(R.id.imgBtnHome);
        ImgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Home();
            }
        });

        ImgVoltaParaHome= (ImageButton) findViewById(R.id.ImgBtnVoltaHome);
        ImgVoltaParaHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Home();
            }
        });

        btnLogout= (Button) findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            //ligaçao entre resulta e tela de hotel
            public void onClick(View v) {
                TelaLogin();
            }
        });
    }

    private void initList(){
        mCountryList = new ArrayList<>();
        mCountryList.add(new ContryItem("RUS ", R.drawable.russia));
        mCountryList.add(new ContryItem("BRA ", R.drawable.brazil));
    }
    public void Home(){
        Intent voltarHome = new Intent(getApplicationContext(), Home.class);
        startActivity(voltarHome);
    }
    public void TelaLogin(){
        Intent voltarLogin = new Intent(getApplicationContext(), Activity2.class);
        startActivity(voltarLogin);
    }
}
