package modelo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Main {

	private static ArrayList<Integer> numeros = new ArrayList<Integer>();

	public static void main(String... lol) {

		int op;

		String[] opciones = { "Ingresar  Datos a la Lista", "Mostrar Todos los Datos de la Lista",
				"Cuántos Números son Perfectos", "Cuántos Números Terminan en 7",
				"Factorial de Todos los Números que Terminan en 3", "La Sumatoria de Todos los Números que son Primos",
				"Serie Ulam de Todos los Números de la Lista", "La Media Aritmética de Todos los Datos de la Lista",
				"La Mediana de Todos los Datos de la Lista", "Salir" };

		do {

			op = mostrarMenu(opciones);

			switch (op) {
			case 1:
				llenarLista();
				break;

			case 2:
				// todos los datos del array
				if (hayDatos()) {

					System.out.println("mostrando todos los datos del array");
					String losDato = "";
					for (Integer datosArray : numeros) {
						losDato += datosArray + "\n";
					}
					escribir(losDato);
					if (!continuar("desea hacer mas operaicones?"))
						System.exit(0);
				} else
					escribir("no hay datos registrados");
				break;

			case 3:// numeros perfectos
				if (hayDatos()) {

					String perfectos = "";
					for (int i = 0; i < numeros.size(); i++) {
						int num = numeros.get(i);
						if (isPerfecto(num))
							perfectos += num + "\n";
					}
					if (!perfectos.isEmpty())
						escribir(perfectos);
					else
						escribir("no hay numeros perfectos");
					if (!continuar("desea hacer mas operaicones?"))
						System.exit(0);
				} else
					escribir("no hay datos registrados");
				break;

			case 4:
				// numeros que terminan en 7
				if (hayDatos()) {

					String termina7 = "";
					for (int i = 0; i < numeros.size(); i++) {
						int num = numeros.get(i);
						if (terminaEn(num, 7))
							termina7 += num + "\n";
					}
					if (!termina7.isEmpty())
						escribir(termina7);
					else
						escribir("no hay numeros que terminen en 7");
					if (!continuar("desea hacer mas operaicones?"))
						System.exit(0);
				} else
					escribir("no hay datos registrados");
				break;

			case 5:
				// factorial de los que terminan en 3
				if (hayDatos()) {
					String factoriales = "";
					for (int i = 0; i < numeros.size(); i++) {
						int num = numeros.get(i);
						if (terminaEn(num, 3))
							factoriales += ("factorial de " + num + " es: " + getFactorial(num)) + "\n";

					}
					if (!factoriales.isEmpty())
						escribir(factoriales);
					else
						escribir("no hay numeros que terminen en 3");
					if (!continuar("desea hacer mas operaicones?"))
						System.exit(0);
				} else
					escribir("no hay datos registrados");
				break;

			case 6:
				// sumatoria de primos
				if (hayDatos()) {

					int suma = 0;
					for (int i = 0; i < numeros.size(); i++) {
						int num = numeros.get(i);
						if (isPrimo(num))
							suma += num;
					}
					if (suma == 0)
						escribir("no hay datos");
					else
						escribir("la sumatoria de los numeros primos es " + suma);

					if (!continuar("desea hacer mas operaicones?"))
						System.exit(0);
				} else
					escribir("no hay datos registrados");
				break;

			case 7:
				// la seria de Ulam.
				if (hayDatos()) {
					String serieTods = "";
					String cadena = "";
					for (int i = 0; i < numeros.size(); i++) {
						int num = numeros.get(i);
						while (num != 1) {
							if (num % 2 == 0)
								num /= 2;
							else
								num = (num * 3) + 1;
							cadena += (num + " ");

						}

						serieTods += ("serie del num: " + numeros.get(i) + " es " + cadena) + "\n";

						cadena = "";

					}
					escribir(serieTods);

					if (!continuar("desea hacer mas operaicones?"))
						System.exit(0);
				} else
					escribir("no hay datos registrados");
				break;

			case 8:
				// meida
				if (hayDatos()) {
					System.out.println("entrando a la media");
					int media = 0;
					for (int i = 0; i < numeros.size(); i++) {
						int num = numeros.get(i);
						media += num;
						media /= numeros.size();

					}
					escribir("la media es: " + media);

					if (!continuar("desea hacer mas operaicones?"))
						System.exit(0);
				} else
					escribir("no hay datos registrados");

				break;

			case 9:
				// la mediana
				if (numeros.size() > 1) {
					System.out.println("entrando a la mediana");
					Collections.sort(numeros);
					int div = numeros.size() / 2;
					System.out.println("div vale " + div);
					if (numeros.size() % 2 == 0) {
						escribir("la mediana es: " + numeros.get(div - 1) + " y " + numeros.get(div));
					} else
						escribir("la media es: " + numeros.get(div));

					if (!continuar("desea hacer mas operaicones?"))
						System.exit(0);
				} else
					escribir("ingresa mas datos para realizar esta operacion");

				break;

			case 10:
				break;

			default:
				escribir("opcion no disponible");
				break;
			}

		} while (op != opciones.length);

		System.out.println("fin");
	}

	private static boolean hayDatos() {
		return numeros.size() > 0;
	}

	private static void llenarLista() {
		int n;
		do {
			n = leerInt("Ingresa un Numero\nTotal de Numeros Registrados "+numeros.size()+"\nDigita 0 Cuando Quieras Dejar de Ingresar Numeros");
			if (!numeros.contains(n)) {
				if (n != 0)
					numeros.add(n);
			} else
				escribir("El Numero " + n + " ya ha Sido Guardado Anteriormente");
		} while (n != 0 || numeros.size() < 1);
	}

	private static int leerInt(String mensaje) {
		int op;
		try {
			op = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, null, JOptionPane.QUESTION_MESSAGE));
			return op;
		} catch (Throwable e) {
			return 0;
		}

	}

	private static int mostrarMenu(String[] opciones) {
		String concat = "\fMenu Principal \n";

		for (int i = 0; i < opciones.length; i++) {
			concat += " "+(i + 1) + ".-" + opciones[i] + "\n";
		}
		concat += "\tElija su Opcion";
		int op = leerInt(concat);

		return op;
	}

	private static void escribir(Object mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	private static boolean continuar(String mensaje) {
		int opcion = JOptionPane.showConfirmDialog(null, mensaje, "salir?", 0);
		return opcion == 0;
	}

	public static boolean isPrimo(int numero) {
		if (numero < 0)
			return false;
		if (numero == 1 || numero == 2 || numero == 3)
			return true;
		if (numero % 2 == 0)
			return false;
		for (int i = 3; i <= numero / 2; i++) {
			if (numero % i == 0)
				return false;
		}

		return true;

	}

	private static BigInteger getFactorial(long num) {

		BigInteger numero = BigInteger.valueOf(num);
		BigInteger numeroaRetornar = BigInteger.valueOf(num);

		for (long i = numero.longValueExact() - 1; i >= 1; i--) {
			numeroaRetornar = numeroaRetornar.multiply(BigInteger.valueOf(i));
		}
		return numeroaRetornar;
	}

	private static boolean terminaEn(int numero, int fina) {
		return numero % 10 == fina;
	}

	private static boolean isPerfecto(int numero) {
		int acumulador = 0;
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				acumulador += i;
			}
		}
		return acumulador == numero;
	}

}
