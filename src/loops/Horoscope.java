package loops;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String Coconut = JOptionPane.showInputDialog("What is your Zodiac Sign?");
		if (Coconut.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null,
					"Control your frustration at others who arent as fast thinking as you right now.");
		}
		else if (Coconut.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null,
					"Theres a lot of energy in your relationship today and its a good time to tell your partner how you feel about them, spreading the love and building it higher.");
		}
		else if (Coconut.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null,
					"There are new things coming your way and you may feel some confusion over events and situations surrounding this today.");
		}
		else if (Coconut.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null,
					"While you normally like your routine, today youll feel the need for something different, go with it.");
		}
		else if (Coconut.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null,
					"Today you can use one of those connections youve built up, whether at work or at home, say hello.");
		}
		else if (Coconut.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null,
					"Money worries can bring you stress today, but this only wastes your energy, so fix what you can.");
		}
		else if (Coconut.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null,
					"When someone or something from your past threatens to bring you down today, face it with confidence.");
		}
		else if (Coconut.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null,
					"As The Moon enters your house today you can bust through obstacles to get things done.");
		}
		else if (Coconut.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null,
					"Fuzzy energy in your house will make it hard for you to stay organized at work, but keep calm.");
		}
		else if (Coconut.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null,
					"Very complex energy in your house today will tempt you to do something you know is wrong, resist this.");
		}
		else if (Coconut.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null,
					"With calm and quiet at work you can explore opportunities, learn more, and find new areas to go into.");
		}
		else if (Coconut.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null,
					"As your idea takes shape today, you need someone who is as motivated as you by your side.");
		} else {
			JOptionPane.showMessageDialog(null, "That's not a star sign!");
		}
	}
}
