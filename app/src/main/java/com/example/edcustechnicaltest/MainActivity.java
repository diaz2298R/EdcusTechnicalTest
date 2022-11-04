package com.example.edcustechnicaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


     Persona persona;
     EditText name , lastName , password;

     Button send ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        lastName = findViewById(R.id.lastName);
        password = findViewById(R.id.passcofirn);

        send = findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrirDetalles = new Intent(MainActivity.this,Detail.class);
                abrirDetalles.putExtra("nombre",name.getText().toString());
                abrirDetalles.putExtra("apellido",lastName.getText().toString());
                abrirDetalles.putExtra("pass",password.getText().toString());
                startActivity(abrirDetalles);



            }
        });



















    }
}