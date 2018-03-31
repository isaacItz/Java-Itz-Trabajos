package modelo;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

	private static Scanner leer;

	public static void main(String[] args) {

		HashMap<String, String> textoaMorse = new HashMap<String, String>();
		HashMap<String, String> morseaTexto = new HashMap<String, String>();
		leer = new Scanner(System.in);
		llenarMapa(textoaMorse);

		for (String i : textoaMorse.keySet()) {
			morseaTexto.put(textoaMorse.get(i), i);
		}
		morseaTexto.put("", " ");

		String cadena;
		int op,n;
		boolean continuar;

		do {
			System.out.println("\t¿Que Deseas Hacer?\n1.- Convertir Texto a Codigo Morse\n2.- Convertir Codigo Morse a Texto");
			op = leer.nextInt();
			switch (op) {
			case 1:
				//texto a morse
				cadena = leerCadena("\tIngresa el Mensaje a Convertir");
				System.out.println("*******************");
				System.out.println("La Cadena \""+cadena+"\" es");
				for (int i = 0; i < cadena.length(); i++) {
					String frag = String.valueOf( cadena.charAt(i));
					frag = frag.toLowerCase();

					if (!frag.equals(" ")) {
						if (!(textoaMorse.get(frag)==null)) {
							System.out.print(textoaMorse.get(frag)+" ");
						}else {
							System.out.println("haz ingresado caracteres erroneos"); 
							break;
						}
					} else {
						System.out.print("   ");
					}
				}
				System.out.println();
				break;

			case 2:
				//morse a texto
				String cad= leerCadena("Ingresa el Codigo Morse");
				String[] sep1 = cad.split(" ");
				for (int k = 0; k < sep1.length; k++) {
					System.out.print(morseaTexto.get(sep1[k]));
				}
				break;
			default:
				break;
			}
			System.out.println("\n\t¿Deseas Hacer Otra Conversion?\n1.- si\n2.- no");
			n = leer.nextInt();
			continuar = n==1? true:false;
		}while(continuar);


		System.out.println("fin");

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
	}

}
