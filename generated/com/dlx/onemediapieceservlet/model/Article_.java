package com.dlx.onemediapieceservlet.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2023-05-08T01:03:53.400+0200")
@StaticMetamodel(Article.class)
public class Article_ {
	public static volatile SingularAttribute<Article, Long> article;
	public static volatile SingularAttribute<Article, String> contenu;
	public static volatile SingularAttribute<Article, Date> date;
	public static volatile SingularAttribute<Article, Boolean> modere;
	public static volatile SingularAttribute<Article, Boolean> public_;
	public static volatile SingularAttribute<Article, String> titre;
	public static volatile SingularAttribute<Article, Compte> compteBean;
}
