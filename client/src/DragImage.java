import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;
import javax.swing.event.MouseInputListener;

public class DragImage extends JComponent implements MouseMotionListener, MouseInputListener{
    int imageX, imageY, deltaX, deltaY;

    Image image;

    public DragImage(Image i, int x, int y) {
        image = i;
        imageX=x;
        imageY=y;
        addMouseMotionListener(this);
        addMouseListener(this);  
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println("mouseDragged");
        imageX = e.getX()+deltaX;
        imageY = e.getY()+deltaY;
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

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("MOUSE CLICKED");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
        System.out.println("MOUSE PRESSED");
        deltaX=imageX-e.getX();
        deltaY=imageY-e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

}