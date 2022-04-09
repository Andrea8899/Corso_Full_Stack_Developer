package esercizi_lez_tre;

import java.util.Arrays;
import java.util.Scanner;

public class Operazioni {
	
	public static void inputNumeri(int numeroFine) {
		int [] arrayInt = new int[numeroFine];
		int[] outputNumbers = {0,0,0};
		Scanner input = new Scanner(System.in);
		String s = "";
		int counter = 0;
		while (!(s.equals( "-1") ) && counter < numeroFine) {
			System.out.println("Inserisci un numero ");
			s = input.nextLine();
			if (!(s.equals( "-1")))
					arrayInt[counter] = Integer.parseInt(s);
			counter ++;
		}
		System.out.println("Il numero più grande è "+ maxInt(arrayInt));
		System.out.println("Il numero più grande è "+ minInt(arrayInt));
		System.out.println("Il numero totali di numeri sono "+ counter);
		
	}
	
	
	public static int maxInt(int[] arrayInt) { 
		int max = arrayInt[0];
		for (int num : arrayInt) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
	public static int minInt(int[] arrayInt) { 
		int min = arrayInt[0];
		for (int num : arrayInt) {
			if (!(num > min) )
				min = num;
		}
		return min;
	}
	
	
	
	public static void creaArray() {
		Scanner inputInt = new Scanner(System.in);
		System.out.println("\n\nDi quanto deve essere lunga la tua array? ");
		int len = inputInt.nextInt();
		String [] arrayString = new String[len];
		int counter = 0;
		Scanner input = new Scanner(System.in);
		String s= "";
		while (counter < len) {
			System.out.println("Inserisci una stringa");
			s = input.nextLine();
			arrayString[counter] = s;
			counter ++;
		}
		stampaStrigheFineO(arrayString);
	}
	
	public static void stampaStrigheFineO(String[]strings) {
		for (String s : strings) {
			if (s.endsWith("o"))
				System.out.println(s + " finsce con la lettera o");
		}
	}
	
	public static int[] aggiungiNumero(int[] arrayInt) {
		int [] outputArrayInt = Arrays.copyOf(arrayInt,arrayInt.length+1);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Inserisci un nuovo numero ");
		String s = input2.nextLine();
		int num = Integer.parseInt(s);
		outputArrayInt[arrayInt.length] = num;
		input2.close();
		return outputArrayInt;
	}
	
	public static void stampaArray(int[] numbers) {
		String out ="[";
		for (int i : numbers) {
			out += i + ",";
		}
		out += "]";
		System.out.println(out);
	}
	
	
	public static void main(String[] args) {
		inputNumeri(8);
		creaArray();
		int [] arrayInt = {5,4,8,9};
		stampaArray(aggiungiNumero(arrayInt));
	}

}
