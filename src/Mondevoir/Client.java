package Mondevoir;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
	private String Numc;
	private String Nom,prenom,adresse,email;
	private int phone;
	private List<Compte>comptes=new ArrayList();

	public Client(String Num,String nom,String prenom,String adresse,String mail,int phone){
		this.Numc=Num;
		this.Nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		this.email=mail;
		this.phone=phone;
		
	}
	public String getnum() {
		return this.Numc;
	}
	public String getnom() {
		return this.Nom;
	}
	public String getprenom() {
		return this.prenom;
	}
	public String getaddr() {
		return this.adresse;
	}
	public String getmail() {
		return this.email;
	}
	public int getphone() {
		return this.phone;
	}
	public List<Compte> getcompte(){
		return this.comptes;
	}

    public Compte creecompte(String num,Date date1,Date date2,double dev,Client c,Banque b) {
    	Compte compte=new Compte(num,date1,date2,dev,this,b);
    	comptes.add(compte);
    	b.creecompte(compte);
        System.out.println("Compte créé avec succès pour le client " + this.Nom + " " + this.prenom);
       
     return compte;
    	
    }
  
      
    }


