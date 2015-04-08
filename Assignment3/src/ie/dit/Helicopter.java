package ie.dit;

import processing.core.PApplet;

public class Helicopter extends GameObject {

	
	Helicopter(PApplet applet) {
		super(applet);
		w = 70;
		h = 150;
		
	} // End Constructor.
	
	
	
	public void display() {
		applet.fill(255);
		applet.rect(location.x, location.y, w, h);
		applet.noFill();
		
		
	} //End Display.
} //End Helicopter Class.