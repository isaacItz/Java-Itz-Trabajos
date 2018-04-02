package modelo;

import static modelo.Utiles.*;

import javax.swing.JOptionPane;

public class Principal {

	public static void main (String[] lol) {

		String repetir="";
		do {
			String opcion= JOptionPane.showInputDialog("que quieres calcular? \n"
				+ "1.- el factorial de un numero \n"
				+ "2.- un numero primo \n"
				+ "3.- saber si un numero termina en 7");
		
		int op = Integer.parseInt(opcion);
		
		switch (op) {
		case 1:
			String s = JOptionPane.showInputDialog("digita un numero");
			int num = Integer.parseInt(s);
			int	myfac = factorial(num);
			
			JOptionPane.showMessageDialog(null, "el factorial de el numero "+ num + " es "+ myfac);
			repetir = JOptionPane.showInputDialog("repetir programa","s");
			break;
			
		case 2:
			String s1 = JOptionPane.showInputDialog("digita un numero");
			int num1 = Integer.parseInt(s1);
			boolean myprimo = numeroPrimo(num1);
			
			if	(myprimo== true)
				JOptionPane.showMessageDialog(null, "el numero "+ num1 + " es primo");
			else
				JOptionPane.showMessageDialog(null, "el numero "+ num1 + " no es primo");
			repetir = JOptionPane.showInputDialog("repetir programa","s");
			break;
			
		case 3:
			String s2 = JOptionPane.showInputDialog("digita un numero");
			int num3 = Integer.parseInt(s2);
			
			JOptionPane.showMessageDialog(null, numero7(num3));
			repetir = JOptionPane.showInputDialog("repetir programa","s");
			break;

		default:
			JOptionPane.showMessageDialog(null, "numero invalido");
			repetir = "s";
			
		}
		
			
		}while(repetir.equalsIgnoreCase("s"));

		
	}
	
	
}
