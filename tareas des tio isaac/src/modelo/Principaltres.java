package modelo;

import static modelo.Utileria.*;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Principaltres {

	public static void main(String[] args) {
		
		
//		int n= leerInt("digite unumero");
//		for(int i=1; i<=n; ++i) {
//		escribir(fibonacci(i));
//		}
//	
	
//		int base = leerInt("ingrese la base");
//		int exponente = leerInt("ingrese el expoente");
//		escribir(calcularPotencia(base, exponente));
//		
		
//		double n1 = 0.0 ;
//		double n2 = 3.0;
//		
//		double res = n1/n2;
//		double res1 = n1%n2;
//				
//				System.out.println(n1);
//		
//		
//		Object[] hola;
//		hola = new Object[4];
//		
//		hola[1] = "fg";
//		hola[0] = 'ñ';
//		hola[2] = 4;
//		
//		for (int i = 0; i < hola.length; i++) {
//			escribir(hola[i]);
//		}
//		
//		for(Object i: hola ){
//			escribir(i);
//		}
//		
//		
//
//		
//		try {
//			Arrays.sort(hola);
//
//		}catch (Exception e) {
//			System.err.println(e);
//		}
//		
//		escribir(hola);
//		
		
		
		contarCadena("olacazxy jeje no xyz perozxy");
		
		
	}

	static int darMesa(int a, int b) {
		
		if(((a>=0&&a<3)||(b>=0&&b<3))) return 0;
			
		if(((a>=3&&a<8)||(b>=3&&b<8))) return 1;
			
		if(((a>=8&&a<11)||(b>=8&&b<11))) return 2;
		
		
		return 33;
	}
	
	
//	boolean metodo(String str) {
//		
//		for(int i = 0; i<str.substring(beginIndex)i++) {
//			
//			if(str.charAt(i)==".")
//			
//		}
//		
//	}
//	
	 static void contarCadena(String str) {
		
		String b= "xyz";
		int posicion = str.indexOf(b);
		
		while(posicion > 0) {
			System.out.println("cadena en contrada en la posicion "+posicion);
			posicion = str.indexOf(b,posicion+1);
		}

	}
	
	private static void escribir(Object x ) {
		JOptionPane.showMessageDialog(null, x);
		
	}

}
