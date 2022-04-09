package esercizi_lez_uno;

import java.util.Scanner;

public class Esercizio10 {

	
	
	
	
	
	
	public static void main(String[] args) {
		int countLetters = 0;
		int countSpaces = 0;
		int countNumber = 0;
		int other = 0;
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		for (int k=0; k< s.length();k ++) {
			if (Character.isLetter(s.charAt(k))) {
				countLetters ++;
			}
			else if (Character.isDigit(s.charAt(k))) {
				countNumber ++;
			}
			else if (Character.isSpaceChar(s.charAt(k))) {
				countSpaces ++;
			}
			else {
				other ++;
			}
		}//end for
	}
		
}