/*
 * DATA STRUCTURES  
 * ArrayList: Access
 * Use the get method to print out the lowest 
 * temperature contained in weeklyTemperatures.
 */

package com.gmail.granovskiy.s;

import java.util.ArrayList;

public class Temperatures {

	public static void main(String[] args) {

		ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
		weeklyTemperatures.add(78);
		weeklyTemperatures.add(67);
		weeklyTemperatures.add(89);
		weeklyTemperatures.add(94);
		System.out.println(weeklyTemperatures.get(1));
	}
}
