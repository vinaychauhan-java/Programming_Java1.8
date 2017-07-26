package com.vinay.prg6.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 
 * In mathematics, a predicate is commonly understood to be a Boolean-valued
 * function P : X ? {true, false}, called the predicate on X. Informally, a
 * predicate is a statement that may be true or false depending on the values of
 * its variables. It can be thought of as an operator or function that returns a
 * value that is either true or false.
 *
 * In java 8, Predicate is a functional interface and can therefore be used as
 * the assignment target for a lambda expression or method reference. So, where
 * you think, you can use these true/false returning functions in day to day
 * programming? I will say you can use them anywhere where you need to evaluate
 * a condition on group/collection of similar objects such that evaluation can
 * result either in true or false e.g. Find all student having marks greater
 * than 80
 *
 * Predicate is functional interface. It mean we can pass lambda expressions
 * wherever predicate is expected. For example one such method is filter()
 * method from Stream interface.
 */

/**
 * Returns a stream (a mechanism to create a sequence of elements supporting
 * sequential and parallel aggregate operations i.e. means you can anytime
 * collect and perform some operation of all elements present in Stream in one
 * call.) consisting of the elements of this stream that match the given
 * predicate.
 *
 * @param predicate
 *            a non-interfering stateless predicate to apply to each element to
 *            determine if it should be included in the new returned stream.
 * @return the new stream Stream<T> filter(Predicate<? super T> predicate);
 */

public class VinayPrg1 {
	public static void main(String[] args) {
		Student stud1 = new Student(1, "Vipin Chauhan", 85, 90);
		Student stud2 = new Student(2, "Ananya Chauhan", 95, 90);
		Student stud3 = new Student(3, "Jerry", 70, 70);

		List<Student> studList = Arrays.asList(stud1, stud2, stud3);

		System.out.println("List of all Students : \n   " + studList);
		System.out.println("List of Students having Distinction : \n   "
				+ StudentPredicates.filterStudents(studList, StudentPredicates.isDistinctedStudent(80)));
		System.out.println("List of Students not having Distinction : \n   "
				+ StudentPredicates.filterStudents(studList, StudentPredicates.isDistinctedStudent(80).negate()));
		System.out.println("List of Students having Name : \n   "
				+ StudentPredicates.filterStudents(studList, StudentPredicates.isStudentName("Ananya")));
	}
}

class StudentPredicates {
	public static Predicate<Student> isDistinctedStudent(int marks) {
		return student -> student.getEnglishMarks() > marks && student.getHindiMarks() > marks;
	}

	public static Predicate<Student> isStudentName(String name) {
		return student -> student.getName().contains(name);
	}

	public static List<Student> filterStudents(List<Student> students, Predicate<Student> predicate) {
		return students.stream().filter(predicate).collect(Collectors.<Student> toList());
	}
}

class Student {
	int rollNo;
	String name;
	int englishMarks;
	int hindiMarks;

	public Student(int rollNo, String name, int englishMarks, int hindiMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.englishMarks = englishMarks;
		this.hindiMarks = hindiMarks;
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

	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", englishMarks=" + englishMarks + ", hindiMarks="
				+ hindiMarks + "]";
	}

}