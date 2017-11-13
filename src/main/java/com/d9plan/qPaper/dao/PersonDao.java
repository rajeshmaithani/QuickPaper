package com.d9plan.qPaper.dao;

import com.d9plan.qPaper.model.*;

public interface PersonDao {
	void save(Persons person);
	void update(Persons person);
	void delete(Persons person);
	Persons findById(Integer id);
}
