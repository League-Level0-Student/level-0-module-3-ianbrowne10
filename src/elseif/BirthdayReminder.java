
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 27th";
		String dadsBirthday = "December 25th";
		String myBirthday = "November 13th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String bday = JOptionPane.showInputDialog("Which family member's birthday do you want?");
		// 3. Print out what the user typed
	 if (bday.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, "Janurary 27th");
		}
	 else if (bday.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, "Decmeber 25th");
		}
	 else if (bday.equalsIgnoreCase("Ian")) {
			JOptionPane.showMessageDialog(null, "November 13th");
		}
	 else if (bday.equalsIgnoreCase("eli")) {
			JOptionPane.showMessageDialog(null, "November 9th");
		}
	 else if (bday.equalsIgnoreCase("lila")) {
			JOptionPane.showMessageDialog(null, "September 10th");
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't know that person!");
		}
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
