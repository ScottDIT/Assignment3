package ie.dit;

import processing.core.PApplet;
import processing.core.PVector;

public class Player extends Helicopter {

	boolean up, down, left, right;
	
	Player(PApplet applet) {
		super(applet);
		
		location = new PVector ( (applet.width/2)-(w/2), applet.height-(h*2) );//Location of player
		velocity = new PVector (0.0f, 10.0f);
		up = down = left = right = false; //Set all to false for keypress
		
		
	} // End Constructor
	
	public void update() {
		super.update();
		move();
	} // End update
	
	public void keyPressed(){
		setDirection(applet.keyCode,true);
	} // End keyPressed.
	
	public void keyReleased(){
		setDirection(applet.keyCode,false);

	} // End keyPressed.
	
	private void setDirection(int k, boolean decision) {
		if     (k == 87 || k == 38) up = decision; //87 & 38 represent keypress code
		else if(k == 83 || k == 40) down = decision;
		else if(k == 65 || k == 37) left = decision;
		else if(k == 68 || k == 39) right = decision;
	} // End setDirection.
	
	private void move() {
		if(up) location.sub(velocity);
		if(down) location.add(velocity);
		if(left) theta -= 0.1;
		if(right) theta += 0.1;

	} // End move
	
} // End Class
