package tpgestiondebiblio;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopierFichierBinaire {
	 public static void main(String[] args) {
	        String cheminSource = "chemin/vers/votre/fichier-source"; 
	        String cheminDestination = "chemin/vers/votre/fichier-destination"; 

	        try (FileInputStream fis = new FileInputStream(cheminSource);
	             FileOutputStream fos = new FileOutputStream(cheminDestination)) {

	            int octet;
	            
	            while ((octet = fis.read()) != -1) {
	                fos.write(octet);
	            }
	            System.out.println("Le fichier a été copié avec succès.");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
