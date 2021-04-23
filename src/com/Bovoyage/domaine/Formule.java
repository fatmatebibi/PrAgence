package com.Bovoyage.domaine;

import java.util.ArrayList;



    public class Formule {
	private double prixTotal;
	public ArrayList<Prestation> mesPrestation;



	//constructeur
	protected Formule(double prixTotal) {
		
		this.prixTotal = prixTotal;
		
		//getterandsetter
		
	}

	public double getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}
	protected ArrayList<Prestation> getMesPrestation() {
		return mesPrestation;
	}
	protected void setMesPrestation(ArrayList<Prestation> mesPrestation) {
		this.mesPrestation = mesPrestation;
	}

	//getterandsetter

}