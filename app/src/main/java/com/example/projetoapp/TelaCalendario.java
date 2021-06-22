package com.example.projetoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.TextView;

public class TelaCalendario extends AppCompatActivity {
    Button btnCancelaVolta;
    Button btnConfimaVolta;
    TextView txtviewCheckin;
    TextView txtviewCheckOut;
    CalendarView calendarDataReserva;

    //public static final String EXTRA_TEXT="com.exemple.application.exameple.projetoapp";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_calendario);

        CalendarView calendarDataReserva = (CalendarView) findViewById(R.id.calendarDataReserva);
        txtviewCheckin=(TextView)findViewById(R.id.txtviewCheckin);
        txtviewCheckOut=(TextView)findViewById(R.id.txtviewCheckOut);



        calendarDataReserva.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int anos, int meses, int dias) {
                String mes;
                if(meses==1){
                    mes="Jan";
                }
                else  if(meses==2){
                    mes="Feb";
                }
                else  if(meses==3){
                    mes="Mar";
                }
                else  if(meses==4){
                    mes="Abr";
                }
                else  if(meses==5){
                    mes="Mai";
                }
                else  if(meses==6){
                    mes="Jun";
                }
                else  if(meses==7){
                    mes="Jul";
                }
                else  if(meses==8){
                    mes="Ago";
                }
                else  if(meses==9){
                    mes="Set";
                }
                else  if(meses==10){
                    mes="Out";
                }
                else  if(meses==11){
                    mes="Nov";
                }
                else {
                    mes="Dez";
                }

                String data=dias+" De "+mes;
                String dataOut=(dias+2)+" De "+mes;

                txtviewCheckin.setText(data);
                txtviewCheckOut.setText(dataOut);

                String dataInOut="Check in "+data+"Check Out "+dataOut;

                GlobalClass globalClass=(GlobalClass)getApplicationContext();
                globalClass.setDataInOut(dataInOut);
            }
        });

        btnConfimaVolta= (Button) findViewById(R.id.btnConfimaVolta);
        btnConfimaVolta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reserva = new Intent(getApplicationContext(), TelaHotel.class);
                startActivity(reserva);

            }
        });


        btnCancelaVolta= (Button) findViewById(R.id.btnCancelaVolta);
        btnCancelaVolta.setOnClickListener(new View.OnClickListener() {
            @Override
            //ligaçao para tela de hotel
            public void onClick(View v) {
                TelaHotel();
            }
        });
    }

    public void TelaHotel(){
        Intent reserva = new Intent(getApplicationContext(), TelaHotel.class);
        startActivity(reserva);
    }
}