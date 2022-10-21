package com.example.proyectohealtyfoodies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ControlRecetas extends AppCompatActivity {
    private Button btnCrear;
    private Button btnEliminar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_recetas);

        btnCrear = (Button) findViewById(R.id.btn1);
        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirCrearRecetas();
            }
        });

        btnEliminar = (Button) findViewById(R.id.btn3);
        btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirEliminarRecetas();
            }
        });
    }

    public void abrirCrearRecetas(){
        Intent intent = new Intent(this, CrearReceta.class);
        startActivity(intent);
    }


    public void abrirEliminarRecetas(){
        Intent intent = new Intent(this, EliminarReceta.class);
        startActivity(intent);
    }
}