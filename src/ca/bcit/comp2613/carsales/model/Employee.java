package ca.bcit.comp2613.carsales.model;

public class Employee {

	private String id;
	private String firstName;
	private String lastName;
	private Gender gender;
	private Location location;
	private Integer carsSold;
	private Customer customer;
	
	
	public Employee() {
	}

	public Employee(String id, String firstName, String lastName, Gender gender,
			Location location, Integer carsSold) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.location = location;
		this.carsSold = carsSold;
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

	public Integer getCarsSold() {
		return carsSold;
	}

	public void setCarsSold(Integer carsSold) {
		this.carsSold = carsSold;
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
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "id = " + id + ", firstName = " + firstName + ", lastName = " + lastName 
				+ ", location = " + location + " gender = " + gender + ", carsSold = " + carsSold;
	}

}
