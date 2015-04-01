package ie.dit;

import java.awt.Color;
import processing.core.PApplet;
import processing.core.PVector;

public class GameObject {
	
	public PApplet applet;
	public float w, h, theta;
	public PVector location, velocity;
	public Color colour;
	
	public GameObject(PApplet applet) {
		this.applet = applet;
		w = h = 100.0f;
		theta = 0.0f;
		location = new PVector(500.0f, 500.0f);
		velocity = new PVector(0.0f, 0.0f);
		colour   = new Color(255, 0, 0);
	} // End constructor.
	
	public GameObject(float w, float h, PVector location, PVector velocity, Color colour, PApplet applet) {
		this.applet = applet;
		this.w = w;
		this.h = h;
		this.location = location;
		this.velocity = velocity;
		this.colour = colour;
	} // End overloaded constructor.
	
	public void run(){
		display();
		update();
	} // End run.
	
	public void display() {
	} // End display.
	
	public void update() {
	} // End update.
	
} // End GameObject class.