package ie.dit;

import processing.core.PApplet; //import the processing PApplet
import processing.core.PImage; //import the processing PImage
import processing.core.PVector; ////import the processing PVector

public class Map extends GameObject{ //create Map class
	
	public PImage img;
	
	public Map(PApplet applet){ //Constructor
		super(applet);
		location = new PVector(0, 0);
		w = this.applet.width;
		h= this.applet.height;
		img = this.applet.loadImage("data/map.jpg"); // add the map picture to the background of game
	} // End constructor.
	
	// We're overriding the GameObject display method.
	public void display() {
		applet.image(img, location.x, location.y, w, h); //display the map image 
	} // End display.
} // End Map.
