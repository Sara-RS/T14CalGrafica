package Componentes;

import java.awt.Graphics;
import javax.swing.JComponent;

public class Componente1 extends JComponent{
    @Override
    public void paintComponent(Graphics g){
        g.drawString("Y1=2X^(2-3)", 2, 2);
        g.drawString("X=0", 2, 200);
        g.drawString("Y=-3", 200, 200);
        g.drawLine(200, 2 ,200 ,200);
        g.drawLine(2, 100, 398, 100);
        g.drawOval(200, -120, 50, 240);

    }
}
