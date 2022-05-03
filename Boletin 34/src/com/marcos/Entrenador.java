package com.marcos;

public class Entrenador extends SeleccionFutbol{

    private int idFederacion;

    public Entrenador() {
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return super.toString()+"Entrenador{" +
                "idFederacion=" + idFederacion +
                '}';
    }

    public void planificarEntrenamiento(){
        System.out.println("O adestrador planifica o adestramento");
    }
}
