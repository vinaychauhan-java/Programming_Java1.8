package com.vinay.prg5.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
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

public class VinayPrg2 {
	public static void main(String[] args) {
		Student stud1 = new Student(1, "Vipin Chauhan", 95);
		Student stud2 = new Student(2, "Ananya Chauhan", 90);
		Student stud3 = new Student(3, "Vinay Chauhan", 85);

		List<Student> studList = Arrays.asList(stud1, stud2, stud3, stud1);

		System.out.println("List of all Students : \n   " + studList);

		// Extract distinct elements only
		List<Student> distinctElements = studList.stream().filter(distinctByKey(student -> student.getRollNo()))
				.collect(Collectors.toList());

		// Let's verify distinct elements
		System.out.println("List of distinct Students : \n   " + distinctElements);
	}

	// *** Filter Distinct Elements by Object Attribute/Property ***
	// - Java does not have any native API for filtering distinct by object
	// property directly, so we will create a utility function and then use it.
	// - Below function uses a ConcurrentHashMap instance to find out if there
	// is any existing key with same value wherein key is obtained from a
	// function reference, and here we will pass the object’s property getter
	// method which will cause the property value to act as the key to map.
	private static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
		Map<Object, Boolean> map = new ConcurrentHashMap<>();
		return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}

}

class Student {
	int rollNo;
	String name;
	int totalMarks;

	public Student(int rollNo, String name, int totalMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.totalMarks = totalMarks;
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

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", totalMarks=" + totalMarks + "]";
	}

}