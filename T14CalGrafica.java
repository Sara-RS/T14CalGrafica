package com.mycompany.t14calgrafica;

import Ventanas.VentanaPrincipal;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class T14CalGrafica {

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
                VentanaPrincipal v1= new VentanaPrincipal();
                v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                v1.setVisible(true);
            });
    }
}
