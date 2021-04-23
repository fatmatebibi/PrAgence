package com.Bovoyage.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.Bovoyage.domaine.Voyage;


public class AgenceVoyageService {
	
	private Set<Voyage> voyages = new HashSet<Voyage>();
	private String nom;

  /**
   * Default constructor
 * @return 
   */
	public  AgenceVoyageService(String nom, Set<Voyage> voyages) {
		this.setNom(nom);
		this.voyages = voyages;
	}

	
	
	// get set
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
  
	public boolean reserver(Voyage Voyage) {
	   return true;
	}

	public Set<Voyage> getOffres() {
	    return this.voyages;
	}
	
	public void setVoyage(Voyage voyage) {
		this.voyages.add(voyage);
	}
	
	public void AgenceVoyageService(HashSet<Voyage> voyages) {
		this.voyages.addAll(voyages);
	}


}
