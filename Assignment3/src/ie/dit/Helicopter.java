package ie.dit;

import processing.core.PApplet;
import processing.core.PVector;

public class Helicopter extends GameObject {

	float rotor;
	
	Helicopter(PApplet applet) {
		super(applet);
		w = 30;
		h = 40;
		rotor = 0.0f;
		location = new PVector(300,300);
		
	} // End Constructor.
	
	
	
	public void display() {
		applet.noStroke();
		applet.fill( colour.getRed(), colour.getGreen(), colour.getBlue(), colour.getAlpha() );
		
		applet.pushMatrix();
		applet.translate(location.x  + (w/2), location.y  + (h/2));
		applet.rotate(theta);
		
		applet.rect(-3,h-20, 6, h-20); // Tail.
		
		//applet.rect(-5, h/2, 40, 3); // Crossbar
		applet.rect(-15, h, 30, 3);
		applet.ellipse(0,0, w, h);
		applet.popMatrix();
		
		applet.pushMatrix();
		applet.translate(location.x  + (w/2), location.y  + (h/2));
		applet.rotate(rotor);
		applet.fill(0);
		applet.rect( -1.5f, -40, 3, 80); // Vertical rotor
		applet.rect( -40, -1.5f, 80, 3); // Horizontal rotor
		applet.popMatrix();
		
		applet.noFill();

		
		
	} //End Display.
	
	
	
	public void update() {
		rotor += 0.5f;
	} // End update.
	
} //End Helicopter Class.