package com.vinay.prg3.optionals;

import java.util.Optional;

public class VinayPrg2 {

	public static void main(String[] args) {
		// Optional :: Default/Absent values and respective actions

		// A typical pattern in programming is to return a default value if we
		// determine that the result of an operation is null. In general, we
		// can use the ternary operator; but with Optionals, we can write the
		// code as below:
		Optional<Student> optional = Optional.ofNullable(getStudentData(null));
		// Optional<Student> optional =
		// Optional.ofNullable(getStudentData("Vinay"));
		// optional.ifPresent((data) -> System.out.println(data.getName()));

		// Now check optional; if value is present then return it,
		// else create a new Student object and return it
		Student studentObj1 = optional.orElse(new Student("Vipin Chauhan"));
		System.out.println("Final Value :: " + studentObj1.getName());

		// OR you can throw an exception as well
		// Student studentObj2 =
		// optional.orElseThrow(IllegalStateException::new);

	}

	public static Student getStudentData(String pName) {
		Student stud = null;
		Optional<String> value = Optional.ofNullable(pName);
		if (value.isPresent()) {
			stud = new Student(value.get());
		}
		return stud;
	}
}

class Student {

	String name;

	public Student() {

	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}