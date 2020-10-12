package com.inti.service.impl;

import com.inti.dao.impl.DepartementDAO;
import com.inti.dao.interfaces.IDepartementDAO;
import com.inti.entities.Departement;
import com.inti.service.interfaces.IDepartementService;

public class DepartementService extends ManagerService<Departement> implements IDepartementService{
	private IDepartementDAO departementDAO = new DepartementDAO();
	@Override
	public Departement rechercherDepartementParNom(String nom) {
		return departementDAO.rechercherDepartementParNom(nom);
	}

}
