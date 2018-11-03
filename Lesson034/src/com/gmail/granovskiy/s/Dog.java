/*
 * OBJECT-ORIENTED JAVA  
 * Inheritance
 * 1. Note that there are now two files in the code editor. 
 * Within the Dog class, use the extends keyword to inherit 
 * from the Animal class.
 * 2. Within the main method of the Dog class, call the 
 * checkStatus method on the spike object.
 */

package com.gmail.granovskiy.s;

public class Dog extends Animal {

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
		spike.checkStatus();
	}
}
