/*
 * The current block of code in the code editor is incomplete. 
 * Finish the for each loop by typing:
 * for (Integer temperature : weeklyTemperatures) { 
 * System.out.println(temperature); }
 */

package com.gmail.granovskiy.s;

import java.util.ArrayList;

public class TemperaturesForEach {
	public static void main(String[] args) {

		ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
		weeklyTemperatures.add(78);
		weeklyTemperatures.add(67);
		weeklyTemperatures.add(89); 
		weeklyTemperatures.add(94);
		
		for (Integer temperature : weeklyTemperatures) {
			System.out.println(temperature);
		}
	
	}
}
