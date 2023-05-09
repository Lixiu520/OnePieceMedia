package com.dlx.onemediapieceservlet.service;

import com.dlx.onemediapieceservlet.dao.Dao;
import com.dlx.onemediapieceservlet.model.Article;

public interface ArticleService extends Dao<Article>{
	
	public Article create (String titre, String contenu, boolean publique);
	
	public Dao<Article> getDao();
	
	

}
