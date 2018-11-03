/*
 * OBJECT-ORIENTED JAVA 
 * Methods: I
 * In between the constructor and the main method, 
 * add a method called bark to the Dog class by typing:
 * public void bark() { }
 */

/*
 * OBJECT-ORIENTED JAVA
 * Methods: I
 * 1. In between the constructor and the main method, 
 * add a method called bark to the Dog class by typing:
 * public void bark() { }
 * 2. Inside the bark method, type:  System.out.println("Woof!");
 */

package com.gmai.granovskiy.s;

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

	}

}
