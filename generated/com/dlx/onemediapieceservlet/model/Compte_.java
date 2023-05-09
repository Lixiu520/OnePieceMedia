package com.dlx.onemediapieceservlet.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2023-05-07T23:02:49.566+0200")
@StaticMetamodel(Compte.class)
public class Compte_ {
	public static volatile SingularAttribute<Compte, Long> compte;
	public static volatile SingularAttribute<Compte, Boolean> bani;
	public static volatile SingularAttribute<Compte, Boolean> efface;
	public static volatile SingularAttribute<Compte, String> email;
	public static volatile SingularAttribute<Compte, String> motDePasse;
	public static volatile SingularAttribute<Compte, String> pseudo;
	public static volatile SingularAttribute<Compte, Boolean> signale;
	public static volatile SingularAttribute<Compte, Boolean> suppressionDonnee;
	public static volatile SingularAttribute<Compte, Boolean> valide;
	public static volatile ListAttribute<Compte, Article> articles;
	public static volatile SingularAttribute<Compte, TypeCompte> typeCompteBean;
}
