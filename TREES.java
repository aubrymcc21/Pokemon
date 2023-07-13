import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class TREES
{
    // instance variables - replace the example below with your own
    private int x, y;
    private Rectangle r;
    /**
     * Constructor for objects of class TREES
     */
    public TREES()
    {
        // initialise instance variables
        
        r = new Rectangle(x, y, 30, 30);
    }

    public void draw(Graphics2D g)
    {
        g.setColor(new Color(16,68,3));
        g.fillOval(x,y,30,35);

        g.setColor(new Color(56,111,56));
        g.fillOval(x,y,30,30);
        g.setColor(new Color(109,162,43));
        g.fillOval(x+1,y+1,28,28);
        g.setColor(new Color(82,131,23));
        g.fillOval(x+5,y+5,20,20);
        g.setColor(new Color(134,175,61));
        g.fillOval(x+7,y+7,16,16);
    }

    public int getx()
    {
        return x;
    }

    public int gety()
    {
        return y;
    }

    public Rectangle getRect()
    {
        return r;
    }

    public void setLoc(int xx, int yy)
    {
        x = xx;
        y = yy;
        r = new Rectangle(x, y, 30, 30);
    }
}
