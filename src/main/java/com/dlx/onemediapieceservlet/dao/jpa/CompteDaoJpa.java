package com.dlx.onemediapieceservlet.dao.jpa;


import com.dlx.onemediapieceservlet.dao.AbstractDao;
import com.dlx.onemediapieceservlet.dao.Dao;
import com.dlx.onemediapieceservlet.model.Compte;


public class CompteDaoJpa extends AbstractDao<Compte> implements Dao<Compte> {

	private static final  Dao<Compte>  INSTANCE = new CompteDaoJpa();
	
	@Override
	public String getTableName() {
		return "Compte";
	}

	@Override
	public Class<Compte> getClassName() {
		return Compte.class;
	}

	public static Dao<Compte> getInstance() {
		return INSTANCE;
	}

	
	
	
	
}
