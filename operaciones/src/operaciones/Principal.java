package operaciones;

import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class Principal {

	public static void main(String[] args) {
		
		String n= showInputDialog("digite un numero");
		
		int a = Integer.parseInt(n);
		
		int num = a%2;
		
		if (num == 0)
			showMessageDialog(null, "el numero es par");
		else
			showMessageDialog(null, "el numeo no es par");

	}

}
