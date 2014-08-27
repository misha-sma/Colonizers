import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainClass {
	public static final double SQRT_3 = Math.sqrt(3);
	public static final int EDGE_SIZE = 50;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Colonizers Misha");
		frame.setBounds(0, 0, 1920, 1080);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentPane = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(Color.BLACK);
				// drawHexagon(g, 100, 100, EDGE_SIZE);
				// drawLineOfHexagons(5, g, 100, 800, EDGE_SIZE);
				drawField(g, 100, 200, EDGE_SIZE);
			}
		};
		frame.setContentPane(contentPane);

	}

	private static void drawField(Graphics g, int x, int y, int edgeSize) {
		drawLineOfHexagons(3, g, x, y, edgeSize);
		drawLineOfHexagons(4, g, x, Util.round(y + SQRT_3 * edgeSize), edgeSize);
		drawLineOfHexagons(5, g, x, Util.round(y + 2 * SQRT_3 * edgeSize), edgeSize);
		drawLineOfHexagons(4, g, Util.round(x + 1.5 * edgeSize), Util.round(y + 2.5 * SQRT_3 * edgeSize), edgeSize);
		drawLineOfHexagons(3, g, Util.round(x + 3 * edgeSize), Util.round(y + 3 * SQRT_3 * edgeSize), edgeSize);
	}

	private static void drawLineOfHexagons(int count, Graphics g, int x, int y, int edgeSize) {
		for (int i = 0; i < count; ++i) {
			drawHexagon(g, Util.round(x + i * 1.5 * edgeSize), Util.round(y - i * SQRT_3 * 0.5 * edgeSize), edgeSize);
		}
	}

	private static void drawHexagon(Graphics g, int x, int y, int edgeSize) {
		g.setColor(Color.BLACK);
		g.drawLine(x, y, x + edgeSize, y);
		g.drawLine(x + edgeSize, y, Util.round(x + 1.5 * edgeSize), Util.round(y + SQRT_3 * 0.5 * edgeSize));
		g.drawLine(Util.round(x + 1.5 * edgeSize), Util.round(y + SQRT_3 * 0.5 * edgeSize), x + edgeSize,
				Util.round(y + SQRT_3 * edgeSize));
		g.drawLine(x + edgeSize, Util.round(y + SQRT_3 * edgeSize), x, Util.round(y + SQRT_3 * edgeSize));
		g.drawLine(x, Util.round(y + SQRT_3 * edgeSize), Util.round(x - 0.5 * edgeSize),
				Util.round(y + SQRT_3 * 0.5 * edgeSize));
		g.drawLine(Util.round(x - 0.5 * edgeSize), Util.round(y + SQRT_3 * 0.5 * edgeSize), x, y);
	}
}
