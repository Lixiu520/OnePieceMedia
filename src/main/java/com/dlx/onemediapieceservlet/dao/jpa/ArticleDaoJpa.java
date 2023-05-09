package com.dlx.onemediapieceservlet.dao.jpa;

import com.dlx.onemediapieceservlet.dao.AbstractDao;
import com.dlx.onemediapieceservlet.dao.Dao;
import com.dlx.onemediapieceservlet.model.Article;

public class ArticleDaoJpa extends AbstractDao<Article> implements Dao<Article> {

	private static final  Dao<Article>  INSTANCE = new ArticleDaoJpa();

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Article";
	}

	@Override
	public Class<Article> getClassName() {
		return Article.class;
	}

	public static Dao<Article> getInstance() {
		return INSTANCE;
	}



}
