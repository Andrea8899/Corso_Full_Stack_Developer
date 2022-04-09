package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListArray {
	
	
	//****1***
	public static void main(String[]args) {
	List<String> arrayColori = new ArrayList<String>();
	arrayColori.add("Verde");
	arrayColori.add("Rosso");
	arrayColori.add("Blu");
	arrayColori.add("Bianco");
	//****1/2***
	for (int i = 0; i < arrayColori.size();i ++) {
		System.out.println(arrayColori.get(i));
	}
	//****3***
	Scanner input = new Scanner(System.in);
	System.out.println("Dimmi il colore che vuoi ");
	String s = input.nextLine();
	arrayColori.add(0,s);
	
	//****4***
	System.out.println("Dimmi l'indice del elemento che vuoi ");
	s = input.nextLine();
	arrayColori.get(Integer.parseInt(s));
	
	//****5***
	System.out.println("Dimmi l'elemento che vuoi modificare ");
	s = input.nextLine();
	int indexElUpdate = arrayColori.indexOf(s);
	System.out.println("Adesso dimmi l'elemento con il quale vuoi modificarlo ");
	s = input.nextLine();
	arrayColori.set(indexElUpdate,s);
	
	//****6***
	if (arrayColori.size()>=3) {
		arrayColori.remove(2);
	}
	
	//****7***
	boolean search = false;
	System.out.println("Dimmi l'elemento che cerchi ");
	s = input.nextLine();
	for (String color : arrayColori) {
		if (color.equals(s))
			search = true;
	}
	
	//****13***
	boolean twoArrayEqual = true;
	List<String> arrayColori2 = new ArrayList<>();
	arrayColori2.add("Verde");
	arrayColori2.add("Rosso");
	arrayColori2.add("Blu");
	arrayColori2.add("Bianco");
	
	if (arrayColori.size() == arrayColori2.size()) {
		for (int j = 0; j < arrayColori.size();j++) {
			if (arrayColori.get(j) != arrayColori2.get(j)) {
				twoArrayEqual = false;
			}
		}
	}
	else {
		twoArrayEqual = false;
	}
	
	
	//****18***
	for (int i = arrayColori.size()-1; i >= 0; i--) {
		arrayColori.remove(i);
	}
	
	//****18***
	boolean isEmpty = true;
	if ( arrayColori.size() > 0) {
		isEmpty = false;
	}
	
	
	
	
	
	
	}
	
	
	
}
