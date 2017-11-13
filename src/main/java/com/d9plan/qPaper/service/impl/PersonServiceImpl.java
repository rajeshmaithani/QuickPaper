package com.d9plan.qPaper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.d9plan.qPaper.service.PersonService;
import com.d9plan.qPaper.dao.PersonDao;
import com.d9plan.qPaper.model.Persons;

@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao personDao;
	
	public void setDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public void save(Persons person){
		personDao.save(person);
	}

	public void update(Persons person){
		personDao.update(person);
	}

	public void delete(Persons person){
		personDao.delete(person);
	}

	public Persons findById(Integer Id){
		return personDao.findById(Id);
	}
	
}


