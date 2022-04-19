package com.marcos;

import javax.swing.*;
import java.awt.*;

public class GuiMethods {
    JFrame marco;
    JPanel panel,panel2;
    JButton boton1, boton2, boton3;
    JTextField celda1, celda2;
    JLabel texto1, texto2;
    JTextArea areaTexto,areaTexto2;
    JList lista;


    public void exercicioGUI() {

        //panel 1

        marco = new JFrame("BOLETIN 26");
        panel = new JPanel();
        boton1 = new JButton("PREMER");
        boton2 = new JButton("LIMPAR");
        celda1 = new JTextField();
        celda2 = new JTextField();
        texto1 = new JLabel("NOME");
        texto2 = new JLabel("PASSWORD");
        areaTexto = new JTextArea("Area de texto...");

        //panel 2

        panel2 = new JPanel();
        boton3 = new JButton("BOTON");
        areaTexto2 = new JTextArea("Area de Texto...");
        lista = new JList<>();

        //panel 1

        texto1.setBounds(100, 100, 100, 25);
        texto2.setBounds(100, 150, 100, 25);
        celda1.setBounds(250, 100, 200, 25);
        celda2.setBounds(250, 150, 200, 25);
        boton1.setBounds(130, 350, 150, 50);
        boton2.setBounds(330, 350, 150, 50);

        //panel 2

        lista.setBounds(50,500,200,200);
        lista.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        boton3.setBounds(300,575,100,50);
        areaTexto2.setBounds(450,525,150,175);
        areaTexto2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        //panel 1

        panel.add(texto1);
        panel.add(texto2);
        panel.add(celda1);
        panel.add(celda2);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);

        //panel 2

        DefaultListModel modelo = new DefaultListModel<>(); //para añadir elemento a un JList usamos un modelo
            modelo.addElement("ElementoLista1\n");
            modelo.addElement("ElementoLista2\n");
            modelo.addElement("ElementoLista3\n");
        lista.setModel(modelo);
        panel2.add(lista);
        panel2.add(boton3);
        panel2.add(areaTexto2);
        marco.add(panel2);

        //panel 1

        panel.setLayout(null);
        panel.setSize(600, 500);

        //panel 2
        panel2.setLayout(null);
        panel2.setSize(600,700);

        //caracteristicas del marco

        marco.setSize(650, 1300);
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
