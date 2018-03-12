package PolyClient;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

    private JLabel eventLabel;

    public MainFrame() {
        super("Mouse catcher");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.addMouseListener(new CustomListener());
        mainPanel.addMouseMotionListener(new CustomListener());
        eventLabel = new JLabel();
        eventLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(eventLabel, BorderLayout.CENTER);

        getContentPane().add(mainPanel);
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

    public class CustomListener implements MouseListener, MouseMotionListener {

        public void mouseClicked(MouseEvent e) {
            eventLabel.setText("Click: " + e.getX() + ":" + e.getY());
        }

        public void mouseEntered(MouseEvent e) {
            eventLabel.setText("Enter: " + e.getX() + ":" + e.getY());
        }

        public void mouseExited(MouseEvent e) {
            eventLabel.setText("Exit: " + e.getX() + ":" + e.getY());
        }

        public void mousePressed(MouseEvent e) {
            eventLabel.setText("Press: " + e.getX() + ":" + e.getY());
        }

        public void mouseReleased(MouseEvent e) {
            eventLabel.setText("Releas: " + e.getX() + ":" + e.getY());
        }

        public void mouseDragged(MouseEvent e) {
            eventLabel.setText("Dragg: " + e.getX() + ":" + e.getY());
        }

        public void mouseMoved(MouseEvent e) {
            eventLabel.setText("Move: " + e.getX() + ":" + e.getY());
        }
    }

}