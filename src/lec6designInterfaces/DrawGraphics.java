package lec6designInterfaces;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
	//ArrayList<Bouncer> movingSprites = new ArrayList<>();
	//ArrayList<StraightMover> straightMovers = new ArrayList<>(); 
	ArrayList<Mover> movers = new ArrayList<>();

	/** Initializes this class for drawing. */
	public DrawGraphics() {
		// add Bouncers to ArrayList
		Rectangle box = new Rectangle(15, 20, Color.RED);
		Oval ball = new Oval(50, 40, Color.YELLOW);
		//movingSprites.add(new Bouncer(100, 170, box));
		//movingSprites.add(new Bouncer(100, 20, ball));
		movers.add(new Bouncer(100, 170, box));
		movers.add(new Bouncer(100, 20, ball));

		int i = 0;
//		for (Bouncer sprite : movingSprites) {
//			sprite.setMovementVector(i+3, 2 * i + 1);
//			i++;
//		}
		
		// add straightMovers to ArrayList
		box = new Rectangle(30, 40, Color.GREEN);
		ball = new Oval(40, 20, Color.CYAN);
		movers.add(new StraightMover(60, 170, box));
		movers.add(new StraightMover(180, 200, ball));
//		straightMovers.add(new StraightMover(60, 170, box));
//		straightMovers.add(new StraightMover(180, 200, ball));
//		for (StraightMover sprite : straightMovers) {
//			sprite.setMovementVector(i+3, 2 * i + 1);
//			i++;
//		}
		for (Mover sprite: movers) {
			sprite.setMovementVector(i + 3, 2 * i + 1);
		}
	}

	/** Draw the contents of the window on surface. */
	public void draw(Graphics surface) {
		//movingSprite.draw(surface);
//		for (Bouncer sprite : movingSprites) {
//			sprite.draw(surface);
//		}
//		for (StraightMover sprite : straightMovers) {
//			sprite.draw(surface);
//		}
		for (Mover sprite: movers) {
			sprite.draw(surface);
		}
	}
}
