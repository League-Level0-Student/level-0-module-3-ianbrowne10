//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.print.attribute.standard.PrinterLocation;
import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(99);
		// 2. Print out the random variable above
		
	System.out.println(random);
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
	String Number = JOptionPane.showInputDialog("Guess a number (1-100)");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int answer  = (Integer.parseInt(Number));
			// 5. if the guess is correct
				if(answer == random) {
					JOptionPane.showMessageDialog(null, "You Won!");
				}
			// 6. win
			// 7. if the guess is high
				if(answer > random) {
					JOptionPane.showMessageDialog(null, "You're too high~!");
				}
				// 8. tell them it's too high
			
				// 9. if the guess is low
				// 10. tell them it's too low

		// 12. tell them they lose
	}

	private static void println(int random) {
		// TODO Auto-generated method stub
		
	}

}


