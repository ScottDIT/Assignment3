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
		this.applet.size(700, 700);
		this.applet.smooth();
		
		// Our game objects.
		map = new Map(this.applet);
		player = new Player(this.applet);
		
		// An ArrayList for our game objects.
		objects = new ArrayList<GameObject>();
		
		// Add the game objects to the ArrayList.
		objects.add(map);
		objects.add(player);
	} // End constructor.
	
	public void run(){
		// Run all the game objects.
		for(GameObject object : objects){
			object.run();
		} // End enhanced loop.
	} // End run.
	
	public void keyPressed(){
		player.keyPressed();
	} // End keyPressed.
	
	public void keyReleased(){
		player.keyReleased();
	} // End keyPressed.
	
} // End Game class.