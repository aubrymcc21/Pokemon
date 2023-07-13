import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class fight
{
    private int x, y, x1, x11, ex1, ct;
    private int w[], q[];
    Rectangle fight, pkmn, flee, bag, tackle, splash, scratch, tackle1;
    Polygon spike;
    public fight()
    {
        // initialise instance variables
        x = 0;
        y = 0;
        ex1 = 140;
        x1 = 140;
        x11 = 140;
        ct = 19;
        w = new int[] {524, 528, 530};
        q = new int[] {66, 61, 68};
        spike = new Polygon(w, q, w.length);
        fight = new Rectangle(x+310, y+550, 160, 80);
        pkmn = new Rectangle(x+470, y+550, 200, 80);
        bag = new Rectangle(x+310, y+630, 160, 110);
        flee = new Rectangle(x+470, y+630, 200, 110);
        tackle = new Rectangle(1323, 580, 245, 30);
        scratch = new Rectangle(1323, 580, 245, 30);
    }

    public void drawfight1(Graphics2D g)
    {
        x = 0;
        y = 0;
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800, 800);
        //BULBASAUR
        g.setColor(new Color(116, 193, 161));
        g.fillOval(110, 500, 50, 40);
        g.fillOval(65, 530, 100, 100);
        g.fillOval(118,496,7,10);
        g.fillOval(147, 497, 7, 10);
        g.setColor(Color.GREEN);
        g.fillOval(60, 495, 60, 60);

        g.setColor(Color.WHITE);
        g.fillRect(30, 550, 640, 190);
        g.setColor(Color.BLACK);
        g.drawRect(30, 550, 640, 190);
        g.drawRect(30, 550, 280, 190);
        g.setFont(new Font("Impact", Font.PLAIN, 50));
        g.drawString("What will", 40, 610);
        g.drawString("BULBASAUR", 40, 660);
        g.drawString("do?", 40, 710);
        g.setFont(new Font("Impact", Font.PLAIN, 60));
        g.drawString("FIGHT", x+323, y+610);
        g.drawString("P K M N", x+485, y+615);
        g.drawString("B A G", x+330, y+705);
        g.drawString("F L E E", x+500, y+708);
        g.drawRect(x+310, y+550, 160, 80);
        g.drawRect(x+470, y+550, 200, 80);
        g.drawRect(x+310, y+630, 160, 110);
        g.drawRect(x+470, y+630, 200, 110);

        g.setColor(new Color(14, 240, 16));
        g.fillRect(525, 460, x1, 20);
        g.setColor(Color.BLACK);
        g.drawRect(525, 460, 140, 20);
        g.setFont(new Font("Impact", Font.PLAIN, 24));
        g.drawString("HP", 495, 480);
        g.setFont(new Font("Impact", Font.PLAIN, 49));
        g.setColor(new Color(14, 240, 16));
        g.fillRect(115, 80, ex1, 20);
        g.setColor(Color.BLACK);
        g.drawRect(115, 80, 140, 20);
        g.setFont(new Font("Impact", Font.PLAIN, 24));
        g.drawString("HP", 85, 100);
        g.setFont(new Font("Arial", Font.PLAIN, 40));
        g.drawString("WEEDLE", 80, 70);

        g.setColor(new Color(178, 141, 77));
        g.fillOval(560, 110, 12, 12);
        g.setColor(Color.BLACK);
        g.drawOval(560, 110, 12, 12);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(551, 112, 12, 12);
        g.setColor(Color.BLACK);
        g.drawOval(551,112, 12, 12);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(540, 113, 13, 13);
        g.setColor(Color.BLACK);
        g.drawOval(540, 113, 13, 13);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(530, 110, 14, 14);
        g.setColor(Color.BLACK);
        g.drawOval(530, 110, 14, 14);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(522, 100, 15, 15);
        g.setColor(Color.BLACK);
        g.drawOval(522, 100, 15, 15);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(517, 90, 15, 15);
        g.setColor(Color.BLACK);
        g.drawOval(517, 90, 15, 15);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(516, 78, 17, 17);
        g.setColor(Color.BLACK);
        g.drawOval(516, 78, 17, 17);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(516, 63, 20, 20);
        g.setColor(Color.BLACK);
        g.drawOval(516, 63, 20, 20);
        g.fillOval(518, 67, 5, 5); //eyes
        g.fillOval(527, 70, 5, 5);
        g.setColor(Color.WHITE);
        g.fillOval(520, 68, 2, 2);
        g.fillOval(529, 71, 2, 2);
        g.setColor(new Color(199, 134, 166)); //nose things
        g.fillOval(515, 73, 9, 6);
        g.fillOval(568, 118, 5, 5);
        g.fillOval(556, 120, 5, 5);
        g.fillOval(545, 122, 6, 6);
        g.fillOval(534, 120, 5, 5);
        g.fillOval(526, 111, 5, 5);
        g.fillOval(523, 102, 5, 5);
        g.fillOval(522, 91, 5, 5);
        g.setColor(Color.BLACK);
        g.drawOval(515, 73, 9, 6);
        g.drawOval(568, 118, 5, 5);
        g.drawOval(556, 120, 5, 5);
        g.drawOval(545, 122, 6, 6);
        g.drawOval(534, 120, 5, 5);
        g.drawOval(526, 111, 5, 5);
        g.drawOval(523, 102, 5, 5);
        g.drawOval(522, 91, 5, 5);
        g.setColor(Color.WHITE);
        g.fill(spike);
        g.setColor(Color.BLACK);
        g.draw(spike);
        tackle = new Rectangle(1323, 580, 245, 30);
        fight = new Rectangle(x+310, y+550, 160, 80);
        pkmn = new Rectangle(x+470, y+550, 200, 80);
        bag = new Rectangle(x+310, y+630, 160, 110);
        flee = new Rectangle(x+470, y+630, 200, 110);
    }

    public void drawatt1(Graphics2D g)
    {
        x = 1000;
        g.setColor(Color.WHITE);
        g.fillRect(311, 551, 359, 188);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.PLAIN, 30));
        g.drawString("TACKLE  10 PP", 323, 610);
        tackle = new Rectangle(323, 580, 245, 30);
        fight = new Rectangle(x+310, y+550, 160, 80);
        pkmn = new Rectangle(x+470, y+550, 200, 80);
        bag = new Rectangle(x+310, y+630, 160, 110);
        flee = new Rectangle(x+470, y+630, 200, 110);
    }

    public void tackle(Graphics2D g)
    {
        x = 1000;
        g.setColor(Color.WHITE);
        g.fillRect(329, 551, 209, 189);
        g.setFont(new Font("Arial", Font.PLAIN, 50));
        g.setColor(Color.BLACK);
        g.drawString("BULBASAUR", 323, 610);
        g.drawString("used TACKLE!", 323, 660);
        fight = new Rectangle(x+310, y+550, 160, 80);
        tackle = new Rectangle(1323, 580, 245, 30);
    }

    public void eattack(Graphics2D g)
    {
        x = 1000;
        g.setColor(Color.WHITE);
        g.fillRect(320, 551, 296, 189);
        g.setFont(new Font("Arial", Font.PLAIN, 50));
        g.setColor(Color.BLACK);
        g.drawString("WEEDLE", 321, 610);
        g.drawString("used POISON", 321, 660);
        g.drawString("STING!", 321, 710);
    }

    public void drawfight2(Graphics2D g)
    {
        x = 0;
        y = 0;
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800, 800);
        //CHARMANDER
        g.setColor(new Color(254, 173, 92));
        g.fillOval(110, 470, 40, 50);
        g.fillOval(90, 490, 45, 70); 
        g.fillOval(70, 485, 20, 200);
        g.setColor(new Color(255, 68, 5));
        g.fillOval(71, 480, 17, 25);
        g.setColor(new Color(255, 219, 83));
        g.fillOval(73, 488, 13, 18);

        g.setColor(Color.WHITE);
        g.fillRect(30, 550, 640, 190);
        g.setColor(Color.BLACK);
        g.drawRect(30, 550, 640, 190);
        g.drawRect(30, 550, 280, 190);
        g.setFont(new Font("Impact", Font.PLAIN, 50));
        g.drawString("What will", 40, 610);
        g.drawString("CHARMANDER", 38, 660);
        g.drawString("do?", 40, 710);
        g.setFont(new Font("Impact", Font.PLAIN, 60));
        g.drawString("FIGHT", x+323, y+610);
        g.drawString("P K M N", x+485, y+615);
        g.drawString("B A G", x+330, y+705);
        g.drawString("F L E E", x+500, y+708);
        g.drawRect(x+310, y+550, 160, 80);
        g.drawRect(x+470, y+550, 200, 80);
        g.drawRect(x+310, y+630, 160, 110);
        g.drawRect(x+470, y+630, 200, 110);

        g.setColor(new Color(14, 240, 16));
        g.fillRect(525, 460, x1, 20);
        g.setColor(Color.BLACK);
        g.drawRect(525, 460, 140, 20);
        g.setFont(new Font("Impact", Font.PLAIN, 24));
        g.drawString("HP", 495, 480);
        g.setFont(new Font("Impact", Font.PLAIN, 49));
        g.setColor(new Color(14, 240, 16));
        g.fillRect(115, 80, ex1, 20);
        g.setColor(Color.BLACK);
        g.drawRect(115, 80, 140, 20);
        g.setFont(new Font("Impact", Font.PLAIN, 24));
        g.drawString("HP", 85, 100);
        g.setFont(new Font("Arial", Font.PLAIN, 40));
        g.drawString("WEEDLE", 80, 70);

        g.setColor(new Color(178, 141, 77));
        g.fillOval(560, 110, 12, 12);
        g.setColor(Color.BLACK);
        g.drawOval(560, 110, 12, 12);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(551, 112, 12, 12);
        g.setColor(Color.BLACK);
        g.drawOval(551,112, 12, 12);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(540, 113, 13, 13);
        g.setColor(Color.BLACK);
        g.drawOval(540, 113, 13, 13);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(530, 110, 14, 14);
        g.setColor(Color.BLACK);
        g.drawOval(530, 110, 14, 14);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(522, 100, 15, 15);
        g.setColor(Color.BLACK);
        g.drawOval(522, 100, 15, 15);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(517, 90, 15, 15);
        g.setColor(Color.BLACK);
        g.drawOval(517, 90, 15, 15);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(516, 78, 17, 17);
        g.setColor(Color.BLACK);
        g.drawOval(516, 78, 17, 17);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(516, 63, 20, 20);
        g.setColor(Color.BLACK);
        g.drawOval(516, 63, 20, 20);
        g.fillOval(518, 67, 5, 5); //eyes
        g.fillOval(527, 70, 5, 5);
        g.setColor(Color.WHITE);
        g.fillOval(520, 68, 2, 2);
        g.fillOval(529, 71, 2, 2);
        g.setColor(new Color(199, 134, 166)); //nose things
        g.fillOval(515, 73, 9, 6);
        g.fillOval(568, 118, 5, 5);
        g.fillOval(556, 120, 5, 5);
        g.fillOval(545, 122, 6, 6);
        g.fillOval(534, 120, 5, 5);
        g.fillOval(526, 111, 5, 5);
        g.fillOval(523, 102, 5, 5);
        g.fillOval(522, 91, 5, 5);
        g.setColor(Color.BLACK);
        g.drawOval(515, 73, 9, 6);
        g.drawOval(568, 118, 5, 5);
        g.drawOval(556, 120, 5, 5);
        g.drawOval(545, 122, 6, 6);
        g.drawOval(534, 120, 5, 5);
        g.drawOval(526, 111, 5, 5);
        g.drawOval(523, 102, 5, 5);
        g.drawOval(522, 91, 5, 5);
        g.setColor(Color.WHITE);
        g.fill(spike);
        g.setColor(Color.BLACK);
        g.draw(spike);
        scratch = new Rectangle(1323, 580, 245, 30);
        fight = new Rectangle(x+310, y+550, 160, 80);
        pkmn = new Rectangle(x+470, y+550, 200, 80);
        bag = new Rectangle(x+310, y+630, 160, 110);
        flee = new Rectangle(x+470, y+630, 200, 110);
    }

    public void drawatt2(Graphics2D g)
    {
        x = 1000;
        g.setColor(Color.WHITE);
        g.fillRect(311, 551, 359, 188);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.PLAIN, 30));
        g.drawString("SCRATCH     10 PP", 323, 610);
        scratch = new Rectangle(323, 580, 265, 30);
        fight = new Rectangle(x+310, y+550, 160, 80);
        pkmn = new Rectangle(x+470, y+550, 200, 80);
        bag = new Rectangle(x+310, y+630, 160, 110);
        flee = new Rectangle(x+470, y+630, 200, 110);
    }

    public void scratch(Graphics2D g)
    {
        x = 1000;
        g.setColor(Color.WHITE);
        g.fillRect(320, 551, 296, 189);
        g.setFont(new Font("Arial", Font.PLAIN, 50));
        g.setColor(Color.BLACK);
        g.drawString("CHARMANDER", 314, 610);
        g.drawString("used", 314, 660);
        g.drawString("SCRATCH!", 314, 710);
        fight = new Rectangle(x+310, y+550, 160, 80);
        scratch = new Rectangle(1323, 580, 245, 30);
    }

    public void drawfight3(Graphics2D g)
    {
        x = 0;
        y = 0;
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800, 800);
        //SQUIRTLE
        g.setColor(new Color(155, 204, 221));
        g.fillOval(135, 475, 40, 35);
        g.fillOval(135, 520, 50, 15);
        g.setColor(Color.BLACK);
        g.drawOval(135, 475, 40, 35);
        g.setColor(new Color(183, 105, 2));
        g.fillOval(120, 500, 50, 60);
        g.setColor(Color.WHITE);
        g.drawOval(120, 500, 50, 60);
        g.setColor(Color.BLACK);
        g.drawOval(130, 515, 25, 25); //maybe add more shell lines if you can go through that patience
        g.setColor(new Color(155, 204, 221));
        g.fillOval(110, 525, 30, 30);
        g.setColor(Color.BLACK);
        g.drawOval(110, 525, 30, 30);
        g.drawOval(111, 537, 20, 20);
        g.setColor(new Color(155, 204, 221));
        g.fillOval(111, 535, 15, 14);

        g.setColor(Color.WHITE);
        g.fillRect(30, 550, 640, 190);
        g.setColor(Color.BLACK);
        g.drawRect(30, 550, 640, 190);
        g.drawRect(30, 550, 280, 190);
        g.setFont(new Font("Impact", Font.PLAIN, 50));
        g.drawString("What will", 40, 610);
        g.drawString("SQUIRTLE", 40, 660);
        g.drawString("do?", 40, 710);
        g.setFont(new Font("Impact", Font.PLAIN, 60));
        g.drawString("FIGHT", x+323, y+610);
        g.drawString("P K M N", x+485, y+615);
        g.drawString("B A G", x+330, y+705);
        g.drawString("F L E E", x+500, y+708);
        g.drawRect(x+310, y+550, 160, 80);
        g.drawRect(x+470, y+550, 200, 80);
        g.drawRect(x+310, y+630, 160, 110);
        g.drawRect(x+470, y+630, 200, 110);

        g.setColor(new Color(14, 240, 16));
        g.fillRect(525, 460, x1, 20);
        g.setColor(Color.BLACK);
        g.drawRect(525, 460, 140, 20);
        g.setFont(new Font("Impact", Font.PLAIN, 24));
        g.drawString("HP", 495, 480);
        g.setFont(new Font("Impact", Font.PLAIN, 49));
        g.setColor(new Color(14, 240, 16));
        g.fillRect(115, 80, ex1, 20);
        g.setColor(Color.BLACK);
        g.drawRect(115, 80, 140, 20);
        g.setFont(new Font("Impact", Font.PLAIN, 24));
        g.drawString("HP", 85, 100);
        g.setFont(new Font("Arial", Font.PLAIN, 40));
        g.drawString("WEEDLE", 80, 70);

        g.setColor(new Color(178, 141, 77));
        g.fillOval(560, 110, 12, 12);
        g.setColor(Color.BLACK);
        g.drawOval(560, 110, 12, 12);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(551, 112, 12, 12);
        g.setColor(Color.BLACK);
        g.drawOval(551,112, 12, 12);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(540, 113, 13, 13);
        g.setColor(Color.BLACK);
        g.drawOval(540, 113, 13, 13);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(530, 110, 14, 14);
        g.setColor(Color.BLACK);
        g.drawOval(530, 110, 14, 14);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(522, 100, 15, 15);
        g.setColor(Color.BLACK);
        g.drawOval(522, 100, 15, 15);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(517, 90, 15, 15);
        g.setColor(Color.BLACK);
        g.drawOval(517, 90, 15, 15);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(516, 78, 17, 17);
        g.setColor(Color.BLACK);
        g.drawOval(516, 78, 17, 17);
        g.setColor(new Color(178, 141, 77));
        g.fillOval(516, 63, 20, 20);
        g.setColor(Color.BLACK);
        g.drawOval(516, 63, 20, 20);
        g.fillOval(518, 67, 5, 5); //eyes
        g.fillOval(527, 70, 5, 5);
        g.setColor(Color.WHITE);
        g.fillOval(520, 68, 2, 2);
        g.fillOval(529, 71, 2, 2);
        g.setColor(new Color(199, 134, 166)); //nose things
        g.fillOval(515, 73, 9, 6);
        g.fillOval(568, 118, 5, 5);
        g.fillOval(556, 120, 5, 5);
        g.fillOval(545, 122, 6, 6);
        g.fillOval(534, 120, 5, 5);
        g.fillOval(526, 111, 5, 5);
        g.fillOval(523, 102, 5, 5);
        g.fillOval(522, 91, 5, 5);
        g.setColor(Color.BLACK);
        g.drawOval(515, 73, 9, 6);
        g.drawOval(568, 118, 5, 5);
        g.drawOval(556, 120, 5, 5);
        g.drawOval(545, 122, 6, 6);
        g.drawOval(534, 120, 5, 5);
        g.drawOval(526, 111, 5, 5);
        g.drawOval(523, 102, 5, 5);
        g.drawOval(522, 91, 5, 5);
        g.setColor(Color.WHITE);
        g.fill(spike);
        g.setColor(Color.BLACK);
        g.draw(spike);
        tackle = new Rectangle(1323, 580, 245, 30);
        fight = new Rectangle(x+310, y+550, 160, 80);
        pkmn = new Rectangle(x+470, y+550, 200, 80);
        bag = new Rectangle(x+310, y+630, 160, 110);
        flee = new Rectangle(x+470, y+630, 200, 110);
    }

    public void drawatt3(Graphics2D g)
    {
        x = 1000;
        g.setColor(Color.WHITE);
        g.fillRect(311, 551, 359, 188);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.PLAIN, 30));
        g.drawString("TACKLE      10 PP", 323, 610);
        tackle = new Rectangle(323, 580, 245, 30);
        fight = new Rectangle(x+310, y+550, 160, 80);
        pkmn = new Rectangle(x+470, y+550, 200, 80);
        bag = new Rectangle(x+310, y+630, 160, 110);
        flee = new Rectangle(x+470, y+630, 200, 110);
    }

    public void tackle1(Graphics2D g)
    {
        x = 1000;
        g.setColor(Color.WHITE);
        g.fillRect(320, 551, 289, 189);
        g.setFont(new Font("Arial", Font.PLAIN, 50));
        g.setColor(Color.BLACK);
        g.drawString("SQUIRTLE", 323, 610);
        g.drawString("used TACKLE!", 323, 660);
        fight = new Rectangle(x+310, y+550, 160, 80);
        tackle = new Rectangle(1323, 580, 245, 30);
    }

    public void faint(Graphics2D g)
    {
        x = 1000;
        g.setColor(Color.WHITE);
        g.fillRect(311, 551, 359, 188);
        g.setFont(new Font("Arial", Font.PLAIN, 50));
        g.setColor(Color.BLACK);
        g.drawString("WEEDLE", 360, 610);
        g.drawString("fainted!", 360, 675);
    }

    public Rectangle getfight()
    {
        return fight;
    }

    public Rectangle getpkmn()
    {
        return pkmn;
    }

    public Rectangle getflee()
    {
        return flee;
    }

    public Rectangle getbag()
    {
        return bag;
    }

    public void sethp(int xx)
    {
        x1 = xx;
    }

    public int gethp()
    {
        return x1;
    }

    public Rectangle gettackle()
    {
        return tackle;
    }

    public Rectangle getscratch()
    {
        return scratch;
    }

    public Rectangle gettackle1()
    {
        return tackle;
    }

    public void setct(int xx)
    {
        ct = xx;
    }

    public int getct()
    {
        return ct;
    }

    public int getehp()
    {
        return ex1;
    }

    public void setehp(int x)
    {
        ex1 = x;
    }

}
