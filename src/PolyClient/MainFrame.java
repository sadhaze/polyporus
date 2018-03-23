package PolyClient;

import java.awt.*;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
    Unit unit = new Unit();

    public MainFrame() {
        super("Mouse catcher");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(unit.mainPanel);
    }

    public void start() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                JFrame frame = new MainFrame();
                frame.setPreferredSize(new Dimension(500, 500));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public void paint(Graphics g){
        unit.paint(g);
    }
}