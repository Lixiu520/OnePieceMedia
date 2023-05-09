package com.dlx.onemediapieceservlet.service;

import com.dlx.onemediapieceservlet.dao.Dao;
import com.dlx.onemediapieceservlet.model.Compte;

;
public interface CompteService extends Service<Compte>, Dao<Compte> {
	
	public Compte create(String pseudo, String email, String mdp);
	
	public Dao<Compte>  getDao();

}
