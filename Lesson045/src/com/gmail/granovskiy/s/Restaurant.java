/*
 * DATA STRUCTURES   
 * HashMap: Manipulation
 * 1. Let's add some food items and prices to the our menu. 
 * Use the put method to add a key "Turkey Burger" with the value 13.
 * 2. Add a key "Naan Pizza" with the value 11. 
 * 3. Finally, add a key "Cranberry Kale Salad" with the value 10.
 */

package com.gmail.granovskiy.s;

import java.util.HashMap;

public class Restaurant {

	public static void main(String[] args) {

		HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();
		restaurantMenu.put("Turkey Burger", 13);
		restaurantMenu.put("Naan Pizza", 11);
		restaurantMenu.put("Cranberry Kale Salad", 10);

	}
}
