//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String Cats = JOptionPane.showInputDialog("How many cats do you have?");

		// 2. Convert their answer into an int
		int Kittens = Integer.parseInt(Cats);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
		if (Kittens > 3) {
			JOptionPane.showMessageDialog(null, "You're a CRAZY CAT LADY!");
		}
		// 4. If they have 3 or less, call the method below to show them a cat video
		else if(Kittens == 3) {
			
		}
		
		else if (Kittens < 3 && Kittens > 0 ) {
			playVideo("https://www.youtube.com/watch?v=dGFSjKuJfrI");
		}

		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		else if (Kittens == 0) {
			playVideo("https://www.youtube.com/watch?v=ZJT9CeEhM10");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
