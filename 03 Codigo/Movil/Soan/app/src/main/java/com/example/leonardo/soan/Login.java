package com.example.leonardo.soan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.leonardo.soan.http.HttpRetriever;
import com.example.leonardo.soan.model.alumno_log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


/**
 * Created by Dalian Inferno on 03/04/2017.
 */

public class Login extends AppCompatActivity {
    String NControl="";
    String Pass="";
    String result = "";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);
        final EditText usuario = (EditText) findViewById(R.id.textUSer);
        final EditText pass = (EditText) findViewById(R.id.textPass);
        Button btnAcceso=(Button)findViewById(R.id.bntAcceso);
        btnAcceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NControl=usuario.getText().toString();
                Pass=pass.getText().toString();
                acceder(NControl,Pass);
            }
        });



    }
    public void acceder(String NumContr,String passw){
        try {


            //Mandar realizar la busqueda del alumno
            HttpRetriever http = new HttpRetriever();
            result = http.retrieve("http://sicenet.itsur.edu.mx:82/ws/wsalumnos.asmx/accesoLogin?strMatricula="+NumContr+"&strContrasenia="+passw+"&tipoUsuario=0");
        }catch (Exception ex){
            Log.e("DIBG",ex.getMessage());
        }
        try{
            //pasar el alumno a un objeto
            Gson gson = new GsonBuilder().create();
            alumno_log queryResults = gson.fromJson(result, alumno_log.class);
            if (queryResults.acceso){
                Intent I = new Intent(this,Cursos.class);
                startActivity(I);
            }else{
                Toast.makeText(this,"Usuario y/o Contraseña equivocados",Toast.LENGTH_LONG).show();
            }}catch (Exception e){
            Log.e("error",e.getMessage());
        }
    }
}