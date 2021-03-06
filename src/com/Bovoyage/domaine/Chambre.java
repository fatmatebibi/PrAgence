package com.Bovoyage.domaine;

public class Chambre  {

    private String typeChambre;
    private double prixChambre;
    private PrestationHebergement prestation;
    
 // constructor
    
    protected Chambre(String typeChambre, double prixChambre, PrestationHebergement prestation) {
		super();
		this.typeChambre = typeChambre;
		this.prixChambre = prixChambre;
		this.prestation = prestation;
	}
    
    
    //geter and seter
	public String getTypeChambre() {
		return typeChambre;
	}
	
	public void setTypeChambre(String typeChambre) {
		this.typeChambre = typeChambre;
	}
	
	public double getPrixChambre() {
		return prixChambre;
	}
	
	public void setPrixChambre(double prixChambre) {
		this.prixChambre = prixChambre;
	}
	
	public PrestationHebergement getPrestation() {
		return prestation;
	}
	
	public void setPrestation(PrestationHebergement prestation) {
		this.prestation = prestation;
	}

	
	
	
}