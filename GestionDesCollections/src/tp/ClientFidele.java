package tp;

import java.util.List;

public class ClientFidele extends Client {
		
	String codeFidelite;
	float tauxDeReduction;
	 
	public ClientFidele( String codeFidelite, float tauxDeReduction, int codeClient, String nomClient, String adrClient,String telClient, List<Commande> listCommandes) {
		super(codeClient, nomClient, adrClient, telClient, listCommandes);
		this.codeFidelite = codeFidelite;
		this.tauxDeReduction = tauxDeReduction;
		
	}
	public String getCodeFidelite() {
        return codeFidelite;
    }
	
	 @Override
	    public String toString () {
	        return super.toString() + 
	                "\n Code de fidelite : " + codeFidelite +
	                "\n Taux de reduction : " + tauxDeReduction + "%";
	    }

    public void setCodeFidelite(String codeFidelite) {
        this.codeFidelite = codeFidelite;
    }

    public float getTauxReduction() {
        return tauxDeReduction;
    }

    public void setTauxReduction(float tauxReduction) {
        this.tauxDeReduction = tauxReduction;
    }

   
}
