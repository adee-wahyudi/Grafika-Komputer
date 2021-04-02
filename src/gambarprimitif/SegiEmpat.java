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
public class SegiEmpat extends JComponent{
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.drawLine(300, 300, 100, 300);
        g.drawLine(300, 300, 300, 100);
        g.drawLine(300, 100, 100, 100);
        g.drawLine(100, 300, 100, 100);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gambar Segi Empat");
        frame.setSize(500, 500);
        frame.add(new SegiEmpat());
        frame.setVisible(true);
    }
}
