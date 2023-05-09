package com.dlx.onemediapieceservlet.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Commentaire database table.
 * 
 */
@Entity
@NamedQuery(name="Commentaire.findAll", query="SELECT c FROM Commentaire c")
public class Commentaire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long commentaire;

	private String contenu;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	private boolean modere;

	@Column(name="public")
	private boolean public_;

	//bi-directional many-to-one association to Article
	@ManyToOne
	@JoinColumn(name="Article_article")
	private Article article;

	public Commentaire() {
	}

	public long getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(long commentaire) {
		this.commentaire = commentaire;
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

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

}