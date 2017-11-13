package com.d9plan.qPaper.service;

import com.d9plan.qPaper.model.*;
public interface PersonService {

	void save(Persons person);
	void update(Persons person);
	void delete(Persons person);
	Persons findById(Integer id);
	
}
