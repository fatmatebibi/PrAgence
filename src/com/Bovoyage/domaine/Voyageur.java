package com.Bovoyage.domaine;

public class Voyageur extends Personne {
 
  private String numeroPieceIdentite;
  private int age;
  public Reservation  reservation ; 
  
  //Constructeur
  protected Voyageur(String numeroPieceIdentite, int age, Reservation reservation) {
		this.numeroPieceIdentite = numeroPieceIdentite;
		this.age = age;
		this.reservation = reservation;
	}
 
	  
  public Voyageur(Personne p, int age, String numeroPieceIdentite) {
	  super(p.getCivilite(), p.getNom(), p.getPrenom(), p.getEmail(), getMyAdresse());
		this.age = age;
		this.numeroPieceIdentite = numeroPieceIdentite;
}


public Voyageur(Civilite civilite, String nom, String prenom, String email, Adresse myAdresse) {
	super(civilite, nom, prenom, email, myAdresse);
	// TODO Auto-generated constructor stub
}

//getter and setter
  protected String getNumeroPieceIdentite() {
  return numeroPieceIdentite;
  }
protected void setNumeroPieceIdentite(String numeroPieceIdentite) {
	this.numeroPieceIdentite = numeroPieceIdentite;
}
protected int getAge() {
	return age;
}
protected void setAge(int age) {
	this.age = age;
}



  
  
  
  

}