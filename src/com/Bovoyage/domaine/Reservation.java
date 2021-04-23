package com.Bovoyage.domaine;

import java.util.Scanner;
import java.util.Set;

public class Reservation {



	private Set<Voyageur> listeVoyageur;
	private long numeroReservation;
	private EtatsReservation etatReservation;
	public Client  client;
	public Assurance  assurance;
	public Voyage  voyage;
	
	private boolean authentifie;
	private static long compteur = 0;
	private  EtatsReservation Etat ;
	private double prix;
	private boolean estassuree;
	private Voyageur voyageurs;
	private Set<Voyageur> Voyageur;
    private double prixAssurance;


//const
public Reservation(Client client, Set<Voyageur> voyageurs, Voyage voyage, boolean estassuree, double prixAssurance) {
	this.setNumeroReservation( ++compteur);
	this.setEtat(EtatsReservation.EnAttente);
	this.setListeVoyageur(Voyageur);
	this.client = client;
	this.voyage = voyage;
    this.setVoyageur(voyageurs); 
	this.estassuree = estassuree;
	this.setPrixAssurance(prixAssurance);
	if (estassuree) this.assurance = new AssuranceAnnulation( prixAssurance, null, null);
	this.setPrixAssurance(prixAssurance);
}



//getter setter
public EtatsReservation getEtat() {
	return Etat;
}
public long getNumeroReservation() {
	return numeroReservation;
}
public void setNumeroReservation(long numeroReservation) {
	this.numeroReservation = numeroReservation;
}
public void setEtat(EtatsReservation etat) {
	Etat = etat;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	Set<Voyageur> set = (Set<Voyageur>) this.voyageurs;
	this.prix = this.voyage.getPrix() * set.size();
	if (this.estassuree) this.prix += this.assurance.getPrixAssurance();
}

//getter and setter
public boolean Estassuree() {
	return estassuree;
}

public void setEstassuree(boolean estassuree) {
	this.estassuree = estassuree;
}
public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}

public Assurance getAssurance() {
	return assurance;
}

public void setAssurance(Assurance assurance) {
	this.assurance = assurance;
}
public Voyage getVoyage() {
	return voyage;
}

public void setVoyage(Voyage voyage) {
	this.voyage = voyage;
}

public Set<Voyageur> getListeVoyageur() {
	return listeVoyageur;
}

public void setListeVoyageur(Set<Voyageur> listeVoyageur) {
	this.listeVoyageur = listeVoyageur;
}

public EtatsReservation getEtatReservation() {
	return etatReservation;
}

public void setEtatReservation(EtatsReservation etatReservation) {
	this.etatReservation = etatReservation;
}

public boolean isAuthentifie() {
	return authentifie;
}

public void setAuthentifie(boolean authentifie) {
	this.authentifie = authentifie;
}


public Voyageur getVoyageurs() {
	return voyageurs;
}

public void setVoyageurs(Voyageur voyageurs) {
	this.voyageurs = voyageurs;
}




/**
 * @return the voyageur
 */
public Set<Voyageur> getVoyageur() {
	return Voyageur;
}




/**
 * @param voyageur the voyageur to set
 */
public void setVoyageur(Set<Voyageur> voyageur) {
	Voyageur = voyageur;
}



/**
 * @return the prixAssurance
 */
public double getPrixAssurance() {
	return prixAssurance;
}



/**
 * @param prixAssurance the prixAssurance to set
 */
public void setPrixAssurance(double prixAssurance) {
	this.prixAssurance = prixAssurance;
}
}


