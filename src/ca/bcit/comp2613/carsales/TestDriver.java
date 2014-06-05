package ca.bcit.comp2613.carsales;

import java.util.ArrayList;
import java.util.Arrays;

import ca.bcit.comp2613.carsales.model.Employee;
import ca.bcit.comp2613.a00703441.util.EmployeeUtil;

import ca.bcit.comp2613.carsales.model.Customer;
import ca.bcit.comp2613.a00703441.util.CustomerUtil;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = EmployeeUtil.createEmployees();
		EmployeeUtil.printEmployees(employees);
		System.out.println("------------------");
		ArrayList<Employee> employeesByLastName = EmployeeUtil.searchEmployeesByLastName(employees, "txet");
		EmployeeUtil.printEmployees(employeesByLastName);
		
		System.out.println("------------------");
		ArrayList<Employee> employeesByLastNameRegex = EmployeeUtil.searchEmployeesByLastNameRegex(employees, "ti.*");
		EmployeeUtil.printEmployees(employeesByLastNameRegex);
		
		System.out.println("testing");
		
		System.out.println(Customer.VAN);
		System.out.println(Customer.OUTSIDEVAN);

	}

}
