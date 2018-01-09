package loops;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
String One = JOptionPane.showInputDialog("Are you happy?");
if(One.equalsIgnoreCase("yes")){
	JOptionPane.showMessageDialog(null, "Keep doing what you're doing!");
}
if(One.equalsIgnoreCase("no")) {
	String Two = JOptionPane.showInputDialog("Do you want to be happy?");
if(Two.equalsIgnoreCase("Yes")) {
	JOptionPane.showMessageDialog(null, "Change something!");
}
if(Two.equalsIgnoreCase("no")) {
	JOptionPane.showMessageDialog(null, "Keep doing what you're doing!");
}
}




}
}
