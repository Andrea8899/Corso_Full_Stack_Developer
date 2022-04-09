package lezione_uno;
import java.util.Scanner;

public class InputScanner {

	public static void main(String[] args) {
		Printer printer = new Printer();
		Printer printer2 = new Printer("print");
		printer.printHello();
		System.out.println( printer2.printHelloWithReturn("printReturn") );
		printHello();
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci input: ");
		String userInput = input.next();
		System.out.println("Hello \n " + userInput);
		
		
		int number = 30;
		long numberLong = 30L;
		double numberDouble = 30.0;
		boolean boole = true;
		String string = "andrea";
		String empty= "";
		
		
		String[] stringsArray = new String[5];
		stringsArray[0] = "Stringa posizione 0";
		stringsArray[1] = "Stringa posizione 1";
		stringsArray[2] = "Stringa posizione 2";
		stringsArray[3] = "Stringa posizione 3";
		stringsArray[4] = "Stringa posizione 4 ";
		for(int i = 0; i < stringsArray.length;i++) {
			System.out.println(stringsArray[i]);
		}
		int counter = 0;
		while(counter < stringsArray.length) {
			System.out.println(stringsArray[counter]);
			if (counter == 2 ) {
				System.out.println("numero pari");
			}
			else {
				System.out.println("Indice diverso da 2 ");
			}
			counter ++;
		}
	}// end main
	
	public static void printHello() {
		System.out.println("Hello");
	}
	
}
