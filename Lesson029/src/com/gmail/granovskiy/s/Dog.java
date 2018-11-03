/*
 * Inside of main, use the Dog constructor to create 
 * a Dog object and assign it to the variable spike. 
 * Make sure that you specify the required int parameter age.
 */

package com.gmail.granovskiy.s;

public class Dog {

	int age;

	public Dog(int dogsAge) {
		age = dogsAge;
	}

	public static void main(String[] args) {

		Dog spike = new Dog(5);

	}

}
