package com.example.edcustechnicaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Detail extends AppCompatActivity {


    Bundle datos;

    TextView detalles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datos = getIntent().getExtras();

        String name = datos.getString("nombre");
        String apellido = datos.getString("apellido");
        String pass = datos.getString("pass");

        detalles = findViewById(R.id.detalles);

        detalles.setText("Estas Registrado:  " + name + " "+ apellido + "  tu password es:  " + pass);


    }
}