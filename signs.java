import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class signs
{
    // instance variables - replace the example below with your own
    private int x, y;
    Rectangle housesign, grasssign;
    public signs()
    {
        housesign = new Rectangle(x, y, 25, 13);
        grasssign = new Rectangle(x, y, 25, 13);
    }

    public void housesign(Graphics2D g)
    {
        x = 260;
        y = 100;
        housesign = new Rectangle(x, y, 25, 13);
        g.setColor(new Color(178, 141, 77));
        g.fillRect(x+11, y+12, 3, 8);
        g.setColor(Color.BLACK);
        g.drawRect(x+11, y+12, 3, 8);
        g.setColor(new Color(178, 141, 77));
        g.fillRect(x, y, 25, 13);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 25, 13);
        g.fillRect(x+2, y+4, 21, 1);
        g.fillRect(x+2, y+7, 21, 1);
        g.fillRect(x+2, y+10, 21, 1);
    }

    public void grasssign(Graphics2D g)
    {
        x = 250;
        y = 650;
        grasssign = new Rectangle(x, y, 25, 13);
        g.setColor(new Color(178, 141, 77));
        g.fillRect(x+11, y+12, 3, 8);
        g.setColor(Color.BLACK);
        g.drawRect(x+11, y+12, 3, 8);
        g.setColor(new Color(178, 141, 77));
        g.fillRect(x, y, 25, 13);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 25, 13);
        g.fillRect(x+2, y+4, 21, 1);
        g.fillRect(x+2, y+7, 21, 1);
        g.fillRect(x+2, y+10, 21, 1);
    }

    public void housemessage(Graphics2D g)
    {
        x = 160;
        y = 385;
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 344, 30);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 344, 30);        
        g.setFont(new Font("Arial", Font.PLAIN, 22));
        g.drawString("Go through the clearing to advance!", x+2, y+22);
    }

    public void grassmessage(Graphics2D g)
    {
        x = 160;
        y = 535;
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 344, 60);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 344, 60);        
        g.setFont(new Font("Arial", Font.PLAIN, 22));
        g.drawString("Walk through the grass for the", x+24, y+22);
        g.drawString("chance of a POKéMON appearing!", x+2, y+48);
    }

    public Rectangle gethousesign()
    {
        return housesign;
    }

    public Rectangle getgrasssign()
    {
        return grasssign;
    }
}
