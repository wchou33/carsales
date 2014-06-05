package ca.bcit.comp2613.a00703441.util;

import java.util.ArrayList;

import ca.bcit.comp2613.carsales.model.Customer;
import ca.bcit.comp2613.carsales.model.Employee;


import java.util.Random;
import java.util.UUID;

public class EmployeeUtil {

	public static String LOREM_IPSUM = "In publishing and graphic design, lorem ipsum is a placeholder text commonly used to "
			+ "demonstrate the graphic elements of a document or visual presentation. By replacing the distraction of meaningful "
			+ "content with filler text of scrambled Latin it allows viewers to focus on graphical elements such as font, typography, and layout"
			+ "The lorem ipsum text is typically a mangled section of De finibus bonorum et malorum, a 1st-century BC Latin text by Cicero, with words "
			+ "altered, added, and removed that make it nonsensical, improper Latin"
			+ "A variation of the common lorem ipsum text has been used during typesetting since the 1960s or "
			+ "earlier, when it was popularized by advertisements for Letraset transfer sheets. It was introduced "
			+ "to the Digital Age by Aldus Corporation in the mid-1980s, which employed it in graphics and word processing templates "
			+ "for its breakthrough desktop publishing program, PageMaker for the Apple Macintosh";

	public static ArrayList<Employee> createEmployees() {
		ArrayList<Employee> retval = new ArrayList<>();
		String[] strs = LOREM_IPSUM.split("\\s");

		for (int i = 0; i < 100; i++) {
			Employee employee = new Employee();
			employee.setId(Integer.toString(i));
			employee.setFirstName(strs[i].toUpperCase());
			employee.setLastName(new StringBuilder(strs[i]).reverse()
					.toString());
			if(i > 50) {
				employee.setCustomer(Customer.OUTSIDEVAN);
			}
			else {
			employee.setCustomer(Customer.VAN);
			}
			retval.add(employee);
		}
		return retval;
	}

	public static void printEmployees(ArrayList<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public static ArrayList<Employee> searchEmployeesByLastName(
			ArrayList<Employee> employees, String lastName) {
		ArrayList<Employee> retval = new ArrayList<>();
		for (Employee employee : employees) {
			if (employee.getLastName().equals(lastName)) {
				retval.add(employee);
			}
		}
		return retval;
	}
	
	public static ArrayList<Employee> searchEmployeesByLastNameRegex(ArrayList<Employee> employees, String regex) {
		ArrayList<Employee> retval = new ArrayList<>();
		for (Employee employee : employees) {
			if (employee.getLastName().matches(regex)) {
				System.out.println(employee);
			}
		}
		return retval;
	}

}
