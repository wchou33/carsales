package ca.bcit.comp2613.carsales.model;

public class Employee {
	private String id;
	private String firstName;
	private String lastName;
	private Integer carsSold;

	public Employee() {
	}

	public Employee(String id, String firstName, String lastName,
			Integer carsSold) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
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

	@Override
	public String toString() {
		return "id = " + id + ", firstName = " + firstName + ", lastName = "
				+ lastName + ", carsSold = " + carsSold;
	}

}
