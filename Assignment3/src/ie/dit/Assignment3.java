package ie.dit;

import processing.core.PApplet;

@SuppressWarnings("serial")
public class Assignment3 extends PApplet {
	
	Game game;
	
	public void setup(){
		game = new Game(this);
	} // End setup.
	
	public void draw(){
		background(0,255,0);
		stroke(255);
		game.run();
	} // End draw.
	
	public void keyPressed(){
		game.keyPressed();
	} // End keyPressed.
	
	public void keyReleased(){
		game.keyReleased();
	} // End keyReleased.
	
} // Assignment3 class.