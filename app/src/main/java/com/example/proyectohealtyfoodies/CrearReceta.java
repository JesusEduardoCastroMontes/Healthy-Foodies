package com.example.proyectohealtyfoodies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class CrearReceta extends AppCompatActivity {
    private Button btnIngredientes, btnCrear;
    public EditText cajaPlatillo,areaPreparacion, areaDescripcion;
    SETANDGETS_RECETAS setandgets_recetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        areaDescripcion=findViewById(R.id.areaDescripcion);
        areaPreparacion=findViewById(R.id.areaPreparacion);
        btnCrear= findViewById(R.id.btnCrear);
        cajaPlatillo= findViewById(R.id.cajaPlatillo);
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
// conexion a base de datos y boton crear recceta
        btnCrear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            dbConexion conexion = new dbConexion(CrearReceta.this);
            try {
                setandgets_recetas= new SETANDGETS_RECETAS(-1, cajaPlatillo.getText().toString(), areaPreparacion.getText().toString(),areaDescripcion.getText().toString());
                Toast.makeText(CrearReceta.this, setandgets_recetas.toString(),Toast.LENGTH_LONG).show();
            }catch ( Exception e){
                Toast.makeText(CrearReceta.this,"Errror",Toast.LENGTH_LONG).show();
                setandgets_recetas = new SETANDGETS_RECETAS(-1,"error","descrpcion","preparacion");

            }//
            boolean listo = conexion.addOne(setandgets_recetas);
                Toast.makeText(CrearReceta.this, "listo="+ listo,Toast.LENGTH_LONG).show();
            }
        });

    }






    private void abrirControlIngredientes(){
        Intent intent = new Intent(this, ControlIngredientes.class);
        startActivity(intent);
    }
}

