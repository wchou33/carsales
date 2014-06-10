package ca.bcit.comp2613.carsales.model;

public class Customer {
	
	private String id;
	private String firstName;
	private String lastName;
	private Gender gender;
	private Location location;
	private Integer purchasePrice;

	public Customer() {
	}

	public Customer(String id, String firstName, String lastName, Gender gender,
			Location location, Integer purchasePrice) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.location = location;
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
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}

	public Integer getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Integer purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	@Override
	public String toString() {
		return "id = " + id + ", firstName = " + firstName + ", lastName = " + lastName
				+ ", location = " + location + " gender = " + gender + " purchasePrice = " + purchasePrice;
	}
	
}
