package tpgestiondebiblio;
import java.io.FileInputStream;
import java.io.IOException;

public class LectureFichierBinaire {
	 public static void main(String[] args) {
	        String cheminFichier = "chemin/vers/votre/fichier"; 

	        try (FileInputStream fis = new FileInputStream(cheminFichier)) {
	            int octet;
	            // Lire chaque octet du fichier
	            while ((octet = fis.read()) != -1) {
	           
	            	System.out.print(octet + " ");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
