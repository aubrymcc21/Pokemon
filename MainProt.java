import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class MainProt
{
    // instance variables - replace the example below with your own
    private int x, y, xVel, yVel, z;
    Rectangle r ;
    house h = new house();
    private boolean p;
    /**
     * Constructor for objects of class MainProt
     */
    public MainProt()
    {
        // initialise instance variables
        x = 100;
        y = 100;
        p = true;
        r = new Rectangle(x-2, y-5, 19, 25);

    }

    public void draw(Graphics2D g)
    {
        g.setColor(new Color(35,43,85));
        r.setLocation(x-2, y-5);
        g.fillOval(x-2,y, 19, 20);
        if (p)
        {
            g.setColor(new Color(244,209,179)); //head
            g.fillOval(x, y, 15, 10);
            g.setColor(Color.WHITE);
            g.fillOval(x+2,y+3,3,3);
            g.fillOval(x+10,y+3,3,3);
            g.setColor(Color.BLACK);
            g.fillOval(x+4,y+4,1,2);
            g.fillOval(x+11,y+4,1,2);
            g.setColor(new Color(210,149,128));
            g.fillRect(x+6,y+8,3,2);
            g.setColor(Color.WHITE); //hat
            g.fillOval(x,y-5,15,9);
            g.setColor(Color.RED);
            g.fillOval(x,y-2,15,6);
            g.setColor(Color.BLUE);
            g.fillOval(x+7,y-2,2,2);
            z++;
            if (z==4)
            {
                p=!p;   
            }
        }
        else
        {
            g.setColor(new Color(244,209,179)); //head
            g.fillOval(x, y-5, 15, 10);
            g.setColor(Color.WHITE);
            g.fillOval(x+2,y-2,3,3);
            g.fillOval(x+10,y-2,3,3);
            g.setColor(Color.BLACK);
            g.fillOval(x+4,y-1,1,2);
            g.fillOval(x+11,y-1,1,2);
            g.setColor(new Color(210,149,128));
            g.fillRect(x+6,y+3,3,2);
            g.setColor(Color.WHITE); //hat
            g.fillOval(x,y-10,15,9);
            g.setColor(Color.RED);
            g.fillOval(x,y-7,15,6);
            g.setColor(Color.BLUE);
            g.fillOval(x+7,y-7,2,2);
            z++;
            if (z==8)
            {   
                p=!p;
                z = 0;
            }
        }

    }

    public void move()
    {
        // rip = new Polygon(ripx, ripy, ripx.length);
        //r = new Rectangle(x-2, y-5, 19, 25);
        x+=xVel;
        y+=yVel;        
    }

    public Rectangle getRect()
    {
        return r;
    }

    public int getx()
    {
        return x;
    }

    public int gety()
    {
        return y;
    }

    public void setx(int r)
    {
        x = r;
    }

    public void sety(int r)
    {
        y = r;
    }

    public void setxVel(int r)
    {
        xVel = r;
    }

    public void setyVel(int r)
    {
        yVel = r;
    }

    public void turnLeft()
    {
        xVel = -5;
        yVel = 0;
    }

    public void turnRight()
    {
        xVel = 5;
        yVel = 0;
    }

    public void TurnUp() //get L I T
    {

        yVel = -5;
        xVel = 0; 

    }

    public void TurnDown()
    {
        yVel = 5;
        xVel = 0; 
    }
}