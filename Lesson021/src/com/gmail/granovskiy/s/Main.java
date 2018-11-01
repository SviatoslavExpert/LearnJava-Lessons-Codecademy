/*
 * CONDITIONALS AND CONTROL FLOW 
 * Ternary Conditional
 * Set the canDrive variable equal to the ternary expression: 
 * (fuelLevel > 0) ? 'Y' : 'N';
 */

package com.gmail.granovskiy.s;

public class Main {

	public static void main(String[] args) {

		int fuelLevel = 3;

		char canDrive = (fuelLevel > 0) ? 'Y' : 'N';
		System.out.println(canDrive);

	}

}
