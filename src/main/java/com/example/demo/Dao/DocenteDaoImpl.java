/**
 * 
 */
package com.example.demo.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Entities.Docente;

/**
 * @author Tezca
 *
 */
@Repository("docenteDao")
@Transactional
public class DocenteDaoImpl implements DocenteDao{
	
	@PersistenceContext
	private EntityManager entityManager;	 
	
	@Override
	public List<Docente> retornar() {
		return (List<Docente>)
			entityManager.createQuery("Select a from Docente a", Docente.class).getResultList();
	}
}
