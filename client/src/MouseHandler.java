import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.event.MouseInputListener;


public class MouseHandler implements MouseMotionListener, MouseInputListener{
    public MouseHandler(){
        addMouseMotionListener(null);
        addMouseListener(this);  
    }
    
    public void mouseDragged(MouseEvent e) {
        System.out.println("mouseDragged");
        DragImage image= (DragImage) e.getSource();
                image.imageX = e.getX()+image.deltaX;
                image.imageY = e.getY()+image.deltaY;
        image.repaint();
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("mouseMoved");
    }

//    public void paint(Graphics g) {
//        System.out.println("paint");
//        Graphics2D g2 = (Graphics2D) g;
//        g2.drawImage(image, imageX, imageY, this);
//        //g.drawImage(image, imageX, imageY, this);
//    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("MOUSE CLICKED");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
        System.out.println("MOUSE PRESSED");
        DragImage image= (DragImage) e.getSource();
        image.deltaX=image.imageX-e.getX();
        image.deltaY=image.imageY-e.getY();
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
