import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.RepaintManager;

public class DragImageTest extends JComponent implements MouseMotionListener {
    static int imageWidth = 60, imageHeight = 60;
    int imageX, imageY;

    Image image;

    public DragImageTest(Image i) {
        image = i;
        addMouseMotionListener(this);
    }

    public void mouseDragged(MouseEvent e) {
        imageX = e.getX();
        imageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.drawImage(image, imageX, imageY, this);
    }

    public static void main(String[] args) {
        String imageFile = "test_image.png";
        // Turn off double buffering
        //RepaintManager.currentManager(null).setDoubleBufferingEnabled(false);

        try {
            // Image image =
            // Toolkit.getDefaultToolkit().getImage(DragImage.class.getResource(imageFile));
            Image image = ImageIO.read(new File(imageFile));
            image = image.getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);
            JFrame frame = new JFrame("DragImage");
            frame.getContentPane().add(new DragImageTest(image));
            frame.setSize(300, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}