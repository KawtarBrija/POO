package tpgestiondebiblio;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LectureTexte {
    public static void main(String[] args) {
       
        String fichierEntree = "livres.txt";
        String fichierSortie = "sortie.txt";
        // Lecture du fichier d'entrée et écriture dans le fichier de sortie
        try (BufferedReader br = new BufferedReader(new FileReader(fichierEntree));
        		 BufferedWriter bw = new BufferedWriter(new FileWriter(fichierSortie))){
            String ligne;
        // Lire chaque ligne et l'écrire dans le fichier de sortie

            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne);
                bw.write(ligne); 
                bw.newLine(); 
            }
        } catch (IOException e) {
            // Gestion des erreurs d'entrée/sortie  
            System.err.println("Erreur lors de la lecture  ou de l'écriture du fichier : " + e.getMessage());
        }
    }
}


