import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class Driver extends JFrame implements Runnable, KeyListener, MouseListener//Other implementables
{
    Container con = getContentPane();
    Thread t = new Thread(this);
    private Random ran;
    // All variables and objects declared here.
    Background bkgrd = new Background();
    MainProt mvp = new MainProt();
    TREES t1[] = new TREES[200]; 
    grass g1[] = new grass[700];
    house h = new house();
    int ct, poss;
    boolean cd, poke, att1, att2, att3, inBattle;
    int z = 0, z1 = 0, x = -22, y = 35, w = 1, gx = -30, gy = 50, pok = 0, ctt = 1;
    String Strin;
    public Driver()
    {
        con.setLayout(new FlowLayout());
        addKeyListener(this);
        addMouseListener(this);
        
        ran = new Random();
        inBattle = false;
        ct = 0;
        cd = true;
        att1 = false;
        att2 = false;
        att3 = false;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        t.start();
        Strin = new String();
        for (int index = 0; index<t1.length; index++)
        {
            t1[index] = new TREES();
        }
        for (int index = 0; index<t1.length; index++)
        {
            if (z<9)
            {
                x+=30;
                t1[index].setLoc(x, y);
                z++;
            }
            else if (z<32)
            {
                x = 8;
                y+=30;
                t1[index].setLoc(x, y);
                z++;
            }
            else if (z<54)
            {
                x+=30;
                t1[index].setLoc(x, y);
                z++;
            }
            else if (z<77)
            {
                y-=30;
                x = 660;
                t1[index].setLoc(x, y);
                z++;
            }
            else if (z<86)
            {
                x-=30;
                t1[index].setLoc(x, y);
                z++;
            }
            else if (z==86)
            {
                x = -22;
                z++;
            }
            else if (z<200)
            {
                x+=30;
                y = 738;
                t1[index].setLoc(x, y);
                z++;
            }
        }
        for (int index = 0; index<g1.length; index++)
        {
            g1[index] = new grass();
        }
        for (int index = 0; index<90; index++)
        {
            g1[index].setLoc(ran.nextInt(800), ran.nextInt(575)+35);
        }
        for (int index = 90; index<g1.length; index++)
        {
            if (z1<20)
            {
                gx+=35;
                g1[index].setx(gx);
                g1[index].sety(45);
                z1++;
            }
            else if (z1 == 20)
            {
                gx = -30;
                z1++;
            }
            else if (z1<42)
            {
                gx+=35;
                g1[index].setx(gx);
                g1[index].sety(70);
                z1++;
            }
            else if (z1 == 42)
            {
                gx = -30;
                z1++;
            }
            else if (z1<63)
            {
                gx+=35;
                g1[index].setx(gx);
                g1[index].sety(105);
                z1++;
            }
            else if (z1 == 63)
            {
                gx = -30;
                z1++;
            }
            else if (z1<84)
            {
                gx+=35;
                g1[index].setx(gx);
                g1[index].sety(140);
                z1++;
            }
            else if (z1 == 84)
            {
                gx = -30;
                z1++;
            }
            else if (z1<106)
            {
                gx+=35;
                g1[index].setx(gx);
                g1[index].sety(175);
                z1++;
            }
            else if (z1 == 106)
            {
                gx = -30;
                z1++;
            }
            else if (z1<128)
            {
                gx+=35;
                g1[index].setx(gx);
                g1[index].sety(210);
                z1++;
            }
            else if (z1 == 128)
            {
                gx = -30;
                z1++;
            }
            else if (z1<150)
            {
                gx+=35;
                g1[index].setx(gx);
                g1[index].sety(245);
                z1++;
            }
            else if (z1 == 150)
            {
                gx = -30;
                z1++;
            }
            else if (z1<172)
            {
                gx+=35;
                g1[index].setx(gx);
                g1[index].sety(280);
                z1++;
            }
            else if (z1 == 172)
            {
                gx = -30;
                z1++;
            }
            else if (z1<194)
            {
                gx+=35;
                g1[index].setx(gx);
                g1[index].sety(315);
                z1++;
            }
            else if (z1 == 194)
            {
                gx = -30;
                z1++;
            }
            else if (z1<226)
            {
                gx+=35;
                g1[index].setx(gx);
                g1[index].sety(350);
                z1++;
            }
            else if (z1 == 226)
            {
                gx = -30;
                z1++;
            }
            else if (z1<248)
            {
                gx+=35;
                g1[index].setx(gx);
                g1[index].sety(385);
                z1++;
            }
            else if (z1 == 248)
            {
                gx = -30;
                z1++;
            }
            else if (z1<270)
            {
                gx+=35;
                g1[index].setx(gx);
                g1[index].sety(420);
                z1++;
            }
        }
    }

    public void run()
    {
        try{
            while(true)
            {
                t.sleep(67);//Smaller number == faster, larger == slower
                /*
                All motion and collision detection coded here
                 */

                bkgrd.move();

                for (int index = 0; index<90; index++)
                {
                    g1[index].move();
                }
                for (int index = 90; index<g1.length; index++)
                {
                    if (mvp.getRect().intersects(g1[index].getRect()))
                    {
                        poss = ran.nextInt(250);
                        if (poss==1 && !inBattle)
                        {
                            ct = 4;
                            JOptionPane.showMessageDialog(null, "A wild WEEDLE appeared!");
                            inBattle = true;
                        }
                    }
                }
                for (int index = 0; index<t1.length; index++)
                {
                    if (mvp.getRect().intersects(t1[index].getRect()))
                    {
                        if (index<9)
                        {
                            mvp.sety(t1[index].gety()+40);
                        }
                        else if (index<32)
                        {
                            mvp.setx(t1[index].getx()+35);
                        }
                        else if (index<54)
                        {
                            mvp.sety(t1[index].gety()-25);
                        }
                        else if (index<77)
                        {
                            mvp.setx(t1[index].getx()-25);
                        }
                        else if (index<86)
                        {
                            mvp.sety(t1[index].gety()+40);
                        }
                        else if (index<200)
                        {
                            mvp.sety(t1[index].gety()-25);
                        }
                    }
                }
                if (bkgrd.getehp()<=0)
                {
                    JOptionPane.showMessageDialog(null, "Thanks for playing!");
                    System.exit(0);
                }
                mvp.move();
                repaint();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void paint(Graphics gr)
    {
        Image i=createImage(getSize().width, getSize().height);
        Graphics2D g = (Graphics2D)i.getGraphics();

        if (ct == 0)
        {
            g.setColor(new Color(110, 198, 158));
            g.fillRect(0, 0, 800, 800);
            g.setColor(new Color(191, 221, 158));
            g.fillRect(0,640,800,20);
            g.setColor(new Color(230, 223, 135));
            g.fillRect(0,660, 800, 800);
            for (int index = 0; index<90; index++)
            {
                g1[index].draw(g);
            }
            bkgrd.drawmenu(g);
        }
        else if (ct == 1)
        {
            bkgrd.drawroom(g);
            if (bkgrd.getct()>11)
            {
                ct = 2;
            }
        }
        else if (ct == 2)
        {
            bkgrd.drawhouse(g);   
            for (int index = 0; index<t1.length; index++)
            {
                t1[index].draw(g);
            }
            mvp.draw(g);
            bkgrd.drawroof(g);
            if (mvp.gety()<0)
            {
                mvp.sety(760);
                ct = 3;
            }
            if (mvp.getRect().intersects(bkgrd.gethousesign()))
            {
                bkgrd.housemessage(g);
            }
            if (mvp.getRect().intersects(h.getRecth()))
            {
                if (mvp.gety()<h.getyh()+95)
                {
                    mvp.sety(170); //not important
                }
                else if (mvp.gety()>h.getyh()+95)
                {
                    mvp.sety(230);
                }
                else if (mvp.getx()<h.getxh()+100)
                {
                    mvp.setx(50);
                }
                else if (mvp.getx()>h.getxh()+100)
                {
                    mvp.setx(275);
                }
            }
            if (mvp.getRect().intersects(h.getRecth1()))
            {
                if (mvp.getx()<h.getxh1()+100)
                {
                    mvp.setx(h.getxh1()-20);
                }
                else if (mvp.getx()>h.getxh1()+100)
                {
                    mvp.setx(h.getxh1()+210);
                }
                else if (mvp.gety()<h.getyh2()+20)
                {
                    mvp.sety(170); //not important
                }
                else if (mvp.gety()>h.getyh()+95)
                {
                    mvp.sety(230);
                }
                if (mvp.getRect().intersects(h.getRecth2()))
                {
                    if (mvp.gety()<h.getyh2()+20)
                    {
                        mvp.sety(h.getyh2()-25);
                    }
                    else if (mvp.gety()>h.getyh2()+20)
                    {
                        mvp.sety(h.getyh2()+75);
                    }
                    else if (mvp.getx()<h.getxh()+100)
                    {
                        mvp.setx(50);
                    }
                    else if (mvp.getx()>h.getxh()+100)
                    {
                        mvp.setx(275);
                    }
                }
                if (mvp.getRect().intersects(h.getRecth3()))
                {
                    if (mvp.gety()<h.getyh2()+20)
                    {
                        mvp.sety(h.getyh2()-25);
                    }
                    else if (mvp.gety()>h.getyh2()+20)
                    {
                        mvp.sety(h.getyh2()+75);
                    }
                    else if (mvp.getx()<h.getxh1()+100)
                    {
                        mvp.setx(h.getxh1()-20);
                    }
                    else if (mvp.getx()>h.getxh1()+100)
                    {
                        mvp.setx(h.getxh1()+210);
                    }
                }
            }
        }
        else if (ct == 3)
        {
            bkgrd.drawarea(g);
            for (int index = 90; index<g1.length; index++)
            {
                g1[index].draw(g);
            }
            for (int index = 86; index<t1.length; index++)
            {
                t1[index].draw(g);
            }
            mvp.draw(g);
            if (mvp.gety()>768)
            {
                JOptionPane.showMessageDialog(null, "You can't go back anymore! You must push into the world of Pokémon!");
            }
            if (mvp.getRect().intersects(bkgrd.getgrasssign()))
            {
                bkgrd.grassmessage(g);
            }
        }
        else if (ct == 4)
        {
            if (pok == 1)
            {
                bkgrd.drawfight1(g);
                if (att1)
                {
                    bkgrd.drawatt1(g);
                }
                if (ctt%2 == 0)
                {
                    if (ctt <= 30)
                    {
                        bkgrd.tackle(g);
                        ctt+=2;
                    }
                    if (ctt >= 32)
                    {
                        bkgrd.eattack(g);
                        ctt+=2;
                    }
                    if (ctt >= 64)
                    {
                        bkgrd.setehp(bkgrd.getehp()-30);
                        bkgrd.sethp(bkgrd.gethp()-20);
                        bkgrd.setct(bkgrd.getct()-1);
                        ctt = 1;
                        att1 = false;
                        bkgrd.drawfight1(g);
                    }
                }
            }
            else if (pok == 2)
            {
                bkgrd.drawfight2(g);
                if (att2)
                {
                    bkgrd.drawatt2(g);
                }
                if (ctt%2 == 0)
                {
                    if (ctt <= 30)
                    {
                        bkgrd.scratch(g);
                        ctt+=2;
                    }
                    if (ctt >= 32)
                    {
                        bkgrd.eattack(g);
                        ctt+=2;
                    }
                    if (ctt >= 64)
                    {
                        bkgrd.setehp(bkgrd.getehp()-30);
                        bkgrd.sethp(bkgrd.gethp()-20);
                        ctt = 1;
                        att2 = false;
                        bkgrd.drawfight2(g);
                    }    
                }
            }
            if (pok == 3)
            {
                bkgrd.drawfight3(g);
                if (att3)
                {
                    bkgrd.drawatt3(g);
                }
                if (ctt%2 == 0)
                {
                    if (ctt <= 30)
                    {
                        bkgrd.tackle1(g);
                        ctt+=2;
                    }
                    if (ctt >= 32)
                    {
                        bkgrd.eattack(g);
                        ctt+=2;
                    }
                    if (ctt >= 64)
                    {
                        bkgrd.setehp(bkgrd.getehp()-30);
                        bkgrd.sethp(bkgrd.gethp()-20);
                        ctt = 1;
                        att3 = false;
                        bkgrd.drawfight3(g);
                    }    
                }
            }

            if (bkgrd.getehp()<=0)
            {

            }
        }
        g.dispose();
        gr.drawImage(i, 0, 0, this);
    }

    public static void main(String[] args)
    {
        Driver frame = new Driver();
        frame.setSize(700, 768);//determines size of screen
        frame.setVisible(true);
    }

    public void update(Graphics g)
    {
        paint(g);
    } 

    public void keyReleased(KeyEvent k)
    {
        if (k.getKeyCode() == 32) //SPACE
        {
            if (bkgrd.getct()!=9)
            {
                bkgrd.setct(bkgrd.getct()+1);
            }
        }
        mvp.setxVel(0);
        mvp.setyVel(0);
    }

    public void keyPressed(KeyEvent k)
    {
        if (k.getKeyCode() == 37) //LEFT
        {
            mvp.turnLeft();
        }
        if (k.getKeyCode() == 39) //RIGHT
        {
            mvp.turnRight();
        }
        if (k.getKeyCode() == 40) //DOWN
        {
            mvp.TurnDown();
        }
        if (k.getKeyCode() == 38) //UP
        {
            mvp.TurnUp(); //woot
        }
    }

    public void keyTyped(KeyEvent k)
    {

    }

    public void mousePressed(MouseEvent m) 
    {

    }

    public void mouseReleased(MouseEvent m) 
    {
        if (ct == 0)
        {
            if (bkgrd.getplay().contains(m.getPoint()))
            {
                ct = 1;
            }
            if (bkgrd.getinstructions().contains(m.getPoint()))
            {
                JOptionPane.showMessageDialog(null, "Arrow Keys to move. Space key to move dialogue.");
            }
            if (bkgrd.getquit().contains(m.getPoint()))
            {
                System.exit(0);
            }
        }

        if (ct == 1)
        {
            if (bkgrd.getbulb().contains(m.getPoint()))
            {
                Strin = JOptionPane.showInputDialog("This is a PLANT type Pokémon. Are you sure you want to choose this Pokémon?", "Yes");
                if (Strin.equals("Yes"))
                {
                    bkgrd.setct(10);
                    pok = 1;
                }
            }
            if (bkgrd.getcharm().contains(m.getPoint()))
            {
                Strin = JOptionPane.showInputDialog("This is a FIRE type Pokémon. Are you sure you want to choose this Pokémon?", "Yes");
                if (Strin.equals("Yes"))
                {
                    bkgrd.setct(10);
                    pok = 2;
                }
            }
            if (bkgrd.getsquirt().contains(m.getPoint()))
            {
                Strin = JOptionPane.showInputDialog("This is a WATER type Pokémon. Are you sure you want to choose this Pokémon?", "Yes");
                if (Strin.equals("Yes"))
                {
                    bkgrd.setct(10);
                    pok = 3;
                }
            }
        }

        if (ct == 4)
        {
            if (bkgrd.getfight().contains(m.getPoint()))
            {
                if (pok == 1)
                {
                    att1 = true;
                }
                else if (pok == 2)
                {
                    att2 = true;
                }
                else if (pok == 3)
                {
                    att3 = true;
                }   
            }
            if (bkgrd.getbag().contains(m.getPoint()))
            {
                JOptionPane.showMessageDialog(null, "You have no items.");
            }
            if (bkgrd.getpkmn().contains(m.getPoint()))
            {
                JOptionPane.showMessageDialog(null, "You have no other Pokémon.");
            }
            if (bkgrd.getflee().contains(m.getPoint()))
            {
                JOptionPane.showMessageDialog(null, "You tried to flee, but failed!");
            }
            if (bkgrd.gettackle().contains(m.getPoint()) || bkgrd.getscratch().contains(m.getPoint()) || bkgrd.gettackle1().contains(m.getPoint()))
            {
                ctt = 2;
            }
        }
    }

    public void mouseEntered(MouseEvent m)
    {

    }

    public void mouseExited(MouseEvent m)
    {

    }

    public void mouseClicked(MouseEvent m)
    {

    }
}