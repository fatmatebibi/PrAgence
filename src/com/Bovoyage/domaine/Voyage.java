package com.Bovoyage.domaine;

import java.util.ArrayList;
import java.util.Scanner;


public class Voyage {

  private int numeroVoyage;
  private Boolean statut;
  public double prix;
  public Formule formule;
  public ArrayList<Reservation>  mesReservations;
  private Destination destination;
  private Scanner sc = new Scanner(System.in);
  private static long compteur = 0;
  
  
  

protected Voyage(int numeroVoyage, Boolean statut, double prix, Formule formule,
		ArrayList<Reservation> mesReservations, Destination destination) {
	super();
	this.numeroVoyage = numeroVoyage;
	this.statut = statut;
	this.prix = prix;
	this.formule = formule;
	this.mesReservations = mesReservations;
	this.destination = destination;
	this.setNumeroVoyage(++compteur);
	
	
	
}


//get and set 

public int getNumeroVoyage() {
	return numeroVoyage;}
	
public void setNumeroVoyage(long compteur2) {
	this.numeroVoyage = (int) compteur2;
}

public Boolean getStatut() {
	return statut;
}

public void setStatut(Boolean statut) {
	this.statut = statut;
}

public Destination getDestination() {
	return destination;
}

public void setDestination(Destination destination) {
	this.destination = destination;
}

public Scanner getSc() {
	return sc;
}

public void setSc(Scanner sc) {
	this.sc = sc;
}
//get and set 

public void changeStatus() { //boolean
	this.statut = !this.statut;
}


public int getPrix() {
	// TODO Auto-generated method stub
	return 0;
}




}