package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What shape do you want? (Circle, Square, Triangle)");
if(answer.equalsIgnoreCase("square")) {
	drawSquare();
}
if(answer.equalsIgnoreCase("triangle")) {
	drawTriangle();
}
if(answer.equalsIgnoreCase("circle")) {
	drawCircle();
}

}
String answer = JOptionPane.showInputDialog("What shape do you want? (Circle, Square, Triangle)");



private static void drawSquare() {
	Robot i = new Robot();
i.penDown();
	
i.penDown();
	i.setSpeed(1000);
	i.hide();
	for (int j = 0; j < 4; j++) {
	
		i.move(100);
	i.turn(90);
}}
private static void drawTriangle() {
	 Robot andrew = new Robot();
andrew.penDown();
andrew.setSpeed(1000);
andrew.hide();

for (int y =0; y<3; y++) {
	andrew.turn(120);
	
andrew.move(100);
}
}
private static void drawCircle() {
	Robot bill = new Robot();
			bill.setSpeed(1000);
bill.hide();
bill.penDown();
for (int e = 0; e<360; e++) {
	bill.setAngle(e);
	
bill.move(1);
}
}





}