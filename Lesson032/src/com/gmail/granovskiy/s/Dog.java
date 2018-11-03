/*
 * OBJECT-ORIENTED JAVA
 * Methods: II
 * 1.  In between the bark and main methods, add a method 
 * called run to the Dog class by typing:
 * public void run() {}
 * 2. Modify the run method so that it accepts an int parameter called feet.
 * 3. Inside of the run method, type: 
 * System.out.println("Your dog ran " + feet + " feet!");
 * 4. Inside of the main method, call the run method on the spike object. 
 * You can pass in an int parameter of your choice.
 */

package com.gmail.granovskiy.s;

public class Dog {

	int age;

	public Dog(int dogsAge) {
		age = dogsAge;
	}

	public void bark() {
		System.out.println("Woof!");
	}

	public void run(int feet) {
		System.out.println("Your dog ran " + feet + " feet!");
	}

	public static void main(String[] args) {
		Dog spike = new Dog(5);
		spike.bark();
		spike.run(7);
	}

}
