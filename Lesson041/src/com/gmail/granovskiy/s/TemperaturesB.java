/*
 * DATA STRUCTURES  
 * ArrayList: Insertion
 * 1. Insert a new temperature of 111 at index 2.
 * 2. On the next line, use the get method to print out the temperature 89.
 */

package com.gmail.granovskiy.s;

import java.util.ArrayList;

public class TemperaturesB {

	public static void main(String[] args) {

		ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
		weeklyTemperatures.add(78);
		weeklyTemperatures.add(67);
		weeklyTemperatures.add(89);
		weeklyTemperatures.add(94);
		weeklyTemperatures.add(2, 111);
		System.out.println(weeklyTemperatures.get(3));

	}
}
