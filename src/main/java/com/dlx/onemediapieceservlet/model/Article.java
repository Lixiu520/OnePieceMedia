package com.dlx.onemediapieceservlet.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Article database table.
 * 
 */
@Entity
@NamedQuery(name="Article.findAll", query="SELECT a FROM Article a")
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long article;

	private String contenu;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date= new Date();

	private boolean modere;

	@Column(name="public")
	private boolean public_;

	private String titre;

	//bi-directional many-to-one association to Compte
	@ManyToOne
	@JoinColumn(name="compte")
	private Compte compteBean;

	//bi-directional many-to-one association to Commentaire
	/*@OneToMany(mappedBy="article")
	private List<Commentaire> commentaires;*/

	public Article() {
	}

	public long getArticle() {
		return this.article;
	}

	public void setArticle(long article) {
		this.article = article;
	}

	public String getContenu() {
		return this.contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean getModere() {
		return this.modere;
	}

	public void setModere(boolean modere) {
		this.modere = modere;
	}

	public boolean getPublic_() {
		return this.public_;
	}

	public void setPublic_(boolean public_) {
		this.public_ = public_;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Compte getCompteBean() {
		return this.compteBean;
	}

	public void setCompteBean(Compte compteBean) {
		this.compteBean = compteBean;
	}

/*	public List<Commentaire> getCommentaires() {
		return this.commentaires;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	public Commentaire addCommentaire(Commentaire commentaire) {
		getCommentaires().add(commentaire);
		commentaire.setArticle(this);

		return commentaire;
	}

	public Commentaire removeCommentaire(Commentaire commentaire) {
		getCommentaires().remove(commentaire);
		commentaire.setArticle(null);

		return commentaire;
	}*/
	

}