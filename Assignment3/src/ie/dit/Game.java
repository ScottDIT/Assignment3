package ie.dit;

/*
 * This is our game class.
 * Our game objects will be created here.
 */

import java.util.ArrayList;
import processing.core.PApplet;

public class Game {
	
	PApplet applet; // A reference to the PApplet class.
	ArrayList<GameObject> objects;
	Player player;
	Map map;
	
	// We initialize the game by doing Game game = new Game(this)
	// the 'this' argument is our PApplet window.
	public Game(PApplet applet){
		this.applet = applet;
		this.applet.size(1000, 1000);
		this.applet.smooth();
		// An ArrayList for our game objects.
		objects = new ArrayList<GameObject>();
		player = new Player(this.applet);
		map = new Map(this.applet);
		
	} // End constructor.
	
	public void run(){
		map.run();
		player.run();
	} // End run.
	
	public void keyPressed(){
		
	} // End keyPressed.
	
	public void keyReleased(){
		
	} // End keyPressed.
	
} // End Game class.