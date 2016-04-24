//Kilde: http://stackoverflow.com/questions/859562/whats-the-best-way-to-recursively-reverse-a-string-in-java
//Del 3 av oppgaven allerede oppfylt?
public class SnuTekst {
	public static Integer antKall = 0;

	SnuTekst() {
	}
	public static String SnuTekst(String tekst) {
		antKall++;
		int len = tekst.length();
		return len <= 1 ? tekst : (SnuTekst(tekst.substring(len / 2)) + SnuTekst(tekst.substring(0, len / 2)));
	}
}