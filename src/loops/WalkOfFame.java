
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot mini = new Robot("mini");
		// 1. Set the X position of the robot so that it starts on the left. 
	
	// You also need to show the robot to see the result of this line.

		mini.penDown();
		mini.setAngle(90);
mini.setSpeed(10);
// 2. Make the robot draw a star shape. Hint: 144.
for(int i = 0; i < 5; i++) {
for (int i2 = 0; i2 < 6; i2++) {
	
mini.penDown();
mini.turn(144);
		mini.move(30);
}
mini.setAngle(-90);
mini.penUp();

mini.move(80);
}







// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 */
		


	}

}
