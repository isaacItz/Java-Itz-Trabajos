package sumas;
import static javax.swing.JOptionPane.*;
public class Sumas {

	public static void main(String[] args) {

		String s = showInputDialog("digite n1");
		String s1 = showInputDialog("digite n2");
		
		int n1 = Integer.parseInt(s);
		int n2 = Integer.parseInt(s1);
				
		showMessageDialog(null, "la suma de "+n1+" + "+n2+ " es: "+(n1+n2)+"  \n"
				+ "la resta de "+n1+" - "+n2+ " es: "+(n1-n2)+"  \n"
						+ "la multiplicacion de "+n1+" * "+n2+ " es: "+(n1*n2)+"  \n"
								+ "la division de "+n1+" / "+n2+ " es: "+(n1/n2)
									+" y su residuo es: "+(n1%n2) );
		
	}

}
