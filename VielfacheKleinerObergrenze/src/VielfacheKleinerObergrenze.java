/*
 * Beispiel für eine while-Schleife:
 * Die Vielfachen einer (krummen, großen) Zahl,
 * die kleiner sind als eine Obergrenze
 */
public class VielfacheKleinerObergrenze {

	public static void main(String[] args) {
		int zahl = 179, obergrenze = 10000;
		// *********************************
		int vielfaches = zahl;
		
		System.out.println
		("Die Vielfachen von "+zahl+",");
		System.out.println
		("die kleiner sind als "+obergrenze+":\n");
		
		while (vielfaches < obergrenze) {
			System.out.print(vielfaches+" ");
			vielfaches = vielfaches + zahl;
		}
	}
}
