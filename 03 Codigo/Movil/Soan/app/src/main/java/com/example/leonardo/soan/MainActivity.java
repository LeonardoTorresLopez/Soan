package com.example.leonardo.soan;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.zip.Inflater;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final Intent i = new Intent(this, Cursos.class);
        setContentView(R.layout.activity_main);

        Button buttonCurso = (Button) findViewById(R.id.buttonCurso);
        buttonCurso.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(i);
            }
        });
    }



}
