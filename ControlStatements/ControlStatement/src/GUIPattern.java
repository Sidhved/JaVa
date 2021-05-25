package ControlStatements.ControlStatement.src;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GUIPattern extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        for(int i =0; i<15; i++){
            g.drawLine(0, 0, (i*width/15), height-(i*width/15));
        }
    }
}
