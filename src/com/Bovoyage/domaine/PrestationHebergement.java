package com.Bovoyage.domaine;

public class PrestationHebergement {
	private Pension pension;
    private double prix;
    
    //const
    protected PrestationHebergement() {
		super();
	
	}
	protected PrestationHebergement(Pension pension, double prix) {
		super();
		this.pension = pension;
		this.prix = prix;
	}
	
	
	
	// getter setter
	protected Pension getPension() {
		return pension;
	}
	protected void setPension(Pension pension) {
		this.pension = pension;
	}
	protected double getPrix() {
		return prix;
	}
	protected void setPrix(double prix) {
		this.prix = prix;
	}

  
}