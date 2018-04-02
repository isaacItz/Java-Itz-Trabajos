package factorial;

import static javax.swing.JOptionPane.*;

public class Factorial {

	public static void main(String[] args) {

		String s = showInputDialog(null, "digita un numero");
		
		int n = Integer.parseInt(s);
		int factorial = n;

		for (int i = n-1; i>0; i--){
			factorial *=  i;
		}
		
		showMessageDialog(null, "el factorial de "+s+" es: "+factorial);
		
	}

}