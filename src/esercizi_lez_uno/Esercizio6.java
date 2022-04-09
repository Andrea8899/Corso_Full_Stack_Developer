package esercizi_lez_uno;

public class Esercizio6 {

	public void average(int n1,int n2,int n3) {
		int average = (n1+n2+ n3)/3;
		System.out.println(""+average);
	}
	
	public static void main(String[] args) {
		Esercizio6 e6 = new Esercizio6();
		e6.average(10, 4, 7);
	}
}
