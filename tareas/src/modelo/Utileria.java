package modelo;

import javax.swing.JOptionPane;

public class Utileria {

	public static int sumar(int ... numeros) {

		if(numeros.length==0)return 0;
		if(numeros.length==1)return numeros[0];
		
		int suma=0;;
		for(int i=0; i<numeros.length; i++)
			suma+=numeros[i];

		return suma;
	}

	public static boolean isPerfecto(int n) {

		int suma=0;
		if (n<6)			
			return false;

		if(n==6)
			return true;

		for (int i = 1; i <=n/2; i++) {

			if(n%i==0)
				suma+=i;

		}

		if(suma==n)
			return true;
		else
			return false;

	}

	public static void fibonacci(int n) {

		int	x=1,y=1,z=0;

		for (int i = 0; i < n; i++) {

			x=y+z;
			escribir(""+x);
	y=z;		
z=x;


		}

	}

	public static boolean continuar (String mensaje) {

		int opcion = JOptionPane.showConfirmDialog(null, mensaje,null,JOptionPane.YES_NO_OPTION);

		if(opcion==JOptionPane.YES_OPTION)
			return true;
		else
			return false;
	}

	public static void visualizar () {

		System.out.println("hola mundo");
		return;

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

	public static int calcularFactorial (int n) {

		int factorial =n;

		for (int i = n-1; i>0; i--){
			factorial *=  i;
		}

		return factorial;
	}

	public static void calculaFibo(int lim) {

		int aux=0,aux1=0,fibo=0;

		if (lim==1)
			escribir("0");

		if(lim==2)
			escribir("0,1");
		else {

			for (int i = 0; i <=lim; i++) {

				System.out.print(" ");

				aux=i;
				aux1=i-1;

			}
		}

	}

	public static double calcularMedia() {

		int lim=leerInt("digite la cantidad de datos que va a ingresar");

		double suma=0,dato=0;

		for (int i = 1; i <= lim; i++) {

			dato = leerInt("ingrese el dato "+i);

			if (dato==0)
				escribir("no haz digitado nada");

			suma+=dato;
		}

		return  suma/lim;

	}

	public static boolean isPrimo(int numero) {
		if (numero<0) return false;
		if(numero == 1|| numero ==2 || numero == 3) return true;
		if (numero % 2== 0) return false;
		for (int i =3; i <=numero/2; i++) {
			if (numero % i == 0)
				return false;
		}

		return true;

	}


	public static int leerInt(String mensaje){

		int x;
		do {
			String entrada = leerCadena(mensaje);
			try {
				int numero= Integer.parseInt(entrada);
				return numero;
			} catch (NumberFormatException nfe){
				escribir("invalido"); 
				x=0;
			}
		}while(x==0);

		return 0;


	}


	public static double leerDouble(String mensaje) {

		String entrada = leerCadena(mensaje);
		int numero= Integer.parseInt(entrada);

		return numero;

	}

	public static String leerCadena(String mensaje) {

		String cadena = JOptionPane.showInputDialog(mensaje);

		return cadena;
	}

	public static void escribir(String msj){		

		JOptionPane.showMessageDialog(null, msj);

	}
	
	public static void escribir(int numero){		

		JOptionPane.showMessageDialog(null, numero);

	}
	
	public static void escribir(double numero){		

		JOptionPane.showMessageDialog(null, numero);

	}
	
	public static void escribir(char caracter){		

		JOptionPane.showMessageDialog(null, caracter);

	}
	
	public static void escribir(boolean bandera){		

		JOptionPane.showMessageDialog(null, bandera);

	}
	
	

}