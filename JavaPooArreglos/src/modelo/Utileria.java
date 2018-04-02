package modelo;

import javax.swing.JOptionPane;

public class Utileria {

	static int sumarFibo(int lim) {
		if(lim<0) return 0;
		if(lim==1) return 0;
		int suma=0;
		for(int i=1; i<=lim;i++) {
			suma+=fibonacci(i);
		}
		return suma;
	}

	static double calcularPotencia(int base, int exponente) {
		double potencia=base;
		int po=exponente;
		if(exponente<0)  po=exponente*-1;

		if(exponente==1) return base;
		if(exponente==0) return 1;
		for(int i=1; i<po; i++) {

			potencia*=base;
			System.out.println(potencia);
		}

		if(exponente<0) {
			return 1/potencia;
		}

		return potencia;
	}

	static double dividirFunciones(int lim) {
		double suma=0,div;

		for(int i=1; i<=lim; ++i) {
			div= elevarNum(i, i)/ (double)calcularFactorial(i);
			if(esPar(i)) suma-=div;
			else suma+=div;
		}
		return suma;
	}

	static boolean esPar(double num) {
		if(num%2==0) return true;
		else return false;
	}

	static double elevarNum(int base, int exponente) {

		return  Math.pow(base , exponente);
	}

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

		if (n<6)	return false;

		if(n==6)	return true;

		for (int i = 1; i <=n/2; i++) {
			if(n%i==0)
				suma+=i;
		}

		if(suma==n)
			return true;
		else
			return false;

	}

	public static int fibonacci(int n) {

		int	x=0, y = 1, z = 0;

		for (int i = 1; i < n; i++) {

			x=y+z;
			y=z;		
			z=x;
		}
		return x;
	}

	public static boolean continuar (String mensaje) {

		int opcion = JOptionPane.showConfirmDialog(null, mensaje,null,JOptionPane.YES_NO_OPTION);

		if(opcion==JOptionPane.YES_OPTION)
			return true;
		else
			return false;
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

		int factorial = n;

		for (int i = n-1; i>0; i--){
			factorial *=  i;
		}

		return factorial;
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


		do {
			String entrada = leerCadena(mensaje);
			try {
				int numero= Integer.parseInt(entrada);
				return numero;
			} catch (NumberFormatException nfe){
				escribir("invalido"); 

			}
		}while(true);




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
		try {
			JOptionPane.showMessageDialog(null, msj);
		} catch (Exception e) {
			System.err.println("cancelar");
		}

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

	static void escribir(Object[] x) {
		JOptionPane.showMessageDialog(null, x);
	}

	public static int mostrarMenu(String[] opciones) {

		String menuprincipal = "Menu Principal\n";

		int i;
		for ( i = 0; i < opciones.length; i++) {
			menuprincipal = menuprincipal.concat(i+1+" "+opciones[i]+"\n");
		}

		menuprincipal = menuprincipal+(++i)+" salir";
		menuprincipal += "\nseleccione su opcion";

		int op = 0;

		do {

			op = leerInt(menuprincipal);

		} while (op<1||op>opciones.length+1);

		return op;

	}


}