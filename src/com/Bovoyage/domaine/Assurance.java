package com.Bovoyage.domaine;


public class Assurance {
	
	  public double prixAssurance;
	    public Contrat  contrat;
	    public Reservation  reservation;
	    
	//Constructor

  
   
	protected Assurance(double prixAssurance, Contrat contrat, Reservation reservation) {
		super();
		this.prixAssurance = prixAssurance;
		this.contrat = contrat;
		this.reservation = reservation;
	}
//tt est public pas de getter et setter

	public double getPrixAssurance() {
		return prixAssurance;
	}

	public void setPrixAssurance(double prixAssurance) {
		this.prixAssurance = prixAssurance;
	}

	public Contrat getMyContrat() {
		return contrat;
	}

	public void setMyContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public Reservation getMyReservation() {
		return reservation;
	}

	public void setMyReservation(Reservation myReservation) {
		this.reservation = myReservation;
	}


    
    
    
    
    
}