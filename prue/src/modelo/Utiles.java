package modelo;
//import static javax.swing.JOptionPane.*;
public class Utiles {
	
	public static int factorial (int n) {

		int factorial =n;
		
		for (int i = n-1; i>0; i--){
			factorial *=  i;
		}
				
		return factorial;
	}
	
	public static boolean numeroPrimo(int num) {
		int cont = 0;
		boolean factorial;
		for	(int i=1; i<=num; i++) {
			if (num%i == 0)
				cont ++;
			 
		}
		
		if (cont == 2) 
			factorial = true;
		else
			factorial = false;
		
		return factorial;
		
	}
	
	public static String numero7 (int num) {
		String result;
		
		if (num%10 ==7) {
			result = "el numero "+ num +" termina en 7";
		}else {
			result = "el numero "+ num +" no termina en 7";
		}
		
		
		return result;
	}

}
