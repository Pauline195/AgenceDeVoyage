package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hotel implements Serializable {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private static final long serialVersionUID = 1L;
	private Long idHotel;
	private String Nom;
	private int nbEtoile;
	@OneToMany(mappedBy="reservation")
	private Set<Reservation> reservations=new HashSet<>();
	@OneToMany(mappedBy="destination")
	private Set<Destination> destinations=new HashSet<>();
	@OneToMany(mappedBy="avis")
	private Set<Avis> avis=new HashSet<>();
	public Hotel(String nom, int nbEtoile, Set<Reservation> reservations, Set<Destination> destinations,
			Set<Avis> avis) {
		super();
		Nom = nom;
		this.nbEtoile = nbEtoile;
		this.reservations = reservations;
		this.destinations = destinations;
		this.avis = avis;
	}
	public Long getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public int getNbEtoile() {
		return nbEtoile;
	}
	public void setNbEtoile(int nbEtoile) {
		this.nbEtoile = nbEtoile;
	}
	public Set<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}
	public Set<Destination> getDestinations() {
		return destinations;
	}
	public void setDestinations(Set<Destination> destinations) {
		this.destinations = destinations;
	}
	public Set<Avis> getAvis() {
		return avis;
	}
	public void setAvis(Set<Avis> avis) {
		this.avis = avis;
	}
	
	
}
