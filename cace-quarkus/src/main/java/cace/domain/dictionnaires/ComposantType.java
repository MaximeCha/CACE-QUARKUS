package cace.domain.dictionnaires;

import javax.json.bind.annotation.JsonbCreator;

public enum ComposantType {

	ORDINATEUR("Ordinateur"), PORTABLE("Portable"), SERVEUR("Serveur");

	private String value;

	ComposantType(String value) {
		this.value = value;
	}


	public String toString() { 
		return value;
	}

	@JsonbCreator
	public static ComposantType create(String val) {
		ComposantType[] states = ComposantType.values();
		for (ComposantType state : states) {
			if (state.toString().equalsIgnoreCase(val)) {
				return state;
			}
		}
		return null;
	}
  }

