package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Destination  implements Serializable{


	long idDestination;
	long longitude;
	long latitude;

	@OneToMany(mappedBy="hotel")
	private Set<Hotel> hotel=new HashSet<>();
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  static  final  long serialVersionUID = 1L;

	public Destination(long idDestination, long longitude, long latitude) {
		super();
		this.idDestination = idDestination;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public long getIdDestination() {
		return idDestination;
	}

	public void setIdDestination(long idDestination) {
		this.idDestination = idDestination;
	}

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}
	
	
	
}
