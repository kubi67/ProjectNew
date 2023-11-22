/*
 * Beispiel für eine Methode mit steigender Anzahl Parameter
 * Uns stört der steigende Aufwand.
 * Undenkbar bei z.B. 100 Parametern!
 */

public class MaxVielePar {

	public static void main(String[] args) {
		System.out.println(max2Par(3,5));
		System.out.println(max3Par(3,5,2));
		System.out.println(max4Par(3,5,2,7));
	}

	public static int max2Par(int a, int b) {
		int return_max;
		
		if (a>=b)
			return_max = a;
		else
			return_max = b;
		
		return return_max;
	}
	
	public static int max3Par(int a, int b, int c) {
		int return_max;
		
		if ( (a>=b) && (a>=c) )
			return_max = a;
		else if ( (b>=a) && (b>=c) )
			return_max = b;
		else 
			return_max = c;
		
		return return_max;
	}
		
	public static int max4Par(int a, int b, int c, int d) {
		int return_max;
		
		if ( (a>=b) && (a>=c) && (a>=d) )
			return_max = a;
		else if ( (b>=a) && (b>=c) && (b>=d) )
			return_max = b;
		else if ( (c>=a) && (c>=b) && (c>=d) )
			return_max = c;
		else
			return_max = d;
		
		return return_max;
	}
}
