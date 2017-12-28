
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot Eli = new Robot();
		//3. ask the user what color they would like the robot to draw
		 for (int i = 0; i < 10; i++) {
			
	
		String colors = JOptionPane.showInputDialog("What color do you want?");
		 if (colors.equalsIgnoreCase("Purple")) {
			Eli.setPenColor(new Color (155, 0, 255));
		}
		 else if (colors.equalsIgnoreCase("Pink")) {
			Eli.setPenColor(Color.pink);
		}
		 else if (colors.equalsIgnoreCase("Green")) {
			Eli.setPenColor(Color.green);
		}
		 else if (colors.equalsIgnoreCase("Yellow")) {
			Eli.setPenColor(Color.yellow);
		}
		 else if (colors.equalsIgnoreCase("Blue")) {
			Eli.setPenColor(Color.blue);
		}
		 else if (colors.equalsIgnoreCase("Red")) {
			Eli.setPenColor(Color.red);
		}
		 else if (colors.equalsIgnoreCase("Orange")) {
			Eli.setPenColor(Color.orange);
		}
		 else if (colors.equalsIgnoreCase("Black")) {
			Eli.setPenColor(Color.BLACK);
		}
		 else if (colors.equalsIgnoreCase("Brown")) {
			Eli.setPenColor(new Color (221,136,51));
		}
		 else if (colors.equalsIgnoreCase("Gray")) {
			Eli.setPenColor(Color.gray);
		}
		 else {
			Eli.setRandomPenColor();
		}
		 
		 //4. use an if/else statement to set the pen color that the user requested

        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Eli.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
Eli.setSpeed(10);
Eli.hide();
Eli.penDown();
Eli.move(100);	
Eli.turn(90);	
Eli.move(100);	
Eli.turn(90);	
Eli.move(100);
Eli.turn(90);
Eli.move(100);
		 }
	
	
	
	
	
	
	
	}
}
