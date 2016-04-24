//Kilde: http://stackoverflow.com/questions/859562/whats-the-best-way-to-recursively-reverse-a-string-in-java
public class SnuTekst {

	SnuTekst() {
	}

	public static String SnuTekst(String tekst) {
		int len = tekst.length();
		return len <= 1 ? tekst : (SnuTekst(tekst.substring(len / 2)) + SnuTekst(tekst.substring(0, len / 2)));
	}
}