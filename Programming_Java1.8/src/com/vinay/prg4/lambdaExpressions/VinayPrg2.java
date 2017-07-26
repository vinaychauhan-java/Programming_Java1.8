package com.vinay.prg4.lambdaExpressions;

/**
 * 
 * Single Abstract Method interfaces (SAM Interfaces) is not a new concept. It
 * means interfaces with only one single method. In java, we already have many
 * examples of such SAM interfaces. From java 8, they will also be referred as
 * functional interfaces as well. Java 8, enforces the rule of single
 * responsibility by marking these interfaces with a new annotation
 * i.e. @FunctionalInterface.
 * 
 * For example, new definition of Runnable interface is like this:
 * 
 * @FunctionalInterface public interface Runnable { public abstract void run();}
 * 
 */

/**
 * 
 * We know that Lambda expressions are anonymous functions with no name and they
 * are passed (mostly) to other functions as parameters. Now, in java method
 * parameters always have a type and this type information is looked for to
 * determine which method needs to be called in case of method overloading or
 * even simple method calling. So, basically every lambda expression also must
 * be convertible to some type to be accepted as method parameters. Well, that
 * type in which lambda expressions are converted, are always of functional
 * interface type.
 *
 */
public class VinayPrg2 {

	public static void main(String[] args) {
		new Thread(() -> {
			System.out.println("Good Evening :-)");
		}).start();
	}

	// Runnable is an functional interface with single method run(). So, when
	// we pass lambda expression to constructor of Thread class, compiler tries
	// to convert the expression into equivalent Runnable code. If compiler
	// succeed then everything runs fine, if compiler is not able to convert the
	// expression into equivalent implementation code, it will complain. Here,
	// in above example, lambda expression is converted to type Runnable.
}

/**
 * Why do we need Lambda Expression?
 * 
 * - Reduced Lines of Code :- One of the clear benefit of using lambda
 * expression is that the amount of code is reduced, we have already seen that
 * how easily we can create instance of a functional interface using lambda
 * expression rather than using anonymous class.
 * 
 * - Sequential and Parallel Execution Support :- Another benefit of using
 * lambda expression is that we can benefit from the Stream API sequential and
 * parallel operations support.
 *
 */
