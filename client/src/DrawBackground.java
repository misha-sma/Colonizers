import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

public class DrawBackground extends JComponent implements MouseMotionListener {
//    int imageX, imageY;
//
//    Image image;

    public DrawBackground() {
//        image = i;
 //       addMouseMotionListener(this);
    }

    public void mouseDragged(MouseEvent e) {
//        System.out.println("mouseDragged");
//        imageX = e.getX();
//        imageY = e.getY();
//        repaint();
    }

    public void mouseMoved(MouseEvent e) {
//        System.out.println("mouseMoved");
    }

    public void paint(Graphics g) {
        System.out.println("paint");
        Graphics2D g2 = (Graphics2D) g;
        MainClass.drawField(g, 100, 200, MainClass.EDGE_SIZE);
//        g2.drawImage(image, imageX, imageY, this);
        //g.drawImage(image, imageX, imageY, this);
    }

}