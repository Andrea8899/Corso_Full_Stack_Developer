package pizzeria;

import java.util.HashMap;

public class Pizza {

	private String nome;
	private Double prezzo;
	private HashMap<String,Double> ingredienti;
	
	public Pizza() {
		
	}
	
	public Pizza(String nome,Double prezzo,HashMap<String,Double>ingredienti) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.ingredienti = ingredienti;
	}

	/*    GETTERS E SETTERS */
	public String getNome() {return nome;}

	public void setNome(String nome) {this.nome = nome;}

	public Double getPrezzo() {return prezzo;}

	public void setPrezzo(Double prezzo) {this.prezzo = prezzo;}

	public HashMap<String,Double> getIngredienti() {return ingredienti;}

	public void setIngredienti(HashMap<String,Double> ingredienti) {this.ingredienti = ingredienti;}
	
	
	
	public void aggiungiIngrediente(String ingrediente,Double prezzo) {
		ingredienti.put(ingrediente,prezzo);
	}
	public void rimuoviIngrediente(String ingrediente) {
		ingredienti.remove(ingrediente);
	}
	public void stampaDescrizione() {
		toString();
	}
	
	public String toString() {
		return "La"+this.getClass().getName()+ "ha i seguenti ingredienti "+getIngredienti().keySet()+" ad un prezzo totale di "+getPrezzo()+"€";
	}
	
}
