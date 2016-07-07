package com.vinay.prg1.forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class VinayPrg3 {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Vipin Chauhan"));
		empList.add(new Employee(102, "Ananya Chauhan"));
		empList.add(new Employee(103, "Vinay Chauhan"));

		empList.forEach(new Employee());

		// The number of lines might increase but forEach method helps in having
		// the logic for iteration and business logic at separate place
		// resulting in higher separation of concern and cleaner code.

	}
}

class Employee implements Consumer<Employee> {
	private int empId;
	private String empName;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public void accept(Employee emp) {
		System.out.println(emp.getEmpId() + " :: " + emp.getEmpName());

	}

}