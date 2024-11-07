package Mondevoir;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;
import java.util.ArrayList;



public class JSONCONVERTER {

    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            Banque banque = new Banque("B001", "France");
            Client client = new Client("C001", "Alice", "Dupont", "123 Rue Exemple", "alice@example.com", 123456789);

            Compte compte = new Compte("AC123", new java.util.Date(), new java.util.Date(), 10000.0, client, banque);

            compte.ajouterTransaction("TRX001", compte);

            List<Client> clients = new ArrayList<>();
            clients.add(client);

            List<Compte> comptes = new ArrayList<>();
            comptes.add(compte);

            objectMapper.writeValue(new File("target/clients.json"), clients);

            objectMapper.writeValue(new File("target/comptes.json"), comptes);

            System.out.println("JSON files generated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
