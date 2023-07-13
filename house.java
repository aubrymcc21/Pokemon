import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class house
{
    // instance variables - replace the example below with your own
    public int x, y, x1, y1, x2, y2, tx1, ty1, tx2, ty2, tx3, ty3;
    public Polygon roof, roof1, roof2, roof3, t1, t2, t3;
    public int rofx[], rofy[], rofx1[], rofy1[], rofx2[], rofy2[], rofx3[], rofy3[], t1x[], t1y[], t2x[], t2y[], t3x[], t3y[];
    public Rectangle h, h1, h2, h3;
    public house()
    {
        // initialise instance variables
        x = 50;
        y = 50;
        x1 = 70;
        y1 = 100;
        rofx = new int[] {x1, x1, x1+100, x1+200, x1+200, x1+100};
        rofy = new int [] {y1+90, y1+50, y1+20, y1+50, y1+90, y1+60};
        roof = new Polygon(rofx, rofy, rofx.length);
        rofx1 = new int [] {x1+350, x1+350, x1+450, x1+550, x1+550, x1+450};
        rofy1 = new int [] {y1+90, y1+50, y1+20, y1+50, y1+90, y1+60};
        roof1 = new Polygon(rofx1, rofy1, rofx1.length);
        rofx2 = new int [] {x1, x1, x1+100, x1+200, x1+200, x1+100};
        rofy2 = new int [] {y1+390, y1+350, y1+320, y1+350, y1+390, y1+360};
        roof2 = new Polygon(rofx2, rofy2, rofx2.length);
        rofx3 = new int [] {x1+350, x1+350, x1+450, x1+550, x1+550, x1+450};
        rofy3 = new int [] {y1+390, y1+350, y1+320, y1+350, y1+390, y1+360};
        roof3 = new Polygon(rofx3, rofy3, rofx3.length);
        h = new Rectangle(x1,y1+90,200,40);
        h1 = new Rectangle(x1+350,y1+90,200,40);
        h2 = new Rectangle(x1,y1+390,200,70);
        h3 = new Rectangle(x1+350,y1+390,200,70);

        //TREES
        int t1x[] = {x2};
        int t1y[] = {y2};

        t1 = new Polygon(t1x, t1y, t1x.length);
    }

    public void drawhousebkgrd(Graphics g)
    {
        g.setColor(new Color(71,252,136));
        g.fillRect(0,0,1366,900);
        g.setColor(new Color(247,220,141));
        g.fillRect(300,150,100,500);
        g.fillRect(60,250,560,80);
        g.fillRect(60,580,560,80);
    }

    public void drawtrees(Graphics g)
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

    public void drawroof(Graphics2D g)
    {
        g.setColor(new Color(38,138,101));
        g.fillPolygon(roof);
        g.fillPolygon(roof1);
        g.fillPolygon(roof2);
        g.fillPolygon(roof3);
    }

    public void drawhouse(Graphics2D g)
    {
        g.setColor(new Color(173,175,118));
        g.fillRect(70,150,200,80);
        g.setColor(new Color(91,65,34));
        g.fillRect(70,225,200,5);
        g.fillRect(100,210,20,15); //door
        g.setColor(new Color(147,168,216)); //windows
        g.fillRect(135,210,50,10);
        g.fillRect(200,210,50,10);
        g.setColor(Color.WHITE);
        g.drawRect(135,210,50,10);
        g.drawRect(200,210,50,10);

        g.setColor(new Color(173,175,118));
        g.fillRect(420,150,200,80);
        g.setColor(new Color(91,65,34));
        g.fillRect(420,225,200,5);
        g.fillRect(450,210,20,15);
        g.setColor(new Color(147,168,216));
        g.fillRect(485,210,50,10);
        g.fillRect(550,210,50,10);
        g.setColor(Color.WHITE);
        g.drawRect(485,210,50,10);
        g.drawRect(550,210,50,10);

        g.setColor(new Color(173,175,118));
        g.fillRect(70,450,200,110);
        g.setColor(new Color(91,65,34));
        g.fillRect(70,555,200,5);
        g.fillRect(100,540,20,15);
        g.setColor(new Color(147,168,216)); 
        g.fillRect(135,540,50,10);
        g.fillRect(200,540,50,10);
        g.setColor(Color.WHITE);
        g.drawRect(135,540,50,10);
        g.drawRect(200,540,50,10);

        g.setColor(new Color(173,175,118));
        g.fillRect(420,450,200,110);
        g.setColor(new Color(91,65,34));
        g.fillRect(420,555,200,5);
        g.fillRect(450,540,20,15);
        g.setColor(new Color(147,168,216));
        g.fillRect(485,540,50,10);
        g.fillRect(550,540,50,10);
        g.setColor(Color.WHITE);
        g.drawRect(485,540,50,10);
        g.drawRect(550,540,50,10);

    }
    public int gett1x()
    {
        return tx1;
    }

    public int gett1y()
    {
        return ty1;
    }

    public int gett2x()
    {
        return tx2;
    }

    public int gett2y()
    {
        return ty2;
    }

    public int gett3x()
    {
        return tx3;
    }

    public int gett3y()
    {
        return ty3;
    }

    public Rectangle getroof()
    {
        return roof.getBounds();        
    }

    public Rectangle getroof1()
    {
        return roof1.getBounds();        
    }

    public Rectangle getroof2()
    {
        return roof2.getBounds();        
    }

    public Rectangle getroof3()
    {
        return roof3.getBounds();        
    }

    public Rectangle getRecth()
    {
        return h;
    }

    public Rectangle getRecth1()
    {
        return h1;
    }

    public Rectangle getRecth2()
    {
        return h2;
    }

    public Rectangle getRecth3()
    {
        return h3;
    }

    public int getxh()
    {
        return x1;
    }

    public int getyh()
    {
        return y1;
    }

    public int getxh1()
    {
        return x1+350;
    }

    public int getyh1()
    {
        return y1+90;
    }

    public int getxh2()
    {
        return x1;
    }

    public int getyh2()
    {
        return y1+390;
    }

    public int getxh3()
    {
        return x1+350;
    }

    public int getyh3()
    {
        return y1+390;
    }

    public void getout()
    {
        x1 = 1000;
        y1 = 1000;
    }

    public void sety1(int y)
    {
        y1 = y;
    }

    public void drawtrees(int x, int y) //put in variables to change location
    {
        x1 = x;
        y1 = y;
    }

}
