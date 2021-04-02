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
public class Lingkaran2 extends JComponent{
    int xc = 0;
    int yc = 0;
    public void Lingkaran2(){
        xc = 200 / 2;
        yc = 200 / 2;
    }
    public void paint(Graphics g){
        int r = 180;
        int x = 0;
        int y = 0;
        for(int i = 0; i <= 360; i++){
            x = (int)((Math.cos((int)i) * r) + xc);
            y = (int)((Math.sin((int)i) * r) + yc);
            g.setColor(Color.BLUE);
            g.drawLine(x + 200, y + 200, x + 200, y + 200);
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gambar Lingkaran");
        frame.setSize(450, 450);
        frame.add(new Lingkaran2());
        frame.setVisible(true);
    }
}
