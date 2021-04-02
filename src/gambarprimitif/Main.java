/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gambarprimitif;

import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author ADE
 */
public class Main extends JComponent{
    public static void main(String[] args) {
        JFrame f = new JFrame("Gambar Primitif");
        f.setSize(600,600);
        f.add(new Main());
        f.setVisible(true);
    }
    public void paint(Graphics g){
        Garis(g);
        lineDDA(30,50,130,170,g);
    }

    private void lineDDA(int x0, int y0, int xEnd, int yEnd, Graphics g) {
        int dx = xEnd - x0, dy = yEnd - y0, steps, k;
        float xIncrement, yIncrement, x = x0, y = y0;
        if (Math.abs(dx) > Math.abs(dy)) {
            steps = Math.abs(dx);
        }else{
            steps = Math.abs(dy);
        }
        xIncrement = (float) dx / (float) steps;
        yIncrement = (float) dy / (float) steps;
        g.drawLine(Math.round(x), Math.round(y), Math.round(x), Math.round(y));
        for ( k = 0; k < steps; k++) {
            x += xIncrement;
            y += yIncrement;
            g.drawLine(Math.round(x), Math.round(y), Math.round(x), Math.round(y));
        }
    }
    
    private void Garis(Graphics g) {
        int x0 = 100, y0 = 120, x1 = 200, y1 = 230;
        int dx = x1 - x0, dy = y1 - y0;
        int x = 0, xEnd = 0;
        float y = 0;
        float m = (float)dy/(float)dx;
        float b = y0 - m * x0;
        if(dx < 0){x = x1; y = y1; xEnd = x0;}
        if(dx > 0){x = x0; y = y0; xEnd = x1;}
        while(x <= xEnd){
            g.drawLine(x, Math.round(y), x, Math.round(y));
            System.out.println(x);
            System.out.println(y);
            x++;
            y = m * x + b;
        }
    }
}
