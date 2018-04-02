package modelo;

import java.util.Scanner;
import static modelo.Utileria.*;
public class PracticaTaylor {

	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Cuantos términos desea: ");
		int numeroTerminos = sc.nextInt();
		
		
		System.out.print("Digita el valor de x..: ");
		int x = sc.nextInt();
		double suma = 0;
		double termino;
		int signo = 1;
		for (int i = 0; i < numeroTerminos; i++) {
			termino = Math.pow(x, i) / factorial(i) * signo;
			signo *= -1; suma += termino; 
		} 
		System.out.printf("f(%d) = %f\n", x, suma);
		
		sc.close();
	} 
	
	public static double factorial(int numero){ 
		double factorial = 1;
		for (int i = 2; i <= numero; i++) {
			factorial *= i;
		} 

		return factorial; 
	
	}

}
