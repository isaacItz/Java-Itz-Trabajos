package modelo;
import java.util.ArrayList;
//import static modelo.Morse.*;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

	private static Scanner leer;

	public static void main(String[] args) {

		HashMap<String, String> textoaMorse = new HashMap<String, String>();
		HashMap<String, String> morseaTexto = new HashMap<String, String>();
		Scanner leer = new Scanner(System.in);
		llenarMapa(textoaMorse);

		for (String i : textoaMorse.keySet()) {
			System.out.println(i);
			morseaTexto.put(textoaMorse.get(i), i);
		}
		morseaTexto.put("   ", "   ");





		String cadena;
		int op,n;
		boolean continuar;

		do {
			System.out.println("\tque deseas hacer?\n1.- convertir texto a codigo morse\n2.- convertir codigo morse a texto");
			op = leer.nextInt();
			switch (op) {
			case 1:
				//texto a morse

				cadena = leerCadena("\tingresa el mensaje a convertir");
				System.out.println("*******************");
				System.out.println("la cadena \""+cadena+"\" es");
				for (int i = 0; i < cadena.length(); i++) {
					String frag = String.valueOf( cadena.charAt(i));
					if (!frag.equals(" ")) {
						System.out.print(textoaMorse.get(frag)+" ");
					} else {
						System.out.print("   ");
					}
				}
				System.out.println();
				break;

			case 2:
				//morse a texto
				String cad= leerCadena("ingresa el morse carnal");

				String[] sep = cad.split("   ");
				System.out.println(sep.length);
				for (int i = 0; i < sep.length ;i++) {
					int lim =sep[i].length();
					for (int j = 0; j <= lim; j++) {
						String[] sep1 = cad.split(" ");
						System.out.println(sep1.length);
						for (int k = 0; k < sep1.length; k++) {
							System.out.println(morseaTexto.get(sep1[k]));
						}
					}
				}
				
				
//				cadena = leerCadena("\tingresa el codigo morse a convertir");
//				ArrayList<String> myar = new ArrayList<String>();
//				myar =  separar(cadena);
//				for(String i: myar) {
//					System.out.println(i);
//				}
//				//System.out.println(morseaTexto.get());
//				//System.out.println(cadena);
//				System.out.println("el codigo \""+cadena+"\" significa");
//				for (int i = 0; i < cadena.length(); i++) {
//					String frag = String.valueOf( cadena.charAt(i));
//					if (!frag.equals(" ")) {
//						System.out.print(morseaTexto.get(frag)+" ");
//					} else {
//						System.out.print("   ");
//					}
//				}
//				System.out.println();
				break;
			default:
				break;
			}
			System.out.println("\tdeseas hacer otra conversion\n1.- si\n2.- no");
			n = leer.nextInt();
			continuar = n==1? true:false;
		}while(continuar);




	}

	private static ArrayList<String> separar(String cadena)  {
		ArrayList<String> palabras = new ArrayList<String>();
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)==' ') {
				System.out.println(" si entro vale "+i);
				palabras.add(cadena.substring(0, i));
				cadena = cadena.substring(i, cadena.length());
				System.out.println("la cadena es ahora: "+cadena);
			}else
			System.out.println(" no entro vale "+i);
		}
		
		return palabras;

	}

	private static String leerCadena(String mensaje) {
		leer = new Scanner(System.in);
		System.out.println(mensaje);
		String cadena =  leer.nextLine();
		return cadena;
	}

	private static void llenarMapa(HashMap<String, String> mapmorse ) {
		mapmorse.put("a", ".-");
		mapmorse.put("b", "-...");
		mapmorse.put("c", "-.-.");
		mapmorse.put("d", "-..");
		mapmorse.put("e", ".");
		mapmorse.put("f", "..-.");
		mapmorse.put("g", "--.");
		mapmorse.put("h", "....");
		mapmorse.put("i", "..");
		mapmorse.put("j", ".---");
		mapmorse.put("k", "-.-");
		mapmorse.put("l", ".-..");
		mapmorse.put("m", "--");
		mapmorse.put("n", "-.");
		mapmorse.put("o", "---");
		mapmorse.put("p", ".--.");
		mapmorse.put("q", "--.-");
		mapmorse.put("r", ".-.");
		mapmorse.put("s", "...");
		mapmorse.put("t", "-");
		mapmorse.put("u", "..-");
		mapmorse.put("v", "...-");
		mapmorse.put("w", ".--");
		mapmorse.put("x", "-..-");
		mapmorse.put("y", "-.--");
		mapmorse.put("z", "--..");
		mapmorse.put("1", ".----");
		mapmorse.put("2", "..--");
		mapmorse.put("3", "...--");
		mapmorse.put("4", "....-");
		mapmorse.put("5", ".....");
		mapmorse.put("6", "-....");
		mapmorse.put("7", "--..");
		mapmorse.put("8", "---..");
		mapmorse.put("9", "----·");
		mapmorse.put("10", "-----");
		System.out.println("finalizo llenado");
	}

}
