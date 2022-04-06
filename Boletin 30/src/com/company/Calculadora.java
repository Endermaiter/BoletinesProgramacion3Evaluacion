package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JButton Boton7;
    private JButton Boton8;
    private JButton Boton4;
    private JButton Boton1;
    private JButton Boton0;
    private JButton Boton5;
    private JButton Boton2;
    private JButton BotonPunto;
    private JButton Boton9;
    private JButton BotonDividir;
    private JButton Boton6;
    private JButton BotonMultiplicar;
    private JButton BotonRestar;
    private JButton Boton3;
    private JButton BotonIgual;
    private JButton BotonSumar;
    private JButton BotonAC;
    private JButton BotonOFF;

    public Calculadora() {
        setContentPane(panel1);
        BotonOFF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        BotonAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        Boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"1");
            }
        });
        Boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"2");
            }
        });
        Boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"3");
            }
        });
        Boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"4");
            }
        });
        Boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"5");
            }
        });
        Boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"6");
            }
        });
        Boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"7");
            }
        });
        Boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"8");
            }
        });
        Boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"9");
            }
        });
        Boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"0");
            }
        });
        BotonPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        BotonDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        BotonMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        BotonRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        BotonSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        BotonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });








    }
}
