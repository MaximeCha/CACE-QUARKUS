package cace.domain.entity;


public class Demande {

	private String id;
    private ConfigurationProjet configurationProjet;
    private String nomDemande;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ConfigurationProjet getConfigurationProjet() {
		return configurationProjet;
	}
	public void setConfigurationProjet(ConfigurationProjet configurationProjet) {
		this.configurationProjet = configurationProjet;
	}
	public String getNomDemande() {
		return nomDemande;
	}
	public void setNomDemande(String nomDemande) {
		this.nomDemande = nomDemande;
	}   
    
    
}
