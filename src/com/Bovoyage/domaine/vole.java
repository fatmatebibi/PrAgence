package com.Bovoyage.domaine;

import java.util.Date;

public class vole extends Prestation {
  


  private String aeroport;
  private String compagnie;
  
  // Constructor
  
  protected vole(Date dateDepart, Date dateArrivee, double prixHT, String aeroport, String compagnie) {
		super(dateDepart, dateArrivee, prixHT);
		this.aeroport = aeroport;
		this.compagnie = compagnie;
	}
  
//getter and setter

public String getAeroport() {
	return aeroport;

}

protected vole(Date dateDepart, Date dateArrivee, double prixHT) {
	super(dateDepart, dateArrivee, prixHT);
	
}

public void setAeroport(String aeroport) {
	this.aeroport = aeroport;
}

public String getCompagnie() {
	return compagnie;
}

public void setCompagnie(String compagnie) {
	this.compagnie = compagnie;
}

}