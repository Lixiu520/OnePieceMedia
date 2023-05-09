package com.dlx.onemediapieceservlet.service.impl;

import com.dlx.onemediapieceservlet.dao.Dao;
import com.dlx.onemediapieceservlet.dao.jpa.ArticleDaoJpa;
import com.dlx.onemediapieceservlet.model.Article;
import com.dlx.onemediapieceservlet.service.AbstractService;
import com.dlx.onemediapieceservlet.service.ArticleService;
import com.dlx.onemediapieceservlet.model.Compte;
import java.util.Date;

public class ArticleServiceImpl extends AbstractService<Article> implements  ArticleService ,Dao<Article> {

	private static final ArticleService INSTANCE = new ArticleServiceImpl();

	@Override
	public Article create(String titre, String contenu, boolean publique) {
		
		Article art = new Article();
		
		Compte ct = new Compte();
		
		art.setCompteBean(ct);
		
		art.setContenu(contenu);
		
		Date dt = new Date();
		
		art.setDate(dt);
		
		art.setModere(false);
		
		art.setPublic_(publique);
		
		art.setTitre(titre);
		
		art = getDao().save(art);

		return art;
	}

	


	public static ArticleService getInstance() {
		return INSTANCE;
	}



	@Override
	public Dao<Article> getDao() {
		return ArticleDaoJpa.getInstance();
	}




	@Override
	public String getTableName() {
		return "Article";
	}




	@Override
	public Class<Article> getClassName() {
		return Article.class;
	}




	




	
	

	
	
}
