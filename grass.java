import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class grass
{
    // instance variables - replace the example below with your own
    private int x, y, xVel;
    private Rectangle r;
    private Random ran;
    public grass()
    {
        // initialise instance variables
        xVel = -3;
        ran = new Random();
        r = new Rectangle(x, y, 30, 30);
    }

    public void move()
    {
        x+=xVel;
    }

    public void setLoc(int xx, int yy)
    {
        x = xx;
        y = yy;
    }

    public void draw(Graphics2D g)
    {
        r.setLocation(x, y);
        g.setColor(new Color(0, 153, 51));
        g.fillOval(x+18, y, 12, 34);
        g.fillOval(x+6, y+20, 20, 12);
        g.fillOval(x+22, y+20, 20, 12);
        g.setColor(new Color(94, 176, 113));
        g.fillOval(x+4, y+10, 20, 12);
        g.fillOval(x+24, y+10, 20, 12);
        g.setColor(new Color(51, 204, 51));
        g.fillOval(x+2, y, 20, 12);
        g.fillOval(x+26, y, 20, 12);
        g.fillOval(x+18, y-10, 12, 18);
        g.setColor(Color.BLACK);
        g.drawOval(x+6, y+20, 20, 12);
        g.drawOval(x+22, y+20, 20, 12);
        g.drawOval(x+4, y+10, 20, 12);
        g.drawOval(x+24, y+10, 20, 12);
        g.drawOval(x+2, y, 20, 12);
        g.drawOval(x+26, y, 20, 12);
        g.drawOval(x+18, y-10, 12, 18);

        if (x<ran.nextInt(30)-60)
        {
            x = 710;
        }
    }

    public int getx()
    {
        return x;
    }

    public int gety()
    {
        return y;
    }

    public void setx(int xx)
    {
        x = xx;
    }

    public void sety(int yy)
    {
        y = yy;
    }
    
    public Rectangle getRect()
    {
        return r;
    }
}
