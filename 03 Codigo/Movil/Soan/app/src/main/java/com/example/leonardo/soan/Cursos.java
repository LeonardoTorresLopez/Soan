package com.example.leonardo.soan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by Leonardo on 23/02/2017.
 */

public class Cursos extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.asignacion);
        WebView wbCursos = (WebView)findViewById(R.id.WVCursos);
        wbCursos.loadUrl("http://www.agirregabiria.net/g/sylvainaitor/principito.pdf");
        Button mButonCurso = (Button)findViewById(R.id.buttonUnidad);
        mButonCurso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),TestJava.class);
                startActivity(I);
            }
        });
    }
}
