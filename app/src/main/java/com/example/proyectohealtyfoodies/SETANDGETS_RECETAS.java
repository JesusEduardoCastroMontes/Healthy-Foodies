package com.example.proyectohealtyfoodies;

public class SETANDGETS_RECETAS {
    public SETANDGETS_RECETAS(int id, String nombre, String descripcion, String preparacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.preparacion = preparacion;
    }

    public int id;
    public String nombre;
    public String descripcion;
    public String preparacion;
// sdaaa
    @Override
    public String toString() {
        return "SETANDGETS_RECETAS{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", preparacion='" + preparacion + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }
}
