/*
 * DATA STRUCTURES 
 * Iterating over a HashMap
 * 1. Complete the unfinished code statement on line 12 
 * to print out the size of restaurantMenu. 
 * 2. Uncomment the code between line 13 and line 19Next, 
 * complete the for each loop by typing:  
 * for (String item : restaurantMenu.keySet()) {}
 */

package com.gmail.granovskiy.s;

import java.util.HashMap;

public class RestaurantForEach {

	public static void main(String[] args) {

		HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

		restaurantMenu.put("Turkey Burger", 13);
		restaurantMenu.put("Naan Pizza", 11);
		restaurantMenu.put("Cranberry Kale Salad", 10);

		System.out.println(restaurantMenu.size());

		for (String item : restaurantMenu.keySet()) {
			System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");

		}

	}
}
