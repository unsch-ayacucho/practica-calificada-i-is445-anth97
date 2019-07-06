package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Docente;

@Repository("docenteDao")
public class DocenteDaoImpl extends DocenteDao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public List<Docente> listDocente() {
		return (List<Docente>) 
				entityManager.createQuery("from Docente",Docente.class)
				.getResultList();
	}
}
