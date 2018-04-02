package mayr;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("digita mero 1");
		int n = sc.nextInt();
		System.out.println("digita un numero2");
		int n1 = sc.nextInt();
		System.out.println("digita un numero3");
		int n2 = sc.nextInt();
		int mayor;
		if (n>n1) {
			 mayor = n;
		}else 
			mayor = n1;
			
			if	(n2>mayor)
				mayor = n2;
		
			System.out.println("el mayor es "+mayor);
		
		
	}

}
