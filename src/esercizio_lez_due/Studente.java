package esercizio_lez_due;


public class Studente extends Persona {
	private String matricola;
	private String corsoStudio;
	private String universita;
	private  int mediaVoti;
	public Studente(String nome,String cognome,String matricola,String corsoStudio,String universita,int mediaVoti){
		super(nome,cognome);
		this.matricola = matricola;
		this.corsoStudio = corsoStudio;
		this.universita = universita;
		this.mediaVoti = mediaVoti;	
	}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public String getCorsoStudio() {
		return corsoStudio;
	}
	public void setCorsoStudio(String corsoStudio) {
		this.corsoStudio = corsoStudio;
	}
	public String getUniversita() {
		return universita;
	}
	public void setUniversita(String universita) {
		this.universita = universita;
	}
	public int getMediaVoti() {
		return mediaVoti;
	}
	public void setMediaVoti(int mediaVoti) {
		this.mediaVoti = mediaVoti;
	}
	
	
	
	
	
	public boolean studenteIniziaL(String nome) {
		return nome.charAt(0) == 'L' ? true : false;
	}
	
	public boolean studenteSecchione(int mediaVoto) {
		return mediaVoto >= 29 ? true : false;
	}
	
	public boolean informatico(String corsoStudio) {
		return corsoStudio == "Informatica" ? true : false;
	}
	
	
	public static void printStudentiIniziaL(Studente[] studenti) {
		for(int i = 0; i < studenti.length;i++) {
			Studente s = studenti[i];
			if(s.studenteIniziaL(s.getNome())) {
				System.out.println(s.getNome()+" inizia con la L");
			}
	    }
	}
	
	public static void printStudentiSecchioni(Studente[] studenti) {
		for(int i = 0; i < studenti.length;i++) {
			Studente s = studenti[i];
			if(s.studenteSecchione(s.getMediaVoti())) {
				System.out.println(s.getNome()+" è un secchione dato che ha la media del "+s.getMediaVoti());
			}
	    }
	}
	
	public static void printStudentiInformatici(Studente[] studenti) {
		for(int i = 0; i < studenti.length;i++) {
			Studente s = studenti[i];
			if(s.informatico(s.getCorsoStudio())) {
				System.out.println(s.getNome()+" vuole essere un infomatico ");
			}
	    }
	}
	
	
	
	public static void main(String[] args) {
		Studente s1 = new Studente("Andrea","Bertone","3833883","Informatica","Sapienza",25);
		Studente s2 = new Studente("Luca","Neri","1289893","Economia","Tor Vergata",29);
		Studente s3 = new Studente("Anna","Bianchi","389291","Geologia","Sapienza",30);
		Studente s4 = new Studente("Giorgia","Longhi","3984982","Informatica","Sapienza",22);
		
		Studente[] studenti = {s1,s2,s3,s4};
		printStudentiIniziaL(studenti);
		printStudentiSecchioni(studenti);
		printStudentiInformatici(studenti);
	}
	
}
