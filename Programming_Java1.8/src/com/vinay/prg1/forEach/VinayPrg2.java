package com.vinay.prg1.forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class VinayPrg2 {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "Vipin Chauhan"));
		studentList.add(new Student(2, "Vinay Chauhan"));
		studentList.add(new Student(3, "Ananya Chauhan"));

		studentList.forEach(new Consumer<Student>() {

			@Override
			public void accept(Student stud) {
				System.out.println(stud.getRollNo() + " :: " + stud.getName());
			}

		});

		// The number of lines might increase but forEach method helps in having
		// the logic for iteration and business logic at separate place
		// resulting in higher separation of concern and cleaner code.

	}

}

class Student {
	private int rollNo;
	private String name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}