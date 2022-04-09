package esercizi_lez_uno;

public class Esercizio15 {

	
	
	
	
	
	public static void main(String[] args) {
		int[] arrayInt = {20,30,40,50,67};
		int first = arrayInt[0];
		int last = arrayInt[arrayInt.length-1];
		int middle = arrayInt[(arrayInt.length-1)/2];
		int max = first;
		if (last > first){max = last;
		}
		if (middle > max) {
			max = middle;
		}
		System.out.println( max);
	}
	
}
