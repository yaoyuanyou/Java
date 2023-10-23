package assignment;
import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
	BouncingBox box1;
	BouncingBox box2;
	BouncingBox box3;
	BouncingBox box4;
	public DrawGraphics () {
		box1 = new BouncingBox(200, 50, Color.RED);
		box1.setMovementVector(0,1);
		box2 = new BouncingBox(200, 70, Color.BLUE);
		box2.setMovementVector(-1,-1);
		box3 = new BouncingBox(200, 90, Color.GREEN);
		box3.setMovementVector(1,0);
		box4 = new BouncingBox(200, 110, Color.YELLOW);
		box4.setMovementVector(-1,1);
	}
	/** Draw the contents of the window on surface. Called 20 times per second. */
	public void draw(Graphics surface) {
		surface.drawLine(50, 50, 250, 250);
		surface.drawOval(50, 100, 20,50);
		int[] xPoints = {0, 30, 50};
		int[] yPoints = {10, 20, 100};
		surface.drawPolygon(xPoints, yPoints, 3);
		surface.fill3DRect(150, 50, 50, 100, true);
		box1.draw(surface);
		box2.draw(surface);
		box3.draw(surface);
		box4.draw(surface);
	}
}