import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class grassarea
{
    // instance variables - replace the example below with your own
    private int x, y;
    
    public grassarea()
    {
        x = 0;
    }

    public void drawarea(Graphics2D g)
    {
        g.setColor(new Color(184, 252, 212));
        g.fillRect(0, 0, 800, 800);
    }
}
