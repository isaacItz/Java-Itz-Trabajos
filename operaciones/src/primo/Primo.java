package primo;
import static javax.swing.JOptionPane.*;
public class Primo {
	
	public static void main (String a[]){
		
		String s = showInputDialog("digite un numero");

		int n = Integer.parseInt(s);

		int aux = 0, cont = 0;
		
		for (int i= 1; i<= n; i++){
			
			aux = n%i;
			
			if(aux==0){
				cont += 1;
			}
			
		}
		
		if(cont == 2){
			showMessageDialog(null, "el numero "+ n +" es primo");
		}else
			showMessageDialog(null, "el numero "+ n +" no es primo, lo dividen "
												+ "en total "+cont+" numeros");
		
	}

}
