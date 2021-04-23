package com.Bovoyage.domaine;


public class Client extends Personne {

	com.Bovoyage.domaine.MoyenPaiement moyenPaiement ;
	private  String user ="client";
	private  String password ="abcd";	
	private Facture facture;
	private Reservation reservation;

	//Constructor
	public Client(Reservation reservation, Facture facture, MoyenPaiement moyenPaiement ,String user , String password) {
		super();


		this.setReservation(reservation);
		this.setFacture(facture);
		this.moyenPaiement = moyenPaiement;}


	//meth auth

	public boolean authentification (String user , String Password) throws Exception {

		System.out.println(user.equals(this.user));
		if(user.equals(this.user)&& password.equals(this.password)) return true;

		else throw new Exception ("");
	}
	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}}