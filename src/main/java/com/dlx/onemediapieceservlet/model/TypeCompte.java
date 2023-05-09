package com.dlx.onemediapieceservlet.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TypeCompte database table.
 * 
 */
@Entity
@NamedQuery(name="TypeCompte.findAll", query="SELECT t FROM TypeCompte t")
public class TypeCompte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long typeCompte;

	private String label;

	//bi-directional many-to-one association to Compte
	@OneToMany(mappedBy="typeCompteBean")
	private List<Compte> comptes;

	public TypeCompte() {
	}

	public long getTypeCompte() {
		return this.typeCompte;
	}

	public void setTypeCompte(long typeCompte) {
		this.typeCompte = typeCompte;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Compte> getComptes() {
		return this.comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	public Compte addCompte(Compte compte) {
		getComptes().add(compte);
		compte.setTypeCompteBean(this);

		return compte;
	}

	public Compte removeCompte(Compte compte) {
		getComptes().remove(compte);
		compte.setTypeCompteBean(null);

		return compte;
	}

}