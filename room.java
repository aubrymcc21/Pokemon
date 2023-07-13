import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class room
{
    // instance variables - replace the example below with your own
    private int x, y, ct;
    oak oak = new oak();
    Rectangle bulb, charm, squirt;
    public room()
    {
        // initialise instance variables
        x = 0;
        y = 0;
        ct = 0;
        bulb = new Rectangle(x+97, y+590, 100, 80);
        charm = new Rectangle(x+308, y+575, 95, 110);
        squirt = new Rectangle(x+515, y+574, 100, 100);
    }

    public void draw(Graphics2D g)
    {
        g.setColor(new Color(224,239,232));
        g.fillRect(x, y, 800, 800);

        g.setColor(new Color(104,159,151));
        g.fillRect(x,y+390,800,10);
        g.setColor(new Color(131,176,168));
        g.fillRect(x,y+400,800,10);
        g.setColor(new Color(154,193,185));
        g.fillRect(x,y+410,800,10);
        g.setColor(new Color(174,206,201));
        g.fillRect(x,y+420,800,10);
        g.setColor(new Color(202,221,216));
        g.fillRect(x,y+430,800,10);
        g.setColor(new Color(82,143,135));
        g.fillRect(x,y+440,800,10);

        g.setColor(new Color(65,136,128));
        g.fillRect(x, y+450, 800, 800);

        g.setColor(Color.WHITE);
        g.fillRect(x+52,y+599, 600, 140);
        g.setColor(new Color(145,187,203));
        g.drawRect(x+52,y+599, 600, 140);
        g.setColor(Color.WHITE);
        g.fillRect(x+42, y+610, 30, 120);
        g.fillRect(x+632, y+610, 30, 120);
        g.fillArc(x+42, y+709, 30, 30, 180, 90); //bottom left
        g.fillArc(x+42,y+599, 30, 30, 90, 90); //top left
        g.fillArc(x+632, y+709, 30, 30, 270, 90); //bottom right
        g.fillArc(x+632, y+599, 30, 30, 0, 90); //top right
        g.setColor(new Color(145,187,203));
        g.drawRect(x+42, y+610, 30, 120);
        g.drawRect(x+632, y+610, 30, 120);
        g.drawArc(x+42, y+709, 30, 30, 180, 90); //bottom left
        g.drawArc(x+42,y+599, 30, 30, 90, 90); //top left
        g.drawArc(x+632, y+709, 30, 30, 270, 90); //bottom right
        g.drawArc(x+632, y+599, 30, 30, 0, 90); //top right
        g.setColor(Color.WHITE);
        g.fillRect(x+44, y+610, 30, 121);
        g.fillRect(x+632, y+610, 30, 121);

        g.setColor(new Color(197, 234, 217));
        g.fillOval(x+220, y+450, 250, 80);
        oak.drawpants(g);
        oak.drawshirt(g);
        oak.drawjacket(g);
        oak.drawtherest(g);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.PLAIN, 30));
        if (ct == 0)
        {
            g.drawString("Hello, there!", 50, 640);
            g.drawString("Glad to meet you!  ¤", 50, 680);
            g.drawString("(press spacebar to continue)  ¤", 50, 720);
        }
        else if (ct == 1)
        {
            g.drawString("Welcome to the world of Pokémon!", 50, 640);
            g.drawString("My name is Professor Oak.  ¤", 50, 680);
        }
        else if (ct == 2)
        {
            g.drawString("This world is inhabited far and wide by", 50, 640);
            g.drawString("creatures called Pokémon.  ¤", 50, 680);
        }
        else if (ct == 3)
        {
            g.drawString("For some people, Pokémon are pets.", 50, 640);
            g.drawString("Others use them for battling.  ¤", 50, 680);
        }
        else if (ct == 4)
        {
            g.drawString("As for myself...", 50, 640);
            g.drawString("I study Pokémon as a profession.  ¤", 50, 680);
        }
        else if (ct == 5) //have some break here for effect
        {
            g.drawString("Your very own Pokémon legend is about", 50, 640);
            g.drawString("to unfold!  ¤", 50, 680);
        }
        else if (ct == 6)
        {
            g.drawString("A world of dreams and adventures with", 50, 640);
            g.drawString("Pokémon awaits! Let's go!  ¤", 50, 680);
        }
        else if (ct == 7) //break maybe
        {
            g.drawString("There are three Pokémon here.   ¤", 50, 640);
            g.drawString("", 50, 680);
        }
        else if (ct == 8)
        {
            g.drawString("These are the only ones left, but you can have", 50, 640);
            g.drawString("one. Go on, choose!   ¤", 50, 680);
        }
        else if (ct == 9) //pokemon choosing
        {
            g.setColor(new Color(65,136,128));
            g.fillRect(x, y+450, 800, 800);
            g.setColor(Color.WHITE);
            g.fillRect(x+72, y+550, 150, 150);
            g.fillRect(x+282, y+550, 150, 150);
            g.fillRect(x+492, y+550, 150, 150);
            g.fillRect(x+97,y+710, 100, 20);
            g.fillRect(x+307, y+710, 100, 20);
            g.fillRect(x+517, y+710, 100, 20);
            g.setColor(Color.BLACK);
            g.drawRect(x+72, y+550, 150, 150);
            g.drawRect(x+282, y+550, 150, 150);
            g.drawRect(x+492, y+550, 150, 150);
            g.drawRect(x+97,y+710, 100, 20);
            g.drawRect(x+307, y+710, 100, 20);
            g.drawRect(x+517, y+710, 100, 20);
            g.setColor(new Color(197, 234, 217));
            g.fillOval(x+220, y+450, 250, 80);
            oak.drawpants(g);
            oak.drawshirt(g);
            oak.drawjacket(g);
            oak.drawtherest(g);

            //BULBASAUR
            g.setColor(new Color(116, 193, 161));
            g.fillOval(x+100,y+575, 30, 60);
            g.fillOval(x+164, y+575, 30, 60);
            g.setColor(Color.BLACK);
            g.drawOval(x+100,y+575, 30, 60);
            g.drawOval(x+164, y+575, 30, 60);
            g.setColor(new Color(116, 193, 161));
            g.fillOval(x+97, y+590, 100, 80);
            g.setColor(Color.BLACK);
            g.drawOval(x+97, y+590, 100, 80);
            g.setColor(Color.WHITE);
            g.fillArc(x+112, y+610, 20, 40, 0, 180);
            g.fillArc(x+157, y+610, 20, 40, 0, 180);
            g.setColor(new Color(185, 124, 155));
            g.fillArc(x+106, y+625, 80, 30, 180, 180);
            g.setColor(new Color(160, 66, 71));
            g.fillOval(x+117, y+610, 10, 20);
            g.fillOval(x+162, y+610, 10, 20);
            g.setColor(Color.WHITE);
            g.fillOval(x+120, y+614, 4, 12);
            g.fillOval(x+165, y+614, 4, 12);
            g.fillRect(x+121, y+640, 2, 3);
            g.fillRect(x+171, y+640, 2, 3);
            g.setColor(Color.BLACK);
            g.drawArc(x+112, y+610, 20, 40, 0, 180);
            g.drawArc(x+157, y+610, 20, 40, 0, 180);
            g.drawArc(x+106, y+625, 80, 30, 180, 180);
            g.drawOval(x+117, y+610, 10, 20);
            g.drawOval(x+162, y+610, 10, 20);
            g.drawOval(x+120, y+614, 4, 12);
            g.drawOval(x+165, y+614, 4, 12);
            g.drawRect(x+121, y+640, 2, 3);
            g.drawRect(x+171, y+640, 2, 3);
            g.setFont(new Font("Arial", Font.PLAIN, 14));
            g.drawString("BULBASAUR", x+107, y+725);
            g.drawString("CHARMANDER", x+309, y+725);
            g.drawString("SQUIRTLE", x+534, y+725);

            //CHARMANDER
            g.setColor(new Color(254, 173, 92));
            g.fillOval(x+308, y+575, 95, 110);
            g.setColor(Color.BLACK);
            g.drawOval(x+308, y+575, 95, 110);
            g.fillArc(x+325, y+605, 15, 50, 0, 180);
            g.fillArc(x+370, y+605, 15, 50, 0, 180);
            g.setColor(new Color(46, 114, 153));
            g.fillOval(x+327,y+608, 10, 20);
            g.fillOval(x+372,y+608, 10, 20);
            g.setColor(Color.BLACK);
            g.fillOval(x+327,y+609, 10, 16);
            g.fillOval(x+372,y+609, 10, 16);
            g.setColor(Color.WHITE);
            g.fillOval(x+327, y+605,8, 12);
            g.fillOval(x+372, y+605,8, 12);
            g.setColor(new Color(222, 186, 205));
            g.fillArc(x+320, y+625, 70, 35, 180, 180);
            g.setColor(Color.WHITE);
            g.fillOval(x+335, y+642, 2, 3);
            g.fillOval(x+375, y+642, 2, 3);
            g.fillOval(x+340, y+656, 2, 3);
            g.fillOval(x+370, y+656, 2, 3);
            g.setColor(Color.BLACK);
            g.drawOval(x+327, y+605,8, 12);
            g.drawOval(x+372, y+605,8, 12);
            g.drawArc(x+320, y+625, 70, 35, 180, 180);
            g.drawOval(x+335, y+642, 2, 3);
            g.drawOval(x+375, y+642, 2, 3);
            g.drawOval(x+340, y+656, 2, 3);
            g.drawOval(x+370, y+656, 2, 3);

            //SQUIRTLE
            g.setColor(new Color(155, 204, 221));
            g.fillOval(x+515, y+574, 100, 100);
            g.setColor(Color.WHITE);
            g.fillArc(x+535, y+605, 15, 50, 0, 180);
            g.fillArc(x+580, y+605, 15, 50, 0, 180);
            g.setColor(new Color(215, 121, 159));
            g.fillOval(x+536, y+605, 13, 23);
            g.fillOval(x+581, y+605, 13, 23);
            g.setColor(Color.BLACK);
            g.drawOval(x+515, y+574, 100, 100);
            g.fillOval(x+536, y+605, 13, 18);
            g.fillOval(x+581, y+605, 13, 18);
            g.drawArc(x+530, y+636, 70, 20, 180, 180);
            g.drawOval(x+536, y+605, 13, 23);
            g.drawOval(x+581, y+605, 13, 23);
            g.drawArc(x+535, y+605, 15, 50, 0, 180);
            g.drawArc(x+580, y+605, 15, 50, 0, 180);
            g.setColor(Color.WHITE);
            g.fillOval(x+536, y+604, 13, 8);
            g.fillOval(x+581, y+604, 13, 8);
            g.setColor(Color.BLACK);
            g.drawOval(x+536, y+604, 13, 8);
            g.drawOval(x+581, y+604, 13, 8);

            g.setFont(new Font("Arial", Font.PLAIN, 30));
        }
        else if (ct == 10)
        {
            g.setColor(Color.WHITE);
            g.fillRect(x+52,y+599, 600, 140);
            g.setColor(new Color(145,187,203));
            g.drawRect(x+52,y+599, 600, 140);
            g.setColor(Color.WHITE);
            g.fillRect(x+42, y+610, 30, 120);
            g.fillRect(x+632, y+610, 30, 120);
            g.fillArc(x+42, y+709, 30, 30, 180, 90); //bottom left
            g.fillArc(x+42,y+599, 30, 30, 90, 90); //top left
            g.fillArc(x+632, y+709, 30, 30, 270, 90); //bottom right
            g.fillArc(x+632, y+599, 30, 30, 0, 90); //top right
            g.setColor(new Color(145,187,203));
            g.drawRect(x+42, y+610, 30, 120);
            g.drawRect(x+632, y+610, 30, 120);
            g.drawArc(x+42, y+709, 30, 30, 180, 90); //bottom left
            g.drawArc(x+42,y+599, 30, 30, 90, 90); //top left
            g.drawArc(x+632, y+709, 30, 30, 270, 90); //bottom right
            g.drawArc(x+632, y+599, 30, 30, 0, 90); //top right
            g.setColor(Color.WHITE);
            g.fillRect(x+44, y+610, 30, 121);
            g.fillRect(x+632, y+610, 30, 121);
            g.setColor(Color.BLACK);
            g.drawString("If a wild Pokémon appears, your Pokémon", 50, 640);
            g.drawString("will battle it.   ¤", 50, 680);
        }
        else if (ct == 11)
        {
            g.drawString("Go out, and explore the world of Pokémon!", 50, 640);
            g.drawString("Good luck!", 50, 680);
            g.drawString("Use the arrow keys to move!  ¤", 50, 720);
        }
    }

    public int getct()
    {
        return ct;
    }

    public void setct(int x)
    {
        ct = x;
    }

    public Rectangle getbulb()
    {
        return bulb;
    }

    public Rectangle getcharm()
    {
        return charm;
    }

    public Rectangle getsquirt()
    {
        return squirt;
    }
}
