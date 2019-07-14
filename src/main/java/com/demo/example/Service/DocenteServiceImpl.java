/**
 * 
 */
package com.demo.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.example.Dao.DocenteDao;
import com.example.demo.Entities.Docente;
/**
 * @author Tezca
 *
 */
@Service("docenteService")
@Transactional
public class DocenteServiceImpl implements DocenteService {

	
	@Autowired
	private DocenteDao docenteDao;
	
	@Override	
	public List<Docente> retornar() {
		// TODO Auto-generated method stub
		return docenteDao.retornar();
	}

}

