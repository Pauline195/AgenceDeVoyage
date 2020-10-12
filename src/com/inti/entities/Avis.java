package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Avis implements Serializable{

	long idAvis;
	String commentaire;
	@ManyToOne
	private Set<Hotel> hotel=new HashSet<>();
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  static  final  long serialVersionUID = 1L;

	public Avis(long idAvis, String commentaire) {
		super();
		this.idAvis = idAvis;
		this.commentaire = commentaire;
	}

	public long getIdAvis() {
		return idAvis;
	}

	public void setIdAvis(long idAvis) {
		this.idAvis = idAvis;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	
}
