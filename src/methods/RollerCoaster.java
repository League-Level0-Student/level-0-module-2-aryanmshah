package methods;

import javax.swing.JOptionPane;

public class RollerCoaster {

	
		// TODO Auto-generated constructor stub
	
		public static void main(String[] args) {
	String height= JOptionPane.showInputDialog("enter your height in inches to ride the coaster");
	int a= Integer.parseInt(height);
if(a<48) {
	JOptionPane.showConfirmDialog(null, "Not tall enough to ride");
}
else {
	JOptionPane.showConfirmDialog(null, "Enjoy the ride");
}

	
}
}