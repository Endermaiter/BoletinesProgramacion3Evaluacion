package com.marcos;

public class Seleccionador extends SeleccionFutbol{

    public Seleccionador() {
    }

    public Seleccionador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    @Override
    public String toString() {
        return "Seleccionador{"+super.toString()+"}";
    }
}
