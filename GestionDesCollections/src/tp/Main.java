package tp;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    	Commande c1 = new Commande(104, LocalDate.of(2024, 12, 18), "Fournisseur E");
    	Commande c2 = new Commande(105, LocalDate.of(2024, 12, 12), "Fournisseur F");
    	Commande c3 = new Commande(106, LocalDate.of(2024, 12, 25), "Fournisseur G");
    	Commande c4 = new Commande(107, LocalDate.of(2024, 12, 10), "Fournisseur H");

    	Client client1 = new Client(3, "Sofia Kamil", "Rabat", "0601234567", new ArrayList<>());
    	Client client2 = new Client(4, "Moussa Hassan", "Tanger", "0665432109", new ArrayList<>());

    	client1.EnregistrerCommande(c1);
        client1.EnregistrerCommande(c2);
        client2.EnregistrerCommande(c3);
        client2.EnregistrerCommande(c4); 

        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        Collections.sort(client1.getListCommandes());
        System.out.println("\n Commandes triees pour le client 1 :");
        for (Commande commande : client1.getListCommandes()) {
            System.out.println(commande);
        }

        Set<Commande> uniqueCommandes = new HashSet<>();
        for (Commande commande : client1.getListCommandes()) {
            uniqueCommandes.add(commande);
        }
        System.out.println("\n Commandes uniques pour le client 1 :");
        for (Commande commande : uniqueCommandes) {
            System.out.println(commande);
        }

        Map<Integer, Client> clientMap = new HashMap<>();
        for (Client client : clients) {
            clientMap.put(client.getCodeClient(), client);
        }

        System.out.println("\n Clients associes a leur codeClient dans la Map :");
        for (Map.Entry<Integer, Client> entry : clientMap.entrySet()) {
            System.out.println("CodeClient: " + entry.getKey() + ", Client: " + entry.getValue().getNomClient());
        }

        String fileName = "clients.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Client client : clients) {
                writer.write(client.toString());
                writer.newLine();
            }
            System.out.println("\n Informations des clients �crites dans " + fileName);
        } catch (IOException e) {
            System.err.println("Erreur lors de l'ecriture dans le fichier : " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\n Contenu du fichier " + fileName + " :");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
}
