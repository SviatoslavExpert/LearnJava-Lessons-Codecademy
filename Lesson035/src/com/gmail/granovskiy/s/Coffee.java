/*
 * OBJECT-ORIENTED JAVA 
 * Generalizations
 * 1. Inside of the main method, create a new Coffee object 
 * called myOrder.
 * 2. On the next line, call the addSugar method on myOrder 
 * and specify 2 as the argument.
 * 3. Modify the Coffee class so that it inherits from the 
 * Beverage class.
 * 4. Inside of main, call the isFull method on the myOrder 
 * object.
 */

package com.gmail.granovskiy.s;

class Coffee extends Beverage {

	public Coffee() {

	}

	public void addSugar(int cubes) {
		
		System.out.println("You added " + cubes + " sugar cubes.");

	}

	public static void main(String[] args) {

		Coffee myOrder = new Coffee();
		myOrder.addSugar(2);
		myOrder.isFull();

	}
}
