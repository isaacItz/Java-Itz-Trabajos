package modelo;
import java.util.Scanner;
public class Main {

	private static Scanner scanner;

	public static void main(String[] lol) {
		
		boolean rep ;
		
		do {
			
		System.out.println("ingresa un numero entre 1 y 1000 para convertirlo a romano");
		scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();

		int u = n%10;
		n /= 10;
		int d = n % 10;
		n/=10;
		int c = n%10;
		n/=10;
		int m = n%10;

		String num = "";

		switch (m) {
		case 1:  num +="M";		break;
		default:
			break;
		}

		switch (c) {
		case 1:  num +="C";		break;
		case 2:  num +="CC";	break;
		case 3:  num +="CCC";	break;
		case 4:  num +="CD";	break;
		case 5:  num +="D";		break;
		case 6:  num +="DC";	break;
		case 7:  num +="DCC";	break;
		case 8:  num +="DCCC";	break;
		case 9:  num +="CM";	break;

		default:
			break;
		}
		switch (d) {
		case 1:  num +="X";		break;
		case 2:  num +="XX";	break;
		case 3:  num +="XXX";	break;
		case 4:  num +="LX";	break;
		case 5:  num +="L";		break;
		case 6:  num +="LX";	break;
		case 7:  num +="LXX";	break;
		case 8:  num +="LXXX";	break;
		case 9:  num +="XC";	break;

		default:
			break;
		}
		
		switch (u) {
		case 1:  num +="I";		break;
		case 2:  num +="II";	break;
		case 3:  num +="III";	break;
		case 4:  num +="IV";	break;
		case 5:  num +="V";		break;
		case 6:  num +="VI";	break;
		case 7:  num +="VII";	break;
		case 8:  num +="VIII";	break;
		case 9:  num +="IX";	break;

		default:
			break;
		}

		System.out.println(num);
		System.out.println("quieres repetir el programa? \n1.- si\n2.- no;");
		rep = scanner.hasNext();
		} while (rep);
	}


}