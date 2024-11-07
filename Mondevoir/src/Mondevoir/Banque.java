package Mondevoir;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Banque {
private String  Idbanque;
private String pays;
private List<Compte>comptes=new ArrayList();
private List<Client>clients=new ArrayList();
//const
public Banque(String ID,String pays){
	this.Idbanque=ID;
	this.pays=pays;
}
 public void creecompte(Compte compte) {
	 comptes.add(compte);
	 System.out.println("creation avec  succe du compte");
 }
 public void ajoutclient(Client client) {
	 this.clients.add(client);
	 System.out.println("client ajoute");
	 }
 public Client rechercheclient(String numc) {
	 for(Client c:clients) {
		 if(c.getnum().equals(numc)) {
			 return c;
			
			 }}
		
		  System.out.println("client introuvable");
		  return null;}
	 



 public String getid() {
	 return this.Idbanque;
 }
 public String getpays() {
	 return this.pays;
 }
 public List<Compte> getComptes() {
     return comptes;
 }
 public List<Client> getClients() {
     return clients;
 }
}