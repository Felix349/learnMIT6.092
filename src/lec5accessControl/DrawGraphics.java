package lec5accessControl;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
	BouncingBox box;
	ArrayList<BouncingBox> boxes = new ArrayList<>();

	/** Initializes this class for drawing. */
	public DrawGraphics() {
		boxes.add(new BouncingBox(150, 50, Color.BLUE));
		boxes.add(new BouncingBox(50, 150, Color.RED));
		boxes.add(new BouncingBox(200, 200, Color.YELLOW));
		//box.setMovementVector(0, -2);
		for (int i=0; i < boxes.size(); i++) {
			boxes.get(i).setMovementVector(i-1, i+1);
		}
	}

	/** Draw the contents of the window on surface. Called 20 times per second. */
	public void draw(Graphics surface) {
		surface.drawLine(50, 50, 200, 200);
		surface.draw3DRect(75, 175, 30, 30, false);
		surface.drawOval(125, 225, 35, 25);
		for (BouncingBox box: boxes) {
			box.draw(surface);
		}

	}

}