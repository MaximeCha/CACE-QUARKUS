package cace.domain.dictionnaires;

public enum PrixType {

	EURO("Euro"), DOLLAR("Dollar");

	private String value;

	PrixType(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

}
