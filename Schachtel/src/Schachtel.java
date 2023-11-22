/* Beispiel für die Schachtelung von Methodenaufrufen
*/

public class Schachtel {

	public static void main(String[] args) {
		System.out.println("Hier Anfang Hauptprogramm!");
		m1();
		System.out.println("Hier wieder Hauptprg.");
		m2();
		System.out.println("Hier Ende Hauptprogramm!");
	}

	public static void m1() {
		System.out.println("\tHier beginnt \"m1()\"!");
		m1a();
		m1b();
		System.out.println("\tHier endet \"m1()\"!");

	}
	
	public static void m1a() {
		System.out.println("\t\tHier ist \"m1a()\"!");
	}
	
	public static void m1b() {
		System.out.println("\t\tHier ist \"m1b()\"!");
	}
	
	public static void m2() {
		System.out.println("\tHier ist \"m2()\"!");	
	}
	
}
