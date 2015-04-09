package ie.dit;

import processing.core.PApplet;
import processing.core.PVector;

public class Player extends Helicopter {
	
	PVector forward;
	boolean up, down, left, right;
	float velocity, min_speed, max_speed;
	
	Player(PApplet applet) {
		super(applet);
		location = new PVector ( (applet.width/2)-(w/2), applet.height-(h*2) );
		velocity = 4.0f;
		min_speed = 1.0f;
		max_speed = 7.0f;
		forward = new PVector (0.0f, 1.0f);
		up = down = left = right = false; // Set to true on KeyPressed.
	} // End constructor.
	
	public void update() {
		// By calling super.update(), we are calling the Helicopter
		// classes update method which rotates the helicopter rotor.
		super.update();
		move();
		inBounds();
	} // End update
	
	public void keyPressed(){
		setDirection(applet.keyCode, true);
	} // End keyPressed.
	
	public void keyReleased(){
		setDirection(applet.keyCode, false);
	} // End keyPressed.
	
	private void setDirection(int k, boolean decision) {
		if     (k == 87 || k == 38) up    = decision; // 87=w || 38=arrow-up
		else if(k == 83 || k == 40) down  = decision; // 83=s || 40=arrow-down
		else if(k == 65 || k == 37) left  = decision; // 65=a || 37=arrow-left
		else if(k == 68 || k == 39) right = decision; // 68=d || 39=arrow-right
	} // End setDirection.
	
	private void move() {
		// This will make the player move in the direction it is facing.
		forward.x = (float) -Math.sin(theta) * velocity;
		forward.y = (float)  Math.cos(theta) * velocity;
		// These booleans are set to true when the keys are pressed.
		if(up)    location.sub(forward);
		if(down)  location.add(forward);
		if(left)  theta -= 0.1;
		if(right) theta += 0.1;
		if(!up && !down && !left && !right)
			if(velocity > min_speed) velocity -=0.01;
			location.sub(forward);
	} // End move.
	
	void inBounds() {
		// If the player passes the bottom of the screen.
		if (location.y > 700)
			location.y = -60; // Put the player at the top of the screen.
		// If the player passes the top of the screen.
		if (location.y < -60)
			location.y = 700; // Put the player at the bottom of the screen.
		// If the player passes the left side of the screen.
		if (location.x < -40)
			location.x = 720; // Put the player at the right side of the screen.
		// If the player passes the right side of the screen.
		if (location.x > 720)
			location.x = -40; // Put the player at the left side of the screen.
	} // End inBounds.
	
} // End Player class.