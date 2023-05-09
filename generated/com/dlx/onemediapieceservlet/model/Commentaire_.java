package com.dlx.onemediapieceservlet.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2023-05-07T23:02:49.566+0200")
@StaticMetamodel(Commentaire.class)
public class Commentaire_ {
	public static volatile SingularAttribute<Commentaire, Long> commentaire;
	public static volatile SingularAttribute<Commentaire, String> contenu;
	public static volatile SingularAttribute<Commentaire, Date> date;
	public static volatile SingularAttribute<Commentaire, Boolean> modere;
	public static volatile SingularAttribute<Commentaire, Boolean> public_;
	public static volatile SingularAttribute<Commentaire, Article> article;
}
