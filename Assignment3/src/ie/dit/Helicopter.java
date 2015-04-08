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
		//applet.rect(location.x, location.y, w, h);
		//applet.triangle(100,100, 200, 200,300, 300);
		//applet.triangle(30, 75, 58, 20, 86, 75);
		applet.rect(location.x +12, location.y + h, 6, h-20); // Tail
		applet.rect(location.x - 5, location.y + h/2, 40, 3); // Crossbar
		applet.rect(location.x, location.y + ( (h * 2) - 25), 30, 3);
		applet.ellipse(location.x  + (w/2), location.y  + (h/2), w, h);
		
		
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