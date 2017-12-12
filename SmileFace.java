package all;

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;

public class SmileFace extends JPanel
{
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.drawArc(100, 45, 80, 80, 0, 360);

        g.setColor( Color.blue );
        g.drawArc( 120, 70, 10, 10, 0, 360);
        g.drawArc( 150, 70, 10, 10, 0, 360);

        g.setColor( Color.magenta );
        g.drawLine ( 140, 85, 140, 100 );

        g.setColor( Color.red );
        g.drawArc ( 110, 55, 60, 60, 0, -180 );
    }

    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(250, 250);
    }

    private static void createAndShowGUI()
    {
        JComponent face = new SmileFace();
        face.setForeground(Color.GREEN);
        //face.setBackground(Color.YELLOW);

        JPanel contentPane = new JPanel( new BorderLayout() );
        contentPane.setBackground( Color.CYAN );
        contentPane.add( face );

        JFrame frame = new JFrame("Smile");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane( contentPane );
        frame.setLocationByPlatform( true );
        frame.pack();
        frame.setVisible( true );
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }
}
