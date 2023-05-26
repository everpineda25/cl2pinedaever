package com.cibertec.edu.daw.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.edu.daw.models.Personal;

@Repository
public interface PersonalDao extends CrudRepository <Personal, Long>{
	
	public List<Personal> findAll();

}
