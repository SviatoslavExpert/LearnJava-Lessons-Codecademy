/*
 * DATA STRUCTURES  
 * Generalizations
 * 1. Inside of the main method and before the for each loop, 
 * create an ArrayList called sports that stores String types. 
 * 2. Add "Football" to sports. 
 * 3. Now add "Boxing" to sports.
 * 4. The first for each loop in the code editor is missing 
 * the code that should be run. Inside of the for each loop, type:
 * System.out.println(sport); 
 * 5. Uncomment the incomplete for each loop towards the bottom 
 * and complete the loop by typing: 
 * for ( String city : majorCities.keySet() ) {}
 */

package com.gmail.granovskiy.s;

import java.util.*;

public class GeneralizationsD {

	public static void main(String[] args) {
		ArrayList<String> sports = new ArrayList<String>();
		sports.add("Football");
		sports.add("Boxing");

		for (String sport : sports) {
			System.out.println(sport);
		}

		// Major cities and the year they were founded
		HashMap<String, Integer> majorCities = new HashMap<String, Integer>();

		majorCities.put("New York", 1624);
		majorCities.put("London", 43);
		majorCities.put("Mexico City", 1521);
		majorCities.put("Sao Paulo", 1554);

		for (String city : majorCities.keySet()) {
			System.out.println(city + " was founded in " + majorCities.get(city));

		}

	}
}
