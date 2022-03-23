package com.marcos;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GuiMethods {
    JFrame marco;
    JPanel panel;
    JButton boton1,boton2;
    JTextField celda1,celda2;
    JLabel texto1,texto2;
    JTextArea areaTexto;


    public void exercicioGUI(){
        marco = new JFrame("BOLETIN 26");
        panel = new JPanel();
        boton1 = new JButton("PREMER");
        boton2 = new JButton("LIMPAR");
        celda1 = new JTextField();
        celda2 = new JTextField();
        texto1 = new JLabel("NOME");
        texto2 = new JLabel("PASSWORD");
        areaTexto = new JTextArea("Area de texto...");



        texto1.setBounds(100,100,100,25);
        texto2.setBounds(100,150,100,25);
        celda1.setBounds(250,100,200,25);
        celda2.setBounds(250,150,200,25);
        areaTexto.setBounds(90,200,325,100);
        areaTexto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        boton1.setBounds(130,350,150,50);
        boton2.setBounds(330,350,150,50);



        panel.add(texto1);
        panel.add(texto2);
        panel.add(celda1);
        panel.add(celda2);
        panel.add(areaTexto);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);




        panel.setLayout(null);
        panel.setSize(600,600);
        marco.setSize(650,650);
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

}
