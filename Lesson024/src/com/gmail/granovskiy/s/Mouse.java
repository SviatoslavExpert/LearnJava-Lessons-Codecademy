/*
 * OBJECT-ORIENTED JAVA
 * Object-Oriented Overview
 * Check out the code in the editor. It incorporates classes, objects, 
 * and methods. After this lesson, you'll be able to read and write Java 
 * programs that use the OOP model.
 * Click Run to run the code.
 */

package com.gmail.granovskiy.s;

public class Mouse extends Rodentia {

	String name;

	public Mouse(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + " ate some cheese pizza!");
	}

	public void solveMaze(int minutes) {
		System.out.println(name + " solved the maze in " + minutes + " minutes!");
	}

	public static void main(String[] args) {
		Mouse ratly = new Mouse("Ratly");
		ratly.eat();
		ratly.solveMaze(3);
		ratly.order();
	}

}
