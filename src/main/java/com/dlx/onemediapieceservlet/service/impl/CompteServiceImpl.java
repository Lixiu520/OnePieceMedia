package com.dlx.onemediapieceservlet.service.impl;

import com.dlx.onemediapieceservlet.dao.Dao;
import com.dlx.onemediapieceservlet.dao.jpa.CompteDaoJpa;
import com.dlx.onemediapieceservlet.model.TypeCompte;
import com.dlx.onemediapieceservlet.model.Compte;
import com.dlx.onemediapieceservlet.service.AbstractService;
import com.dlx.onemediapieceservlet.service.CompteService;
import com.dlx.onemediapieceservlet.service.Service;

public class CompteServiceImpl extends AbstractService<Compte> implements Dao<Compte>, Service<Compte> , CompteService {

		public static final CompteService  INSTANCE = new CompteServiceImpl();
	
	@Override
	public Compte create(String pseudo, String email, String mdp) {
		
		Compte ct = new Compte();
		
		ct.setBani(false);
		
		ct.setEfface(false);
		
		ct.setEmail(email);
		
		ct.setMotDePasse(mdp);
		
		ct.setPseudo(pseudo);
		
		ct.setSignale(false);
		
		ct.setSuppressionDonnee(false);
		
		
		TypeCompte tc = new TypeCompte();
		
		tc.setLabel("Redacteur");
		
		tc.setTypeCompte(3L);
		
		
		ct.setTypeCompteBean(tc);
		
		ct.setValide(false);
		
		ct = getDao().save(ct);
		
		return ct;
	}

	@Override
	public Dao<Compte> getDao() {
		return CompteDaoJpa.getInstance();
	}

	@Override
	public String getTableName() {
		return "Compte";
	}

	@Override
	public Class<Compte> getClassName() {
		return Compte.class;
	}



}
