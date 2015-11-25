package day3;

import javax.swing.JOptionPane;

public class snooper {
	public static void main(String[] args) {

		String answere = JOptionPane.showInputDialog(null, "What is your name.");
		String answeree = JOptionPane.showInputDialog(null, "What is your social security number.");
		String answereee = JOptionPane.showInputDialog(null, "What is your address.");
		String answereeee = JOptionPane.showInputDialog(null, "What is your favorite icecream.");
		String answereeeee = JOptionPane.showInputDialog(null, "What is your bank acount number?");
		String answereeeeee = JOptionPane.showInputDialog(null,
				"How much wood could a wood chuck chuck, if a wood chuck could chuck wood");
		JOptionPane.showMessageDialog(null,
				"Hello I Know Your Name Is " + answere + ". I know your social security number is" + answeree
						+ ". I know your adress is " + answereee + "I know your favorite icecream is"+ answereeee);
	}
}