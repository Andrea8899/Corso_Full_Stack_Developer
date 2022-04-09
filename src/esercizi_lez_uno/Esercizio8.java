package esercizi_lez_uno;

public class Esercizio8 {
    public void compareTwoNumbers(int n1, int n2) {
    	if (n1 == n2 ){
    		System.out.println(""+n1+"=="+""+n2);
    	}
    	else {
    		System.out.println(""+n1+"!="+""+n2);
    		if (n1 < n2 ) {
        		System.out.println(""+n1+"<="+""+n2);
        		System.out.println(""+n1+"<"+""+n2);
        	}
    		else {
        		System.out.println(""+n1+">"+""+n2);
        		System.out.println(""+n1+">="+""+n2);
        	}
    	}// end else
    	
    }
	
	
	
	
	public static void main(String[] args) {
		Esercizio8 e8 = new Esercizio8();
		e8.compareTwoNumbers(25, 29);
	}
}
