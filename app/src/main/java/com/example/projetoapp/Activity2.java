package com.example.projetoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
private Button BtnEntrar;

    EditText senha;
    CheckBox visibilidadeSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        senha=findViewById(R.id.BoxSenha);
        visibilidadeSenha=findViewById(R.id.ckBoxShowSenha);

        visibilidadeSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    senha.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    senha.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
            BtnEntrar=(Button) findViewById(R.id.BtnEntrar);
            BtnEntrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View v){
                Home();
            }
            });
        }
            public void Home() {
                Intent inicio = new Intent(getApplicationContext(), Home.class);
                startActivity(inicio);
            }
    }
