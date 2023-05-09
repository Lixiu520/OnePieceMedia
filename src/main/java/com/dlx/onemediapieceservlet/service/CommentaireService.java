package com.dlx.onemediapieceservlet.service;

import java.util.Date;

import com.dlx.onemediapieceservlet.dao.Dao;
import com.dlx.onemediapieceservlet.model.Article;
import com.dlx.onemediapieceservlet.model.Commentaire;

public interface CommentaireService extends Dao<Commentaire>, Service<Commentaire> {
	
	public Commentaire create(String contenu, boolean publique,Date date, Article art);

	public Dao<Commentaire> getDao();
}
