package com.vinay.prg4.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * (1) What is a Lambda expression in java?
 * 
 * A Lambda expression (or function) is just an anonymous function, i.e., a
 * function with no name and without being bounded to an identifier. In other
 * words, lambda expressions are nameless functions given as constant values,
 * and written exactly in the place where it�s needed, typically as a parameter
 * to some other function.
 * 
 * The most important features of Lambda Expressions is that they execute in the
 * context of their appearance. So, a similar lambda expression can be executed
 * differently in some other context (i.e. logic will be same but results will
 * be different based on different parameters passed to function).
 * 
 * (2) What�s big deal with Lambda expression?
 * 
 * Mostly OOP languages evolve around objects and treat only them their first
 * class citizens. Another important entity i.e. functions take back seat. This
 * is specially true in java, where functions can�t exist outside an object. A
 * function itself does not mean anything in java, until it is related to some
 * object or instance. But in functional programming, you can define functions,
 * give them reference variables and pass them as method arguments and much
 * more. JavaScript is a good example of this where you can pass callback
 * methods e.g. to Ajax calls.
 * 
 * (3) Syntax for Lambda expression
 * 
 * A typical lambda expression syntax will be like this: (x, y) -> x + y which
 * means that this function takes two parameters and return their sum. Now based
 * on type of x and y, method may be used in multiple places. Parameters can
 * match to int, or Integer or simply String also. Based on context, it will
 * either add two integers or concatenate two strings.
 * 
 */
public class VinayPrg1 {

	// Basic Syntax for Lambda expression
	// either
	// (parameters) -> expression
	// or
	// (parameters) -> { statement-1; statement-2; }
	// or
	// () -> expression

	// Usage of Arrow (->) token

	// -- Takes two integers and returns their multiplication or other operation
	// (int a, int b) -> a * b
	// (int arg1, int arg2) -> { System.out.println(arg1 + " :: " + arg2);}
	// -- Takes two numbers and returns their difference
	// (a, b) -> a - b
	// -- Takes no values and returns 99
	// () -> 99
	// -- Takes a string, prints its value to the console, and returns
	// nothing
	// (String a) -> System.out.println(a)
	// -- Takes a number and returns the result of doubling it
	// a -> 2 * a
	// -- Takes a collection and do some processing
	// c -> { //some complex statements }

	public static void main(String... args) {
		List<String> myList = new ArrayList<>();
		myList.add("Vipin Chauhan");
		myList.add("Vinay Chauhan");
		myList.add("Ananya Chauhan");

		// Iterating over a List using Lambda expressions
		myList.forEach(value -> System.out.println(value));
	}
}

/**
 * Let�s identify some rules which will help us in writing lambda expression:
 * 
 * - A lambda expression can have zero, one or more parameters.
 * 
 * - The type of the parameters can be explicitly declared or it can be inferred
 * from the context i.e. (int a) and (a) both are same.
 * 
 * - Multiple parameters are enclosed in mandatory parentheses and separated by
 * commas.
 * 
 * - Empty parentheses are used to represent an empty set of parameters.
 * 
 * - When there is a single parameter, if its type is inferred, it is not
 * mandatory to use parentheses. e.g. a -> return a*a.
 * 
 * -The body of the lambda expressions can contain zero, one or more statements.
 * 
 * - If body of * lambda expression has single statement curly brackets are not
 * mandatory and the return type of the anonymous function is the same as that
 * of the body expression. When there is more than one statement in body than
 * these must be enclosed in curly brackets.
 */
