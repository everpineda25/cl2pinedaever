package com.cibertec.edu.daw.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.daw.models.Personal;
import com.cibertec.edu.daw.repositories.PersonalDao;

@Service
public class PersonalServiceImpl implements PersonalService {
	
	@Autowired
	private PersonalDao personalRepository;
	
	@Override
	public List<Personal> getAllPersonales(){
		return this.personalRepository.findAll();
	}

}
