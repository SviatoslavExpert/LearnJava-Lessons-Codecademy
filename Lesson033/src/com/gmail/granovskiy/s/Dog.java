/*
 * 1. In between the run and main methods, add a method 
 * called getAge that returns age by typing:
 * public int getAge() {
 *    return age; 
 * }
 * 2.  Inside of main, set an int variable spikeAge 
 * to the value returned by spike.getAge();
 * 3.  On the next line, print out the age by typing: 
 *     System.out.println(spikeAge);
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

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Dog spike = new Dog(5);
		spike.bark();
		spike.run(5);
		int spikeAge = spike.getAge();
		System.out.println(spikeAge);
	}

}
