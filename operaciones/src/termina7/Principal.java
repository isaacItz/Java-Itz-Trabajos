package termina7;

import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class Principal {

	public static void main(String[] args) {

		String n = showInputDialog("digite un numero");
		
		int numer = Integer.parseInt(n);
				
		if ((numer%10)==7||(numer%10)==-7)
			showMessageDialog(null, ""
					+ "el numero "+n+" termina en 7 :D");
		else{
			showMessageDialog(null, "no termina en 7 :(");
		}
		
		
	}

}
