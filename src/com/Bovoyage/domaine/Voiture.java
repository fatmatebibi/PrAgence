package com.Bovoyage.domaine;

import java.util.Date;

public class Voiture extends Prestation {
	  private String classe;
	  private String compagnie;


//const
protected Voiture(Date dateDepart, Date dateArrivee, double prixHT, String classe,String compagnie) {
	super(dateDepart, dateArrivee, prixHT);
	this.classe = classe;
   this.compagnie = compagnie;}



// getter setter
public String getClasse() {
	return classe;
}

public void setClasse(String classe) {
	this.classe = classe;
}


public String getCompagnie() {
	return compagnie;
}


public void setCompagnie(String compagnie) {
	this.compagnie = compagnie;
}

}