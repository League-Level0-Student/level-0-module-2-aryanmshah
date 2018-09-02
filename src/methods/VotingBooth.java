package methods;

import javax.swing.JOptionPane;

public class VotingBooth {

	
	
	public static void main(String[] args) {
	String age= JOptionPane.showInputDialog("How old are you??");
	int a= Integer.parseInt(age);
	
	if(a<18) {
		JOptionPane.showConfirmDialog(null, "No one cares about your opinion");
	}
	else {
		String pres=JOptionPane.showInputDialog("What president do you vote for?");
	
	if(pres.equals("Trump")) {
		JOptionPane.showConfirmDialog(null, "YOU SUCK");
	}
		else {
			JOptionPane.showConfirmDialog(null, "ok");
		}
	}
	}
	
	
	
	}

