package ie.dit;

import processing.core.PApplet;
import processing.core.PVector;

public class Player extends Helicopter {

	boolean up, down, left, right;
	
	Player(PApplet applet) {
		super(applet);
		
		location = new PVector ( (applet.width/2)-(w/2), applet.height-(h*2) );
		//location = new PVector ( 500, 500);
		
		
		
	} // End Constructor
	
} // End Class
