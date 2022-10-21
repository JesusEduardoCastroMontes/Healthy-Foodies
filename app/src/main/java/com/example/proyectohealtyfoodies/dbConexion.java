package com.example.proyectohealtyfoodies;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbConexion extends SQLiteOpenHelper {

    public static final String RECETA_TABLA = "Receta_tabla";
    public static final String COLUMNA_NOMBRE_TEXT = "NOMBRE TEXT";
    public static final String COLUMNA_DESCRIPCION_TEXT = "DESCRIPCION TEXT";
    public static final String COLUMNA_PREPARACION_TEXT = "PREPARACION TEXT";
    public static final String COLUMNA_ID_INTEGER_PRIMARY_KEY_AUTOINCREMENT = "ID INTEGER PRIMARY KEY AUTOINCREMENT";

    public dbConexion(@Nullable Context context) {
        super(context, "app.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + RECETA_TABLA + " (" + COLUMNA_ID_INTEGER_PRIMARY_KEY_AUTOINCREMENT + ", " + COLUMNA_NOMBRE_TEXT + "," +
                COLUMNA_DESCRIPCION_TEXT + ", " + COLUMNA_PREPARACION_TEXT + "  )";
                db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
//
    public boolean addOne(SETANDGETS_RECETAS setandgets_recetas){
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues cv =  new ContentValues();
        cv.put(COLUMNA_NOMBRE_TEXT, setandgets_recetas.getNombre());
        cv.put(COLUMNA_NOMBRE_TEXT, setandgets_recetas.getDescripcion());
        cv.put(COLUMNA_NOMBRE_TEXT, setandgets_recetas.getPreparacion());

        long insert = db.insert(RECETA_TABLA, null, cv);
        if (insert==-1){
            return false;
        }else {
            return true;
        }
    }


}