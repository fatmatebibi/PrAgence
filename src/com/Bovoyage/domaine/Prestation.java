package com.Bovoyage.domaine;

import java.util.*;

public abstract class Prestation {

	//const
  private Date dateDepart;
  protected static  Date dateArrivee;
  private static double prixHT;
protected Prestation(Date dateDepart, Date dateArrivee, double prixHT) {
	super();
	this.dateDepart = dateDepart;
	Prestation.dateArrivee = dateArrivee;
	Prestation.prixHT = prixHT;
}
//getter setter
public Date getDateDepart() {
	return dateDepart;
}

public void setDateDepart(Date dateDepart) {
	this.dateDepart = dateDepart;
}

public static Date getDateArrivee() {
	return dateArrivee;
}

public void setDateArrivee(Date dateArrivee) {
	Prestation.dateArrivee = dateArrivee;
}

public static double getPrixHT() {
	return prixHT;
}

public void setPrixHT(double prixHT) {
	Prestation.prixHT = prixHT;
}


  
}