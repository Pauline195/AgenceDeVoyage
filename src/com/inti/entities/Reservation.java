package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


public class Reservation implements Serializable{
	
	long idVoyageur;
	Date dateReservation;
	int nbJours;

	@ManyToOne
	private Set<Voyageur> voyageur=new HashSet<>();
	@ManyToOne
	private Set<Hotel> hotel=new HashSet<>();
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  static  final  long serialVersionUID = 1L;

	public Reservation(long idVoyageur, Date dateReservation, int nbJours) {
		super();
		this.idVoyageur = idVoyageur;
		this.dateReservation = dateReservation;
		this.nbJours = nbJours;
	}

	public long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

	

}
