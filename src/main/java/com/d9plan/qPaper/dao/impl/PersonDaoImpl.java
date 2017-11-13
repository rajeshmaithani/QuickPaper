package com.d9plan.qPaper.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.d9plan.qPaper.dao.PersonDao;
import com.d9plan.qPaper.model.Persons;
import com.d9plan.qPaper.util.DBHibernateDaoSupport;


@Repository("PersonDao")
public class PersonDaoImpl extends DBHibernateDaoSupport implements PersonDao{

	public void save(Persons person){
		getHibernateTemplate().save(person);
	}

	public void update(Persons person){
		getHibernateTemplate().update(person);
	}

	public void delete(Persons person){
		getHibernateTemplate().delete(person);
	}

	public Persons findById(Integer Id){
		List list = getHibernateTemplate().find(
                     "from dbo_persons where Id=?",Id
                );
		return (Persons)list.get(0);
	}
}

