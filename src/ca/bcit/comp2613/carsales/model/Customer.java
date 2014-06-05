package ca.bcit.comp2613.carsales.model;

public enum Customer {
	VAN, OUTSIDEVAN;
	
	private String id;
	private String firstName;
	private String lastName;
	private Integer purchasePrice;

	Customer() {
	}

	Customer(String id, String firstName, String lastName,
			Integer purchasePrice) {
		//super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.purchasePrice = purchasePrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Integer purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	@Override
	public String toString() {
		return "id = " + id + ", firstName = " + firstName + ", lastName = "
				+ lastName + ", purchasePrice = " + purchasePrice;
	}
	
}
