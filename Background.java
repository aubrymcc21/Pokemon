import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class Background
{
    // instance variables - replace the example below with your own
    private int x, y, z, w;
    house h = new house();
    room rum = new room();
    menu men = new menu();
    fight f = new fight();
    grassarea area = new grassarea();
    signs s = new signs();
    public Background()
    {
        // initialise instance variables

    }

    public void drawfight1(Graphics2D g)
    {
        f.drawfight1(g);
    }

    public void drawfight2(Graphics2D g)
    {
        f.drawfight2(g);
    }

    public void drawfight3(Graphics2D g)
    {
        f.drawfight3(g);
    }

    public void drawatt1(Graphics2D g)
    {
        f.drawatt1(g);
    }

    public void drawatt2(Graphics2D g)
    {
        f.drawatt2(g);
    }

    public void drawatt3(Graphics2D g)
    {
        f.drawatt3(g);
    }

    public void move()
    {

    }

    public void drawmenu(Graphics2D g)
    {
        men.drawmen(g);   
    }

    public void drawhouse(Graphics2D g)
    {
        h.drawhousebkgrd(g);
        h.drawhouse(g);
        s.housesign(g);
    }

    public void drawroof(Graphics2D g)
    {
        h.drawroof(g);
    }

    public void drawroom(Graphics2D g)
    {
        rum.draw(g);
    }

    public void drawarea(Graphics2D g)
    {
        area.drawarea(g);
        s.grasssign(g);
    }

    public void drawfight(Graphics g)
    {

    }

    public void grassmessage(Graphics2D g)
    {
        s.grassmessage(g);
    }

    public int gett1x()
    {
        return h.gett1x();
    }

    public int gett1y()
    {
        return h.gett1y();
    }

    public int gett2x()
    {
        return h.gett2x();
    }

    public int gett2y()
    {
        return h.gett2y();
    }

    public int gett3x()
    {
        return h.gett3x();
    }

    public int gett3y()
    {
        return h.gett3y();
    }

    public Rectangle getRecth()
    {
        return h.getRecth();
    }

    public int getxh()
    {
        return h.getxh();
    }

    public int getyh()
    {
        return h.getyh();
    }

    public int getxh1()
    {
        return h.getxh1();
    }

    public int getyh1()
    {
        return h.getyh1();
    }

    public int getxh2()
    {
        return h.getxh2();
    }

    public int getyh3()
    {
        return h.getyh3();
    }

    public Rectangle getRecth1()
    {
        return h.getRecth1();
    }

    public Rectangle getRecth2()
    {
        return h.getRecth2();
    }

    public Rectangle getRecth3()
    {
        return h.getRecth3();
    }

    public Rectangle getplay()
    {
        return men.getplay();
    }

    public Rectangle getinstructions()
    {
        return men.getinstructions();
    }

    public Rectangle getquit()
    {
        return men.getquit();
    }

    public int getct()
    {
        return rum.getct();
    }

    public void setct(int x)
    {
        rum.setct(x);
    }

    public Rectangle getbulb()
    {
        return rum.getbulb();
    }

    public Rectangle getcharm()
    {
        return rum.getcharm();
    }

    public Rectangle getsquirt()
    {
        return rum.getsquirt();
    }

    public Rectangle getfight()
    {
        return f.getfight();
    }

    public Rectangle getpkmn()
    {
        return f.getpkmn();
    }

    public Rectangle getflee()
    {
        return f.getflee();
    }

    public Rectangle getbag()
    {
        return f.getbag();
    }

    public void sethp(int xx)
    {
        f.sethp(xx);
    }

    public int gethp()
    {
        return f.gethp();
    }

    public void setehp(int xx)
    {
        f.setehp(xx);
    }

    public int getehp()
    {
        return f.getehp();
    }

    public Rectangle gettackle()
    {
        return f.gettackle();
    }

    public Rectangle getscratch()
    {
        return f.getscratch();
    }

    public Rectangle gettackle1()
    {
        return f.gettackle1();
    }

    public void tackle(Graphics2D g)
    {
        f.tackle(g);
    }

    public void eattack(Graphics2D g)
    {
        f.eattack(g);
    }

    public void scratch(Graphics2D g)
    {
        f.scratch(g);
    }

    public void tackle1(Graphics2D g)
    {
        f.tackle1(g);
    }

    public void faint(Graphics2D g)
    {
        f.faint(g);
    }

    public void setct1(int xx)
    {
        f.setct(xx);
    }

    public int getct1()
    {
        return f.getct();
    }

    public Rectangle gethousesign()
    {
        return s.gethousesign();
    }

    public Rectangle getgrasssign()
    {
        return s.getgrasssign();
    }

    public void housemessage(Graphics2D g)
    {
        s.housemessage(g);
    }
}
