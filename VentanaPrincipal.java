package Ventanas;

import Componentes.Componente1;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame{
    public VentanaPrincipal() throws HeadlessException {
        setSize(400,650);
        setTitle("CALCULADORA GRAFICA");
        setLocation(200,100);
        
        setLayout(new BorderLayout());
        var panel = new JPanel();
        var panel1 = new JPanel();
        
        panel.setLayout(new GridLayout(10,5));
        //botones
        panel.add(new JButton("Y="));
        panel.add(new JButton("WINDOW"));
        panel.add(new JButton("ZOOM"));
        panel.add(new JButton("TRACE"));
        panel.add(new JButton("GRAPH"));
        panel.add(new JButton("2ND"));
        panel.add(new JButton("MODE"));
        panel.add(new JButton("DEL"));
        panel.add(new JButton("<-"));
        panel.add(new JButton("->"));
        panel.add(new JButton("ALPHA"));
        panel.add(new JButton("X,T,O,n"));
        panel.add(new JButton("STAT"));
        panel.add(new JButton(" ^ "));
        panel.add(new JButton(" v "));
        panel.add(new JButton("MATH"));
        panel.add(new JButton("APPS"));
        panel.add(new JButton("PRGM"));
        panel.add(new JButton("VARS"));
        panel.add(new JButton("CLEAR"));
        panel.add(new JButton("X-1"));
        panel.add(new JButton("SIN"));
        panel.add(new JButton("COS"));
        panel.add(new JButton("TAN"));
        panel.add(new JButton("^"));
        panel.add(new JButton("X2"));
        panel.add(new JButton(","));
        panel.add(new JButton(" ( "));
        panel.add(new JButton(" ) "));
        panel.add(new JButton("/"));
        panel.add(new JButton("LOG"));
        panel.add(new JButton(" 7 "));
        panel.add(new JButton(" 8 "));
        panel.add(new JButton(" 9 "));            
        panel.add(new JButton(" * "));
        panel.add(new JButton("LN"));
        panel.add(new JButton(" 4 "));
        panel.add(new JButton(" 5 "));
        panel.add(new JButton(" 6 "));
        panel.add(new JButton(" - "));
        panel.add(new JButton("STO"));
        panel.add(new JButton(" 1 "));
        panel.add(new JButton(" 2 "));
        panel.add(new JButton(" 3 "));
        panel.add(new JButton(" + "));
        panel.add(new JButton("ON"));
        panel.add(new JButton(" 0 "));
        panel.add(new JButton(" . "));
        panel.add(new JButton("(-)"));
        panel.add(new JButton("ENTER"));
        
        add(panel,BorderLayout.CENTER);
        Componente1 c= new Componente1();
        panel1.add(c);
        add(panel1,BorderLayout.NORTH);
    }
}
