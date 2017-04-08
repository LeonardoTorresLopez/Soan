package com.example.leonardo.soan.http;

import android.util.Log;

import org.springframework.http.converter.xml.SimpleXmlHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import com.example.leonardo.soan.model.alumnoJson;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class HttpRetriever {

    /**
     * Este método devuelve el resultado completo de un HTTP response.
     *
     * @param url La URL de la que se requiere recuperar el HTTP response.
     * @return El contenido del HTTP response.
     */
    public String retrieve(String url) {
        String nodo="";
        try {
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(new SimpleXmlHttpMessageConverter());

            alumnoJson alumno = restTemplate.getForObject(url, alumnoJson.class);
            return alumno.Json;

        } catch(Exception ex){
            Log.e("EXCEPCION", "Método Retrieve" + ex.getMessage());
            return null;
        }

    }
}
