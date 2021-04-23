package com.Bovoyage.domaine;

public abstract class Personne {

//enumeration et choix
	public enum Civilite {
		Mr,
		Mme,
		Mlle
	}
	
  private String nom;
  private String prenom;
  private String email;
  private static Adresse  myAdresse;
  public Civilite civilite;
  
  
  // const par def
  public Personne() {
		// TODO Auto-generated constructor stub
	}



  
//  Constructeur
  protected Personne(Civilite civilite, String nom, String prenom, String email, Adresse myAdresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.setMyAdresse(myAdresse);
	   this.civilite = civilite ;}
//Constructeurfn
  
  
  
  //getter and setter
	public Civilite getCivilite() {
		return civilite;
	}
	
	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}
	

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}



public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
//getter and setterfn




/**
 * @return the myAdresse
 */
public static Adresse getMyAdresse() {
	return myAdresse;
}




/**
 * @param myAdresse the myAdresse to set
 */
public void setMyAdresse(Adresse myAdresse) {
	Personne.myAdresse = myAdresse;
}


}