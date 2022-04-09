package esercizio_lez_due;

public class Persona {

	private String nome;
	private String cognome;
	private int eta;
	private enum Genere{MASCHIO,FEMMINA};
	private String cf;
	private String numeroTelefono;
	private Genere genere;
	
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Persona(String nome,String cognome,int eta,Genere genere,String cf, String numeroTelefono) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.genere = genere;
		this.cf = cf;
		this.numeroTelefono = numeroTelefono;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Genere getGenere() {
		return genere;
	}

	public void setGenere(Genere genere) {
		this.genere = genere;
	}
	
	
	
	
	
	
	public boolean isMaggiorenne() {
		return this.getEta() >= 18 ? true : false;
	}
	
	public boolean isGenere() {
		return this.getGenere() == genere ? true : false;
	}
	
	
	public static void printMaggiorenni(Persona[] persone) {
		for(Persona p : persone) {// for each
			if(p.isMaggiorenne() ) {
				System.out.println(p.getNome()+" è maggiorenne");
			}
	    }
	}
	
	public static void printMinorenni(Persona[] persone) {
		for(Persona p : persone) {// for each
			if(!p.isMaggiorenne()) {
				System.out.println(p.getNome()+" è minorenne");
			}
	    }
	}
	
	
	public static void printMaschi(Persona[] persone) {
		for(Persona p : persone) { // for each
			if (p.isGenere()) {
				System.out.println(p.getNome()+" è maschio");
			}
	    }
	}
	public static void printFemmine(Persona[] persone) {
		for(Persona p : persone) { // for each
			if (p.isGenere()) {
				System.out.println(p.getNome()+" è femmina");
			}
	    }
	}
	
	
	public boolean equals(Object object) {
		Persona p2 = (Persona) object;
		return this.getCf().equals( p2.getCf()) ? true : false;
 	}
	
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Andrea","Bertone",23,Genere.MASCHIO,"BT3789NGF989","3890357109");
		Persona p2 = new Persona("Marco","Rossi",56,Genere.MASCHIO,"RS3393MC399489","3478443690");
		Persona p3 = new Persona("Anna","Bianchi",16,Genere.FEMMINA,"BT3789NGF989","3666780321");
		Persona p4 = new Persona("Maria","Ferrari",34,Genere.FEMMINA,"BT3789NGF989","3310029458");
		
		Persona[] persone = {p1,p2,p3,p4};
		printMaggiorenni(persone);
		printMinorenni(persone);
		printMaschi(persone);
		printFemmine(persone);
		
		}
	

	
}
		
		
		
		