package com.example.leonardo.soan;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Leonardo on 14/03/2017.
 */


public class TestJava extends AppCompatActivity {

    int NumeroInt = 1;
    Random r = new Random();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);
        final TextView pregunta = (TextView) findViewById(R.id.titulo);
        final RadioButton R1 = (RadioButton) findViewById(R.id.R1);
        final RadioButton R2 = (RadioButton) findViewById(R.id.R2);
        final RadioButton R3 = (RadioButton) findViewById(R.id.R3);
        final RadioButton R4 = (RadioButton) findViewById(R.id.R4);
        TabLayout tabs = (TabLayout) findViewById(R.id.Tabs);
        tabs.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabs.addTab(tabs.newTab().setText("1"));
        tabs.addTab(tabs.newTab().setText("2"));
        tabs.addTab(tabs.newTab().setText("3"));
        tabs.addTab(tabs.newTab().setText("4"));
        tabs.addTab(tabs.newTab().setText("5"));
        tabs.addTab(tabs.newTab().setText("6"));
        tabs.addTab(tabs.newTab().setText("7"));
        tabs.addTab(tabs.newTab().setText("8"));
        tabs.addTab(tabs.newTab().setText("9"));
        tabs.addTab(tabs.newTab().setText("10"));
        final String[] Preguntas = new String[10];
        final String[] RespuestasI = new String[40];
        final String[] RespuestasC = new String[10];
        Preguntas[0] = "Pregunta 1";
        Preguntas[1] = "Pregunta 2";
        Preguntas[2] = "Pregunta 3";
        Preguntas[3] = "Pregunta 4";
        Preguntas[4] = "Pregunta 5";
        Preguntas[5] = "Pregunta 6";
        Preguntas[6] = "Pregunta 7";
        Preguntas[7] = "Pregunta 8";
        Preguntas[8] = "Pregunta 9";
        Preguntas[9] = "Pregunta 10";
        RespuestasI[0] = "arbol";
        RespuestasI[1] = "casa";
        RespuestasI[2] = "coc";
        RespuestasI[3] = "feo";
        RespuestasI[4] = "carro";
        RespuestasI[5] = "luz";
        RespuestasI[6] = "pepe";
        RespuestasI[7] = "taco";
        RespuestasI[8] = "no";
        RespuestasI[9] = "verdadero";
        RespuestasI[10] = "falso";
        RespuestasI[11] = "estatuto";
        RespuestasI[12] = "cruz";
        RespuestasI[13] = "dedo";
        RespuestasI[14] = "dado";
        RespuestasI[15] = "doko";
        RespuestasI[16] = "chaka";
        RespuestasI[17] = "Joselyne";
        RespuestasI[18] = "Federico";
        RespuestasI[19] = "CCCCCC";
        RespuestasI[20] = "CCCCCC";
        RespuestasI[21] = "CCCCCC";
        RespuestasI[22] = "CCCCCC";
        RespuestasI[23] = "CCCCCC";
        RespuestasI[24] = "CCCCCC";
        RespuestasI[25] = "CCCCCC";
        RespuestasI[26] = "CCCCCC";
        RespuestasI[27] = "CCCCCC";
        RespuestasI[28] = "CCCCCC";
        RespuestasI[29] = "CCCCCC";

        RespuestasC[0] = "Verde";
        RespuestasC[1] = "Azul";
        RespuestasC[2] = "Cafe";
        RespuestasC[3] = "Chocolate";
        RespuestasC[4] = "Gris";
        RespuestasC[5] = "Fiusha";
        RespuestasC[6] = "cafe";
        RespuestasC[7] = "Rosa";
        RespuestasC[8] = "Rojo";
        RespuestasC[9] = "Naranja";
        pregunta.setText(Preguntas[NumeroInt - 1]);

        R1.setText(RespuestasI[r.nextInt(29)]);
        R2.setText(RespuestasI[r.nextInt(29)]);
        R3.setText(RespuestasI[r.nextInt(29)]);
        R4.setText(RespuestasC[NumeroInt - 1]);


        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                String NumeroStr = tab.getText().toString();
                NumeroInt = Integer.parseInt(NumeroStr);


                pregunta.setText(Preguntas[NumeroInt - 1]);

                R1.setText(RespuestasI[r.nextInt(29)]);
                R2.setText(RespuestasI[r.nextInt(29)]);
                R3.setText(RespuestasI[r.nextInt(29)]);
                R4.setText(RespuestasC[NumeroInt - 1]);
                TabLayout.Tab tab1 = tab;

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();


        switch (view.getId()) {
            case R.id.R1:
                if (checked)

                    break;
            case R.id.R2:
                if (checked)
                    break;
        }
    }
}