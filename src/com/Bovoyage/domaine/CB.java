package com.Bovoyage.domaine;

import java.time.LocalDateTime;


public class CB extends MoyenPaiement {
	private int numeroCB;
	private LocalDateTime dateExpiration;

//Constructeur 
	
	protected CB() {
		super();
	}
	
	
	protected CB(int numeroCB, LocalDateTime string) {
		super();
		this.numeroCB = numeroCB;
		this.dateExpiration = string;
	}

//toString 
	@Override
	public String toString() {
		return "CB [numeroCB=" + numeroCB + ", dateExpiration=" + dateExpiration + "]";
	}

	
	//getter and setter 
	protected int getNumeroCB() {
		return numeroCB;
	}
	public void setNumeroCB(int numeroCB) {
		this.numeroCB = numeroCB;
	}
	public LocalDateTime getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(LocalDateTime dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public void effectuerpaiement() {

	System.out.println("paiement par carte") ; 


} }