import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

public class DragImage extends JComponent implements MouseMotionListener {
    int imageX, imageY;

    Image image;

    public DragImage(Image i) {
        image = i;
        addMouseMotionListener(this);
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println("mouseDragged");
        imageX = e.getX();
        imageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("mouseMoved");
    }

    public void paint(Graphics g) {
        System.out.println("paint");
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(image, imageX, imageY, this);
        //g.drawImage(image, imageX, imageY, this);
    }

}