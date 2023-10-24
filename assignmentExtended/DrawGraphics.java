package assignmentExtended;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
	ArrayList<Mover> mover = new ArrayList<>();

	/** Initializes this class for drawing. */
	public DrawGraphics() {

		Rectangle box1 = new Rectangle(15, 20, Color.RED);
		Oval oval1 = new Oval(15, 20, Color.BLUE);

		mover.add(new Bouncer(100, 170, box1));
		mover.add(new Bouncer(100, 190, oval1));
		mover.add(new StraightMover(100, 170, box1));
		mover.add(new StraightMover(100, 190, oval1));
		for (Mover Sprite : mover) {
			if (Sprite.getClass() == Bouncer.class) {
				Sprite.setMovementVector(3, 1);
			} else {
				Sprite.setMovementVector(3, -1);
			}
		}
	}

	/** Draw the contents of the window on surface. */
	public void draw(Graphics surface) {

		for (Mover Sprite : mover) {
			Sprite.draw(surface);
		}

	}
}
