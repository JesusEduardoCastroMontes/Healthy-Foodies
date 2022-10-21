package com.example.proyectohealtyfoodies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ControlIngredientes extends AppCompatActivity {
    private ListView listaIngredientes;
    private Button btnAgregar;
    private EditText itemEdt;
    private ArrayList<String> lngList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_ingredientes);
        listaIngredientes = findViewById(R.id.idLVLanguages);
        btnAgregar = findViewById(R.id.idBtnAdd);
        itemEdt = findViewById(R.id.idEdtItemName);
        lngList = new ArrayList<>(); // Cada Ingrediente se almacena en un ArrayList

        /* items de Ejemplo
        lngList.add("C++");
        lngList.add("Python");*/

        // Estamos inicializando el adaptador para nuestra vista de lista.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lngList);

        // Establecemos el adaptador en la lista
        listaIngredientes.setAdapter(adapter);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtenemos el texto del edittext
                String ingrediente = itemEdt.getText().toString();
                if (!ingrediente.isEmpty()) {
                    lngList.add(ingrediente);
                    // notificamos al adaptador que si se actualizan datos en la lista
                    // se debe actualizar la vista de la lista de los ingredientes
                    adapter.notifyDataSetChanged();
                }
            }
        });
    }
}