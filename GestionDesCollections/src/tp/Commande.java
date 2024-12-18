package tp;

import java.time.LocalDate;

public class Commande implements Comparable<Commande>{
    private int numCommande;           
    private LocalDate dateCommande;    
    private String nomFournisseur;     
    
    public Commande(int numCommande, LocalDate dateCommande, String nomFournisseur) {
        this.numCommande = numCommande;
        this.dateCommande = dateCommande;
        this.nomFournisseur = nomFournisseur;
    }

 
    public int getNumCommande() {
        return numCommande;
    }

    public void setNumCommande(int numCommande) {
        this.numCommande = numCommande;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }
    
    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }
     
    public String toString() {
        return "Commande (" +
                "Numero de commande : " + numCommande +
                ", Nom du fournisseur : " + nomFournisseur +
                ", Date de commande : " + dateCommande +
                ')';
    }
    
    public boolean equals(Object obj) {
        if (this == obj) 
        	return true; 
        if (obj == null || getClass() != obj.getClass()) 
        	return false; 
        Commande commande = (Commande) obj; 
        return numCommande == commande.numCommande; 
    }


	public int compareTo(Commande other){
		return this.dateCommande.compareTo(other.dateCommande);
	}
}
