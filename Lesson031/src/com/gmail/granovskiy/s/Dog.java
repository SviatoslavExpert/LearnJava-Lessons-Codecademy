/*
 * OBJECT-ORIENTED JAVA 
 * Using Methods: I
 * Inside of the main method of the Dog class, 
 * call the bark method on the spike object.
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

	public static void main(String[] args) {
		Dog spike = new Dog(5);
		spike.bark();
	}

}
