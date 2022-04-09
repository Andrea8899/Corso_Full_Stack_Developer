package esercizi_lez_uno;

public class Esercizio9 {

	public void reverseString(String s) {
		String reverseString = "";
		for(int i = s.length()-1 ;i > -1; i--) {
			reverseString += s.charAt(i);
		}
		System.out.println(reverseString);
	}
	
	public static void main(String[] args) {
		Esercizio9 e9 = new Esercizio9();
		e9.reverseString("The quick brown fox");
	}
	
}
