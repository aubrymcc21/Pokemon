import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class oak
{
    // instance variables - replace the example below with your own
    private int x[], y[];
    private Polygon pants, shirt, jacket, hands;
    
    public oak()
    {
        // initialise instance variables
        x = new int[] {};
        y = new int[] {};
        shirt = new Polygon(x, y, x.length);
        x = new int[] {};
        y = new int[] {};
        jacket = new Polygon(x, y, x.length);
        x = new int[] {};
        y = new int[] {};
        hands = new Polygon(x, y, x.length);
    }

    public void drawpants(Graphics2D g)
    {
        g.setColor(new Color(127, 121, 62));
        g.fillOval(320, 380, 60, 30);
        g.fillOval(320, 390, 28, 90);
        g.fillOval(350, 390, 28, 90);
        g.setColor(new Color(85, 60, 44));
        g.fillOval(310, 470, 35, 15);
        g.fillOval(353, 465, 20, 20);
        g.setColor(Color.BLACK);
        g.fillRect(320, 380, 60, 10);
        g.setColor(Color.WHITE);
        g.fillRect(345, 382, 10, 6);
    }
    
    public void drawshirt(Graphics2D g)
    {
        g.setColor(new Color(171, 147, 221));
        g.fillRect(320, 300, 60, 80);
        g.setColor(Color.BLACK);
        g.drawRect(320, 300, 60, 80);
        g.setColor(new Color(172, 143, 139));
        g.fillOval(340, 290, 20, 20);
        g.setColor(Color.BLACK);
        g.drawOval(340, 290, 20, 20);
    }
    
    public void drawjacket(Graphics2D g)
    {
        g.setColor(Color.WHITE);
        g.fillOval(310, 300, 20, 100);
        g.fillOval(370, 300, 20, 100);
        g.setColor(Color.BLACK);
        g.drawOval(310, 300, 20, 100);
        g.drawOval(370, 300, 20, 100);
        g.setColor(Color.WHITE);
        g.fillRect(320, 300, 20, 120);
        g.fillRect(360, 300, 20, 120);
        g.setColor(Color.BLACK);
        g.drawRect(320, 300, 20, 120);
        g.drawRect(360, 300, 20, 120);
    }
    
    public void drawtherest(Graphics2D g)
    {
        g.setColor(new Color(226, 219, 180));
        g.fillOval(328,246,44,55);
        g.setColor(new Color(247, 216, 195));
        g.fillOval(330, 250, 40, 55);
        g.setColor(Color.WHITE);
        g.fillOval(335, 270, 8, 12);
        g.fillOval(357, 270, 8, 12);
        //eyes
        g.setColor(Color.BLACK);
        g.fillOval(338, 270, 5, 12);
        g.fillOval(357, 270, 5, 12);
        g.fillRect(335, 265, 10, 3);
        g.fillRect(357, 265, 10, 3);
        g.drawArc(337, 287, 23, 6, 180, 180);
        //eyes/mouth/eyebrows/belt
        g.setColor(new Color(226, 219, 180));
        g.fillOval(327, 248, 37, 9);
        //hair
        
    }
}
