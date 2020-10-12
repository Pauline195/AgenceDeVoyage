package com.inti.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Yoyageur implements Serializable{
	
	long idVoyageur;
	String nom;
	String prenom;
	int age;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  static  final  long serialVersionUID = 1L;
	public Yoyageur(long idVoyageur, String nom, String prenom, int age) {
		super();
		this.idVoyageur = idVoyageur;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public long getIdVoyageur() {
		return idVoyageur;
	}
	public void setIdVoyageur(long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}
