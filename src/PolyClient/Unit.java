package PolyClient;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Unit extends JPanel{
    private JLabel eventLabel;
    JPanel mainPanel = new JPanel();

    public Unit() {
        mainPanel.setLayout(new BorderLayout());
        mainPanel.addMouseListener(new Unit.CustomListener());
        mainPanel.addMouseMotionListener(new Unit.CustomListener());
        eventLabel = new JLabel();
        eventLabel.setSize(20, 20);
        mainPanel.add(eventLabel, BorderLayout.PAGE_END);
    }

    public void paint (Graphics g){
        super.paint(g);
        g.setColor(Color.BLUE); // устанавливаем текущий цвет
        g.drawRoundRect(60, 60, 210, 210, 50, 10);
        g.drawString("Hello From Java 2D", 50, 50);
        g.fillRect(20, 20, 60, 60);
    }

    public class CustomListener implements MouseListener, MouseMotionListener {
        public void mouseClicked(MouseEvent e) {
            eventLabel.setText("Click: " + e.getX() + ":" + e.getY());
            repaint();
        }
        public void mouseEntered(MouseEvent e) {
            eventLabel.setText("Enter: " + e.getX() + ":" + e.getY());
            repaint();
        }
        public void mouseExited(MouseEvent e) {
            eventLabel.setText("Exit: " + e.getX() + ":" + e.getY());
            repaint();
        }
        public void mousePressed(MouseEvent e) {
            eventLabel.setText("Press: " + e.getX() + ":" + e.getY());
            repaint();
        }
        public void mouseReleased(MouseEvent e) {
            eventLabel.setText("Releas: " + e.getX() + ":" + e.getY());
            repaint();
        }
        public void mouseDragged(MouseEvent e) {
            eventLabel.setText("Dragg: " + e.getX() + ":" + e.getY());
            repaint();
        }
        public void mouseMoved(MouseEvent e) {
            eventLabel.setText("Move: " + e.getX() + ":" + e.getY());
            repaint();
        }
    }

}
