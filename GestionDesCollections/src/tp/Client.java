package tp;

import java.util.ArrayList;
import java.util.List;


public class Client {
	
	 private int codeClient;
	 private String nomClient;
	 private String adrClient;
	 private String telClient;
	 private List<Commande> listCommandes;
	 
	 public Client(int codeClient,String nomClient,String adrClient,String telClient, List<Commande> listCommandes){
		 this.codeClient=codeClient;
		 this.adrClient=adrClient;
		 this.telClient=telClient;
		 this.adrClient=adrClient;
		 this.listCommandes = new ArrayList<Commande>();
	 }
	 public boolean  EnregistrerCommande(Commande nouvelleCommande){
		 for (Commande commande : listCommandes) {
	            if (commande.getNumCommande() == nouvelleCommande.getNumCommande()) {
	                System.out.println("La commande avec le num�ro " + nouvelleCommande.getNumCommande() + " existe d�j�.");
	            return false;    
	          
	            }
	        }
		 
		 listCommandes.add(nouvelleCommande);
	     System.out.println("La commande " + nouvelleCommande.getNumCommande() + " a �t� ajout�e avec succ�s.");
		return true; 
	 }
	 
	 public boolean SupprimerCommande(int numCommande){
		 for (Commande commande : listCommandes) {
	            if (commande.getNumCommande() == numCommande) {
	                listCommandes.remove(commande);
	                System.out.println("La commande avec le num�ro " + numCommande + " a ete supprimee.");
	                return true; 
	            }
	        }
	        System.out.println("Aucune commande avec le num�ro " + numCommande + " n'a ete trouvee.");
	        return false;
	 }
	 
	 public String toString() {
	        return "Commande (" +
	        		"Code du client = " + codeClient +
	                "Telephone du client = " + telClient +
	                ", Nom du client = '" + nomClient +
	                ", Adresse de client = " + adrClient +
	                ')';
	    }
	
		 
		 public List<Commande> getListCommandes() {
			    return listCommandes;
			}
			public int getCodeClient(){
				return codeClient;
			}
			public String getNomClient(){
				return nomClient;
			}
		
}
