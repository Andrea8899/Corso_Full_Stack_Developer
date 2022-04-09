package lezione_uno;

public class Printer {
	
	public Printer() {
		System.out.println("Sono dentro costruttore di Printer");
	}
	public Printer(String print) {
		System.out.println("Sono "+print);
	}
	
	public void printHello() {
		System.out.println("Hello from Printer.java");
	}
	
	public String printHelloWithReturn(String string) {
		return string;
	}
}
