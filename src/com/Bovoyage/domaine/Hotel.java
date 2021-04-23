package com.Bovoyage.domaine;

import java.util.ArrayList;
import java.util.Date;

public class Hotel extends Prestation {



	public String nomHotel;
	private int nbEtoiles;
	private ArrayList<Chambre> mesChambres;
	private Adresse adresse;


//const

protected Hotel(Date dateDepart, Date dateArrivee, double prixHT, String nomHotel, int nbEtoiles,
		ArrayList<Chambre> mesChambres, Adresse adresse) {
	super(dateDepart, dateArrivee, prixHT);
	this.nomHotel = nomHotel;
	this.nbEtoiles = nbEtoiles;
	this.mesChambres = mesChambres;
	this.adresse = adresse;
}
protected Hotel(Date dateDepart, Date dateArrivee, double prixHT) {
	super(dateDepart, dateArrivee, prixHT); }
	
	//fin cost

	//getter and setter
	protected int getNbEtoiles() {
		return nbEtoiles;}
		protected void setNbEtoiles(int nbEtoiles) {
			this.nbEtoiles = nbEtoiles;
		}
		protected ArrayList<Chambre> getMesChambres() {
			return mesChambres;
		}
		protected void setMesChambres(ArrayList<Chambre> mesChambres) {
			this.mesChambres = mesChambres;
		}
		protected Adresse getAdresse() {
			return adresse;
		}
		protected void setAdresse(Adresse adresse) {
			this.adresse = adresse;



		}





	}