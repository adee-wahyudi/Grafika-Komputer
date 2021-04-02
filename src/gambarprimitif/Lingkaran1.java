/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gambarprimitif;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author YUDI
 */
public class Lingkaran1 extends JComponent
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gambar Lingkaran");
        frame.setSize(425, 425);
        frame.add(new Lingkaran1());
        frame.setVisible(true);
    }
    public void paint(Graphics g){
        int r = 125;
        int d = (4 / 3) * r;
        int x = 0;
        int y = r;
        do {            
            g.setColor(Color.BLUE);
            g.drawLine(y + 200, x + 200, y + 200, x + 200);
            g.drawLine(x + 200, y + 200, x + 200, y + 200);
            g.drawLine(x + 200, -y + 200, x + 200, -y + 200);
            g.drawLine(y + 200, -x + 200, y + 200, -x + 200);
            g.drawLine(-y + 200, -x + 200, -y + 200, -x + 200);
            g.drawLine(-x + 200, -y + 200, -x + 200, -y + 200);
            g.drawLine(-x + 200, y + 200, -x + 200, y + 200);
            g.drawLine(-y + 200, x + 200, -y + 200, x + 200);
            if(d < 0){
                d = d + 2 * x + 3;
            }else{
                d = d + 2 * (x - y) + 5;
                y = y - 1;
            }
            x = x + 1;
        } while (x < y);
    }
}
