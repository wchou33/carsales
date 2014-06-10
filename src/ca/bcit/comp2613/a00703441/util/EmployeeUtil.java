package ca.bcit.comp2613.a00703441.util;

import java.util.ArrayList;

import ca.bcit.comp2613.carsales.model.Gender;
import ca.bcit.comp2613.carsales.model.Location;
import ca.bcit.comp2613.carsales.model.Employee;



import java.util.Random;
import java.util.UUID;

public class EmployeeUtil {

	public static String LOREM_IPSUM = "John Bruce Joe Matt Kim Bob Mary Kit David"
			+ "Devin Cheryl Sherry Anita Leslie Anne Ann Raj Adam Ada Carol Sam"
			+ "Deb May April Dan Brian Cam Al Fred JJ Karl Carl Mag Vinny Mike"
			+ "Aman Tracy Laura James Jim Jamie Jo Pat Patty Max Marv Lenny Denny"
			+ "Ross Rose Kate Kelly Nelly Judy Bryan Brad Bret Brett Tim Ben Eva"
			+ "Steve AJ BJ Ed Ted Lauren Laura Paul Paula Conan Jay Jimmy Craig"
			+ "Greg Maggie Zoe Joey Zoey Eve Dick Rick Hugh Liz Lisa Elisa Eliza"
			+ "Norm Nick Nicky Ricky Lizzy Ali Moe Mo Wayne Wes Wendy Walter Mack"
			+ "Jack Jacky Ellen Keith Julia Julie Lily Lila Ray Robby Robbie Jackie"
			+ "Xavier Halle Pete Peter Hilda Hilde Tom Tommy Ralph Tiger Jean Marc";

	public static ArrayList<Employee> createEmployees() {
		ArrayList<Employee> retval = new ArrayList<>();
		String[] strs = LOREM_IPSUM.split("\\s");
		Random random = new Random();

		// create loop with random
		for (int i = 0; i < 100; i++) {
			Employee employee = new Employee();
			employee.setId(Integer.toString(i));
			employee.setFirstName(strs[i].toUpperCase());
			employee.setLastName(new StringBuilder(strs[i]).reverse().toString());
			employee.setGender(Gender.values()[random.nextInt(Gender.values().length)]);
			employee.setLocation(Location.values()[random.nextInt(Location.values().length)]);
			retval.add(employee);
		}
		return retval;
	}

	public static void printEmployees(ArrayList<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public static ArrayList<Employee> searchEmployeesByFirstName(
			ArrayList<Employee> employees, String firstName) {
		ArrayList<Employee> retval = new ArrayList<>();
		for (Employee employee : employees) {
			if (employee.getFirstName().equals(firstName)) {
				retval.add(employee);
			}
		}
		return retval;
	}
	
	public static ArrayList<Employee> searchEmployeesByFirstNameRegex(ArrayList<Employee> employees, String regex) {
		ArrayList<Employee> retval = new ArrayList<>();
		for (Employee employee : employees) {
			if (employee.getFirstName().matches(regex)) {
				System.out.println(employee);
			}
		}
		return retval;
	}

}
