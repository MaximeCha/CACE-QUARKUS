package cace.domain.entity;

import java.util.List;

public class ConfigurationProjet {

	private String id;
	private String nomProjet;
	private List<Composant> listeComposants;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomProjet() {
		return nomProjet;
	}

	public void setNomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}

	public List<Composant> getListeComposants() {
		return listeComposants;
	}

	public void setListeComposants(List<Composant> listeComposants) {
		this.listeComposants = listeComposants;
	}

}
