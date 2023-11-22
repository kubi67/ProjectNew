/*
 * Vom einzelnen Parameter zur Parameterliste
 */

public class SchreibeSterne2Par {

	public static void main(String[] args) {
		schreibeSterne(10, 'a');
		schreibeSterne(15, 'b');
		schreibeSterne( 5, 'c');
	}
	
	public static void schreibeSterne(int anzahl, char zeichen) {
		for (int i=1; i<=anzahl; i++)
			System.out.print(zeichen);
		System.out.println();
	}
}
