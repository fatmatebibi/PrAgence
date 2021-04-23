package com.Bovoyage.domaine;


public class Facture {

    public Client client;
    public Reservation reservation;
    
    
    //constructeur
	protected Facture(Client client, Reservation reservation) {
		super();
		this.client = client;
		this.reservation = reservation;
	}

    
    
    
    
}