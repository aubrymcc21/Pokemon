import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class menu
{
    // instance variables - replace the example below with your own
    private int x[], y[], px, py, px1, py1;
    private Polygon p, k, dash, m, n;
    private Rectangle play, instructions, quit;
    private String string;
    public menu()
    {
        // initialise instance variables
        px = 166;
        py = 130;
        x = new int[] {px, px+70, px+80, px+40, px+45, px+30, px};
        y = new int[] {py, py-15, py+30, py+45, py+100, py+105, py};
        p = new Polygon(x, y, x.length);
        px = 266;
        py = 130;
        x = new int[] {px, px+15, px+20, px+35, px+45, px+25, px+70, px+70, px+20, px+20, px};
        y = new int[] {py-5, py-10, py+20, py-10, py+8, py+35, py+70, py+90, py+50, py+80, py+82};
        k = new Polygon(x, y, x.length);
        px = 302;
        py = 125;
        x = new int[]{px+14, px+27, px+32};
        y = new int[]{py-5, py-20, py-10};
        dash = new Polygon(x, y, x.length);
        px = 346;
        py = 200;
        x = new int[] {px, px+7, px+17, px+21, px+25, px+33, px+39, px+30, px+25, px+19,  px+13, px+11};
        y = new int[] {py, py-70, py-70, py-50, py-73, py-74, py+15, py+12, py-20, py-13, py-22, py+2};
        m = new Polygon(x, y, x.length);
        px = 428;
        py = 135;
        x = new int[] {px, px+20, px+30, px+35, px+55, px+45, px+30, px+20, px+18, px+5};
        y = new int[] {py, py+5, py+30, py+8, py+10, py+80, py+77, py+40, py+70, py+70};
        n = new Polygon(x, y, x.length);
        px1 = 302;
        py1 = 125;
        px = 166;
        py = 130;
        play = new Rectangle(225, 350, 250, 50);
        instructions = new Rectangle(225, 450, 250, 50);
        quit = new Rectangle(225, 550, 250, 50);
        string = "PLAY";
        Font stringFont = new Font("Arial", Font.PLAIN, 30);
    }

    public void drawmen(Graphics2D g)
    {
        g.setColor(Color.BLACK);
        g.drawRect(0,640,800,20);
        g.setColor(new Color(184, 252, 212));
        g.fillRect(0, 105, 800, 135);
        g.setColor(new Color(255, 187, 5)); //yellow
        g.fill(p);
        g.setColor(new Color(19, 67, 135)); //blue
        g.draw(p);
        g.setColor(new Color(184, 252, 212));
        g.fillArc(px+20, py+10, 30, 20, -80, 180); //hole in p
        g.setColor(new Color(19, 67, 135));
        g.drawArc(px+20, py+10, 30, 20, -80, 180);
        g.setColor(new Color(255, 187, 5));
        g.fill(k);
        g.setColor(new Color(19, 67, 135));
        g.draw(k);
        g.setColor(new Color(255, 187, 5));
        g.fillOval(px+45,py+35, 60, 60); //first o
        g.setColor(new Color(19, 67, 135));
        g.drawOval(px+45,py+35, 60, 60);
        g.fillOval(px+67, py+52, 20, 20); //hole in o
        g.setColor(new Color(255, 187, 5));
        g.fillOval(px+75,py+51, 12, 12); //hole in hole in o
        g.setColor(new Color(255, 187, 5));
        g.fill(m);
        g.setColor(new Color(19, 67, 135));
        g.draw(m);
        g.setColor(new Color(255, 187, 5));
        g.fillRect(px1, py1+40, 50, 20); //e
        g.setColor(new Color(19, 67, 135));
        g.drawRect(px1, py1+40, 50, 20);
        g.setColor(new Color(255, 187, 5));
        g.fillArc(px1, py1, 50, 80, 20, 180);
        g.fill(dash);
        g.setColor(new Color(184, 252, 212));
        g.fillArc(px1+15, py1+15, 20, 30, 20, 180);
        g.setColor(new Color(19, 67, 135));
        g.drawArc(px1, py1, 50, 80, 20, 180);
        g.drawArc(px1+15, py1+15, 20, 30, 20, 180);
        g.draw(dash);
        g.setColor(new Color(255, 187, 5));
        g.fill(n);
        g.setColor(new Color(19, 67, 135));
        g.draw(n);
        g.setColor(new Color(255, 187, 5));
        g.fillOval(px+210,py+18, 60, 60); //second o
        g.setColor(new Color(19, 67, 135));
        g.drawOval(px+210,py+18, 60, 60);
        g.fillOval(px+232, py+35, 20, 20); //hole in o
        g.setColor(new Color(255, 187, 5));
        g.fillOval(px+240,py+34, 12, 12); //hole in hole in o

        g.setColor(Color.WHITE);
        g.fill(play);
        g.fill(instructions);
        g.fill(quit);
        g.setColor(new Color(255, 187, 5));
        g.draw(play);
        g.draw(instructions);
        g.draw(quit);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Impact", Font.PLAIN, 30));
        g.drawString("P L A Y", 315, 385);
        g.drawString("INSTRUCTIONS", 265, 485);
        g.drawString("QUIT", 320, 585);
    }

    public Rectangle getplay()
    {
        return play;
    }

    public Rectangle getinstructions()
    {
        return instructions;
    }

    public Rectangle getquit()
    {
        return quit;
    }
}   
