package ie.dit;

import processing.core.PApplet;

public class Game {
	
	PApplet applet; // We need this to access our main PApplet.
	
	Map map;
	
	public Game(PApplet applet){
		this.applet = applet;
		this.applet.size(1000, 1000);
		this.applet.smooth();
		map = new map(this);
				
	} // End constructor.
	
	public void run(){
		map.run();
		
	} // End run.
	
	public void keyPressed(){
		
		
	} // End keyPressed.
	
	public void keyReleased(){
		
		
	} // End keyPressed.
	
} // End Game class.