package com.inti.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.inti.entities.Destination;
import com.inti.entities.Hotel;
import com.inti.service.impl.DestinationService;
import com.inti.service.impl.HotelService;
import com.inti.service.interfaces.IDestinationService;
import com.inti.service.interfaces.IHotelService;



@ManagedBean
@SessionScoped
public class HotelManagedBean  implements Serializable {

	private static final long serialVersionUID = 1L;
	private Hotel hot=new Hotel();
	private List<Hotel> hotels=new ArrayList<Hotel>();
	private List<Destination> destinations=new ArrayList<Destination>();
	IHotelService hotelService=new HotelService();
	IDestinationService destinationService=new DestinationService();
	
}
