package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.DocenteDao;
import com.example.demo.entities.Docente;

@Repository("docenteService")
@Transactional
public class DocenteServiceImpl extends DocenteService {
	
	@Autowired
	private DocenteDao docenteDao;
	
	public List<Docente> listDocente() {
		return this.docenteDao.listDocente();
	}
}
