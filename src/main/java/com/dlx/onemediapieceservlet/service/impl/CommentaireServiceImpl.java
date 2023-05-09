package com.dlx.onemediapieceservlet.service.impl;

import java.util.Date;

import com.dlx.onemediapieceservlet.dao.Dao;
import com.dlx.onemediapieceservlet.dao.jpa.CommentaireDaoJpa;
import com.dlx.onemediapieceservlet.model.Article;
import com.dlx.onemediapieceservlet.model.Commentaire;
import com.dlx.onemediapieceservlet.service.AbstractService;
import com.dlx.onemediapieceservlet.service.CommentaireService;

public class CommentaireServiceImpl extends AbstractService<Commentaire> implements Dao<Commentaire>, CommentaireService{

	
	@Override
	public Commentaire create(String contenu, boolean publique,Date date,Article art) {
		
		Commentaire ct = new Commentaire();
		
		ct.setContenu(contenu);
		
		ct.setDate(date);
		
		ct.setArticle(art);
		
		ct.setModere(publique);
		
		ct.setPublic_(publique);
		
		ct = getDao().save(ct);
		
		return null;
	}

	@Override
	public Dao<Commentaire> getDao() {
		return CommentaireDaoJpa.getInstance();
	}

	@Override
	public String getTableName() {
		return "Commentaire";
	}

	@Override
	public Class<Commentaire> getClassName() {
		return Commentaire.class;
	}

	
	
	

}
