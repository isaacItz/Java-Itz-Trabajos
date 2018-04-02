package modelo;

public class Prubas {

	public static void main(String[] args) {
		
		evenlySpaced(67, 666, 9);
		
	}
	
	public static void evenlySpaced(int a, int b, int c) {
		  
		  int med = 0;
		  int myr = 0;
		  int men = 0;
		  
		  if(a>b){
		    myr = a;
		    men = b;
		  } 
		  else{
		    myr = b;
		    men = a;
		  } 
		  
		  if(c>myr) {
		    med = myr;
		    myr = c;
		  }
		  else{
			  med = c;
		    if(men>med){
		    	med = men;
		    }
		  }
		  
		  System.out.println(myr);
		  System.out.println(med);
		  System.out.println(men);
		  
		}

	
	public static int makeChocolate(int small, int big, int goal) {
		  
		
		  System.out.println((small+big+goal)%5);

		  if((small+big+goal)%5<5 & (small+big+goal)%5>0 )return (small+big+goal)%5;		  
		  else return -1;
		  
		}


}
