package com.dlx.onemediapieceservlet.dao.jpa;


import com.dlx.onemediapieceservlet.dao.AbstractDao;
import com.dlx.onemediapieceservlet.dao.Dao;
import com.dlx.onemediapieceservlet.model.Commentaire;

public class CommentaireDaoJpa extends AbstractDao<Commentaire> implements Dao<Commentaire> {

	private static final  Dao<Commentaire>  INSTANCE = new CommentaireDaoJpa();
	
	@Override
	public String getTableName() {
		return "Commentaire";
	}

	@Override
	public Class<Commentaire> getClassName() {
		return Commentaire.class;
	}

	public static Dao<Commentaire> getInstance() {
		return INSTANCE;
	}

	
	
	

}
