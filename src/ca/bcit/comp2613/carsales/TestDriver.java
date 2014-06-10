package ca.bcit.comp2613.carsales;

import java.util.ArrayList;
import java.util.Random;

import ca.bcit.comp2613.carsales.model.*;
import ca.bcit.comp2613.a00703441.util.*;

//import ca.bcit.comp2613.carsales.model.Customer;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = EmployeeUtil.createEmployees();
		EmployeeUtil.printEmployees(employees);
		System.out.println("------------------");
		ArrayList<Employee> employeesByFirstName = EmployeeUtil.searchEmployeesByFirstName(employees, "ED");
		EmployeeUtil.printEmployees(employeesByFirstName);
		
		System.out.println("------------------");
		ArrayList<Employee> employeesByFirstNameRegex = EmployeeUtil.searchEmployeesByFirstNameRegex(employees, "JU.*");
		EmployeeUtil.printEmployees(employeesByFirstNameRegex);
		
		System.out.println("testing");
		
		//System.out.println(Customer.VAN);
		//System.out.println(Customer.OUTSIDEVAN);

	}

}
