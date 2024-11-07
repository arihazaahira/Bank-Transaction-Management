package Mondevoir;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class Compte {
	private String Numcompte;
	private Date datecreation,dateupdate;
	private double  devise;
	private Client client;	
	private Banque banque;	
	private List<Transaction>Transactions=new ArrayList();
	public Compte(String num,Date date1,Date date2,double dev,Client c,Banque b) {
		this.Numcompte=num;
		this.datecreation=date1;
		this.dateupdate=date2;
		this.devise=dev;
		this.client=c;
		this.banque=b;
	}
   
      
    
    public Typetransaction determineTransactionType(Compte compteDestination) {
        if (this.equals(compteDestination)) {
            return Typetransaction.VIRMEST;
        } else if (this.client.equals(compteDestination.getClient())) {
            return Typetransaction.VIRMINT;
        } else if (this.banque.equals(compteDestination.getBanque())) {
            return Typetransaction.VIRMULTA;
        } else {
            return Typetransaction.VIRCHAC;
        }
    }
    public void ajouterTransaction(String ref, Compte compteDestination) {
        if (compteDestination == null) {
            System.out.println("Erreur : Le compte destination est invalide.");
            return;
        }

        Typetransaction typeTransaction = determineTransactionType(compteDestination);
        Transaction transaction = new Transaction(typeTransaction, ref, this, compteDestination);
        this.Transactions.add(transaction);

        System.out.println("Transaction ajoutée : " + transaction);
    }
    public List<Transaction> getTransactions() {
        return Transactions;
    }
    public String getnumc() {
    	return this.Numcompte;
    }
    public Date getdate1() {
    	return this.datecreation;
    }
    public Date getdate2() {
    	return this.dateupdate;
    }
    public double getdevise() {
    	return this.devise;
    }
    public Client getClient() {
    	return this.client;
    }
    public Banque getBanque() {
    	return this.banque;
    }
  }
	

