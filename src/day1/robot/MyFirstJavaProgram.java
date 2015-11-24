package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
	Robot loch = new Robot ();
	loch.penDown();
		loch.setSpeed(10);	
	loch.setPenColor(200,100,50);
		for (int i = 0; i < 4; i++) {
			loch.move(150);loch.turn(90);
			
		}

		
		
	}
}
