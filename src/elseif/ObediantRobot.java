package elseif;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
public static void main(String[] args) {


drawSquare(4);

}


private static void drawSquare(int length) {
	Robot I = new Robot();
	I.penDown();
	I.setSpeed(10);
	I.hide();
	for (int j = 0; j < 4; j++) {
	
		I.move(100);
	I.turn(90);
}

}}