package com.vinay.prg2.functionalInterfaces;

/**
 * 
 * From Java 8, interfaces are enhanced to have method with implementation. We
 * can use ‘default‘ and ‘static‘ keyword to create interfaces with method
 * implementation. forEach method implementation in Iterable interface is:
 * 
 * default void forEach(Consumer<? super T> action) {
 * Objects.requireNonNull(action); for (T t : this) { action.accept(t); } }
 * 
 * -- Diamond Problem -- We know that Java doesn’t provide multiple inheritance
 * in Classes because it leads to Diamond Problem. So how it will be handled
 * with interfaces now, since interfaces are now similar to abstract classes.
 * The solution is that compiler will throw exception in this scenario and we
 * will have to provide implementation logic in the class implementing the
 * interfaces.
 * 
 * -- @FunctionalInterface -- An interface with exactly one abstract method
 * becomes Functional Interface. We don’t need to use @FunctionalInterface
 * annotation to mark an interface as Functional Interface. @FunctionalInterface
 * annotation is a facility to avoid accidental addition of abstract methods in
 * the functional interfaces.
 * 
 */

@FunctionalInterface
interface InterfaceA {

	// An interface with exactly one abstract method becomes Functional
	// Interface.
	void getData1(String str);

	default void log(String str) {
		System.out.println("InterfaceA >> Logging :: " + str);
	}

	static void print(String str) {
		System.out.println("InterfaceA >> Printing ::  " + str);
	}

	// Tricky Note :- Trying to override Object method gives compile time error
	// as "A default method cannot override a method from java.lang.Object"
	// default String toString(){
	// return "myString";
	// }

}

@FunctionalInterface
interface InterfaceB {

	void getData2();

	default void log(String str) {
		System.out.println("InterfaceB >> Logging :: " + str);
	}

	default void printHelloWorldMessage() {
		System.out.println("InterfaceB >> printHelloWorldMessages");
	}

}

class MyClass implements InterfaceA, InterfaceB {

	@Override
	public void getData1(String str) {
		System.out.println("InterfaceA >> getData1");
	}

	@Override
	public void getData2() {
		System.out.println("InterfaceB >> getData2");
	}

	// -- Diamond Problem -- Important Note --
	// MyClass won't compile without having it's own log() implementation
	@Override
	public void log(String str) {
		System.out.println("MyClass >> Logging ::" + str);
		// InterfaceA.print("Vipin & Vinay");
	}

}

public class VinayPrg1 {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.log("Vipin Chauhan");
		myClass.getData1("Data-1");
		myClass.getData2();
		myClass.printHelloWorldMessage();

		InterfaceA.print("Vipin & Vinay");
	}
}
