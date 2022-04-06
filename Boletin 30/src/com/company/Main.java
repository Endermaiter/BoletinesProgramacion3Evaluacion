package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Calculadora();
                frame.setSize(300,400);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }
}
