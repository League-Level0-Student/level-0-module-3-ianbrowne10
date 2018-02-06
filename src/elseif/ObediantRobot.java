package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
	static Robot i = new Robot();
	
	
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What shape do you want? (Circle, Square, Triangle)");
  String color = JOptionPane.showInputDialog("What color do you want?");
	if(color.equalsIgnoreCase("red")) {
		i.setPenColor(255,0,0);
	}
	if(color.equalsIgnoreCase("green")) {
		i.setPenColor(0,255,0);
	}
	if(color.equalsIgnoreCase("blue")) {
		i.setPenColor(0,0,255);
	}
	if(color.equalsIgnoreCase("yellow")) {
		i.setPenColor(255,255,0);
	}
	if(color.equalsIgnoreCase("purple")) {
		i.setPenColor(200,0,255);
	}
	if(color.equalsIgnoreCase("pink")) {
		i.setPenColor(255,0,255);
	}
	if(color.equalsIgnoreCase("orange")) {
		i.setPenColor(255,128,0);
	}
	else {
		i.setRandomPenColor();
	}
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
	String color = JOptionPane.showInputDialog("What color do you want?");
	
i.penDown();
	if(color.equalsIgnoreCase("red")) {
	i.setPenColor(255,0,0);
}
	

i.setSpeed(1000);
	i.hide();
	for (int j = 0; j < 4; j++) {
	
		i.move(100);
	i.turn(90);
}}
private static void drawTriangle() {
	
i.penDown();
i.setSpeed(1000);
i.hide();

for (int y =0; y<3; y++) {
	i.turn(120);
	
i.move(100);
}
}
private static void drawCircle() {
	
			i.setSpeed(1000);
i.hide();
i.penDown();
for (int e = 0; e<360; e++) {
	i.setAngle(e);
	
i.move(1);
}
}





}