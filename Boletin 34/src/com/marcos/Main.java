package com.marcos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        SeleccionFutbol fut = new Futbolista(387,"aaa","aaa",25,10,"Centro");
        SeleccionFutbol ent = new Entrenador(578,"bbb","bbb",30,353);
        SeleccionFutbol mas = new Masajista(567865,"ccc","ccc",50,"Masajista PRO",3);
        SeleccionFutbol sel = new Seleccionador(867,"ddd","ddd",67);

        ArrayList<SeleccionFutbol>miembros = new ArrayList<>();
        miembros.add(fut);
        miembros.add(ent);
        miembros.add(mas);
        miembros.add(sel);

        System.out.println(fut+"\n"+ent+"\n"+mas+"\n"+sel);
        System.out.println("\n");
        for(int i=0; i<miembros.size();i++){
            System.out.println(miembros.get(i));
        }


    }
}
