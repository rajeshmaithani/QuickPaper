package com.d9plan.qPaper.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class DBHibernateDaoSupport extends HibernateDaoSupport{

	@Autowired
	public void anyMethodName(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}
}
