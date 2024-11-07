package Mondevoir;

import java.util.Date;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Banque banque = new Banque("B001", "France");

        Client client1 = new Client("C001", "Alice", "Dupont", "123 Rue Exemple", "alice@example.com", 123456789);
        Client client2 = new Client("C002", "Bob", "Martin", "456 Rue Exemple", "bob@example.com", 987654321);

        Compte compte1 = client1.creecompte("AC123", new Date(), new Date(), 40000, client1, banque);
        Compte compte2 = client2.creecompte("AC456", new Date(), new Date(), 50000, client2, banque);

        compte1.ajouterTransaction("TXN001", compte2); 
        compte1.ajouterTransaction("TXN002", compte1);  
        compte2.ajouterTransaction("TXN003", compte1);  

        // Check results
        for (Transaction transaction : compte1.getTransactions()) {
            System.out.println("Transaction: " + transaction.getTypeT() + " | Reference: " + transaction.getref() + " | Montant: " + compte1.getdevise());
        }

        for (Transaction transaction : compte2.getTransactions()) {
            System.out.println("Transaction: " + transaction.getTypeT() + " | Reference: " + transaction.getref() + " | Montant: " + compte2.getdevise());
        }
    }
}
