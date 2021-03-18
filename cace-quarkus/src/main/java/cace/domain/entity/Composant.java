package cace.domain.entity;


import cace.domain.dictionnaires.ComposantType;
import cace.domain.dictionnaires.PrixType;

public class Composant {


	private String id;
	private String composantNom;
	private ComposantType composantType;
	private Float prixValeur;
	private PrixType prixType;

	public Float getPrixValeur() {
		return prixValeur;
	}

	public void setPrixValeur(Float prixValeur) {
		this.prixValeur = prixValeur;
	}

	public PrixType getPrixType() {
		return prixType;
	}

	public void setPrixType(PrixType prixType) {
		this.prixType = prixType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComposantNom() {
		return composantNom;
	}

	public void setComposantNom(String composantNom) {
		this.composantNom = composantNom;
	}

	public ComposantType getComposantType() {
		return composantType;
	}

	public void setComposantType(ComposantType composantEcoType) {
		this.composantType = composantEcoType;
	}

}
