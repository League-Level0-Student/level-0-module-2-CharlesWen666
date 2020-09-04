package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	int ageInt = Integer.parseInt(age);
	if(ageInt >= 18) {
		JOptionPane.showInputDialog("Who should the next president be?");
	}
	else { JOptionPane.showMessageDialog(null, "Under 18? Guess what, no body cares!");
		}
}
}
