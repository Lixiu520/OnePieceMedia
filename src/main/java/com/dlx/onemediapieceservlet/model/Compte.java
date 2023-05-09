package com.dlx.onemediapieceservlet.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Compte database table.
 * 
 */
@Entity
@NamedQuery(name="Compte.findAll", query="SELECT c FROM Compte c")
public class Compte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long compte;

	private boolean bani;

	private boolean efface;

	private String email;

	private String motDePasse;

	private String pseudo;

	private boolean signale;

	private boolean suppressionDonnee;

	private boolean valide;

	//bi-directional many-to-one association to Article
	@OneToMany(mappedBy="compteBean")
	private List<Article> articles;

	//bi-directional many-to-one association to TypeCompte
	@ManyToOne
	@JoinColumn(name="typeCompte")
	private TypeCompte typeCompteBean;

	public Compte() {
	}

	public long getCompte() {
		return this.compte;
	}

	public void setCompte(long compte) {
		this.compte = compte;
	}

	public boolean getBani() {
		return this.bani;
	}

	public void setBani(boolean bani) {
		this.bani = bani;
	}

	public boolean getEfface() {
		return this.efface;
	}

	public void setEfface(boolean efface) {
		this.efface = efface;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return this.motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getPseudo() {
		return this.pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public boolean getSignale() {
		return this.signale;
	}

	public void setSignale(boolean signale) {
		this.signale = signale;
	}

	public boolean getSuppressionDonnee() {
		return this.suppressionDonnee;
	}

	public void setSuppressionDonnee(boolean suppressionDonnee) {
		this.suppressionDonnee = suppressionDonnee;
	}

	public boolean getValide() {
		return this.valide;
	}

	public void setValide(boolean valide) {
		this.valide = valide;
	}

	/*public List<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Article addArticle(Article article) {
		getArticles().add(article);
		article.setCompteBean(this);

		return article;
	}
	public Article removeArticle(Article article) {
		getArticles().remove(article);
		article.setCompteBean(null);

		return article;
	}
*/

	public TypeCompte getTypeCompteBean() {
		return this.typeCompteBean;
	}

	public void setTypeCompteBean(TypeCompte typeCompteBean) {
		this.typeCompteBean = typeCompteBean;
	}

}