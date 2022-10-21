package com.example.proyectohealtyfoodies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnAbrirCrearReceta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Acciones del boton
        btnAbrirCrearReceta = (Button) findViewById(R.id.btnAbrirCrearReceta);
        btnAbrirCrearReceta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirCrearReceta();
            }
        });
    }

    private void abrirCrearReceta(){
        Intent intent = new Intent(this, CrearReceta.class);
        startActivity(intent);
    }
}