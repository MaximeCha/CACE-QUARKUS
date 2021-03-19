package cace.domain.dictionnaires;

import javax.json.bind.annotation.JsonbCreator;

public enum PrixType {

	EURO("Euro"), DOLLAR("Dollar");

	private String value;

	PrixType(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

	@JsonbCreator
	public static PrixType create(String string) {
		PrixType[] states = PrixType.values();
		for (PrixType state : states) {
			if (state.toString().equalsIgnoreCase(string)) {
				return state;
			}
		}
		return null;
	}

}
