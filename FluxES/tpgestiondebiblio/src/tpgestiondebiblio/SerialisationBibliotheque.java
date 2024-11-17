package tpgestiondebiblio;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialisationBibliotheque {
	  public static void main(String[] args) {
	        // Création d'une liste de livres
	        List<Livre> bibliotheque = new ArrayList<>();
	        bibliotheque.add(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943));
	        bibliotheque.add(new Livre("1984", "George Orwell", 1949));
	        bibliotheque.add(new Livre("Les Misérables", "Victor Hugo", 1862));

	        // Sérialisation de la liste de livres dans un fichier binaire
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bibliotheque.ser"))) {
	            oos.writeObject(bibliotheque); // Écriture de la liste dans le fichier
	            System.out.println("La bibliothèque a été sérialisée avec succès !");
	        } catch (IOException e) {
	            System.err.println("Erreur lors de la sérialisation : " + e.getMessage());
	        }
	        // Désérialisation de la liste de livres
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bibliotheque.ser"))) {
	            List<Livre> livresDeserialises = (List<Livre>) ois.readObject(); // Lecture des objets du fichier
	            System.out.println("\nListe des livres désérialisée :");
	            for (Livre livre : livresDeserialises) {
	                System.out.println(livre); // Affichage des livres
	            }
	        } catch (IOException | ClassNotFoundException e) {
	            System.err.println("Erreur lors de la désérialisation : " + e.getMessage());
	        }
	    
	    }

}
