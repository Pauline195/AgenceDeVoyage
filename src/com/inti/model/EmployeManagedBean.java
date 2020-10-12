package com.inti.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.inti.entities.Departement;
import com.inti.entities.Employe;
import com.inti.service.impl.DepartementService;
import com.inti.service.impl.EmployeService;
import com.inti.service.interfaces.IDepartementService;
import com.inti.service.interfaces.IEmployeService;

@ManagedBean
@SessionScoped
public class EmployeManagedBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Employe emp=new Employe();
	private List<Employe> employes=new ArrayList<Employe>();
	private List<Departement> departements=new ArrayList<Departement>();
	IEmployeService employeService=new EmployeService();
	IDepartementService departementService=new DepartementService();
	
	public EmployeManagedBean() {
	}

	public Employe getEmp() {
		return emp;
	}

	public void setEmp(Employe emp) {
		this.emp = emp;
	}

	public List<Employe> getEmployes() {
		employes =employeService.findAll(Employe.class);
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	
	public List<Departement> getDepartements() {
		departements = departementService.findAll(Departement.class);
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}

	@PostConstruct
	private void init() {
		this.employes = employeService.findAll(Employe.class);
	}
	public void refresh() {
		init();
	}
	
	public void enregistrerEmploye() {
		try {
			employeService.save(this.emp);
			this.emp = new Employe();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void supprimerEmploye(Employe emp) {
		try {
			employeService.remove(emp);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public String edit(Employe emp) {
		this.emp =emp;
		return "update";
	}
	
	public String update() {
		try {
			employeService.update(emp);
			this.emp = new Employe();
			return "accueil?faces-redirect=true";
		}catch(Exception e) {
			return "update";
		}
	}
	
	

}
