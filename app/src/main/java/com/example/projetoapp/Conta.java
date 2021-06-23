package com.example.projetoapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Conta extends AppCompatActivity {
    private ArrayList<ContryItem> mCountryList;
    private ContryAdapter mAdapter;


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
    }

    private void initList(){
        mCountryList = new ArrayList<>();
        mCountryList.add(new ContryItem("RUS ", R.drawable.russia));
        mCountryList.add(new ContryItem("BRA ", R.drawable.brazil));
    }
}
