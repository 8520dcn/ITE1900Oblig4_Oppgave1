import java.util.Scanner;

public class testSnuTekst {
	private static String tekst;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SnuTekst snuTekst = new SnuTekst();
		System.out.println("Skriv inn tekst som skal:");
		tekst = input.nextLine();
		System.out.println("Teksten du skrev blir dette baklengs: " + snuTekst.SnuTekst(tekst));
		System.out.println("Funksjonen ble kallt " + snuTekst.antKall + " ganger for aa snu teksten");
	}
}
