package ie.dit;

/*
 * This is the base class for our game objects.
 * 
 */

import java.awt.Color;
import processing.core.PApplet;
import processing.core.PVector;

// Base object class.
public class GameObject {
	
	public PApplet applet;
	public float w, h, theta;
	public PVector location;
	public Color colour;
	public boolean alive;
	
	// The main applet will end up being passed as an argument to our GameObject class.
	public GameObject(PApplet applet) {
		this.applet = applet;
		this.applet.noStroke();
		w = h = 100.0f;
		theta = 0.0f;
		alive = true;
		location = new PVector(500.0f, 500.0f);
		colour   = new Color(0, 0, 180, 255);
	} // End constructor.
	
	
	} // End overloaded constructor.
	
	/*
	 * The display and update methods are called in
	 * the run method. We will always call the run
	 * method i.e. objects.run(), which means we only
	 * have to override the display OR update methods
	 * when we extend this class.
	 */
	
	public void run(){
		display();
		update();
	} // End run.
	
	public void display() {
		applet.fill( colour.getRed(), colour.getGreen(), colour.getBlue(), colour.getAlpha() );
		applet.rect(location.x, location.y, w, h);
		applet.noFill();
	} // End display.
	
	public void update() {}  // End update.
	
} // End GameObject class.