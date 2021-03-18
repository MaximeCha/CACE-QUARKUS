package cace.domain.dictionnaires;

public enum ComposantType {

	ORDINATEUR("Ordinateur"), PORTABLE("Portable"), SERVEUR("Serveur");

	private String value;

	ComposantType(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

}
