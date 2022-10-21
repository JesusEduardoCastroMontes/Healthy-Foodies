package com.example.proyectohealtyfoodies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CrearReceta extends AppCompatActivity {
    private Button btnIngredientes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_receta);
        // Mostrar Logo
        ImageView Logo = (ImageView)findViewById(R.id.logo);
        Logo.setImageResource(R.drawable.logo);// establecer la fuente en la clase java

        // Acciones del boton
        btnIngredientes = (Button) findViewById(R.id.btnIngredientes);
        btnIngredientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirControlIngredientes();
            }
        });
    }

    private void abrirControlIngredientes(){
        Intent intent = new Intent(this, ControlIngredientes.class);
        startActivity(intent);
    }
}