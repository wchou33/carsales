package ca.bcit.comp2613.carsales.model;

public enum Location {
	VAN("Vancouver"), MET("Metro Vancouver"), OUT("Outside Vancouver");

	private String description;

	Location(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
