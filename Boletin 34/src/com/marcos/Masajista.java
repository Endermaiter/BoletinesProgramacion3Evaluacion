package com.marcos;

public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int añosExperiencia;

    public Masajista() {
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int añosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString()+"Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", añosExperiencia=" + añosExperiencia +
                '}';
    }

    public void darMasaje(){
        System.out.println("O masaxista da masaxes");
    }
}
