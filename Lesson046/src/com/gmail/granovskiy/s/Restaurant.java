/*
 * DATA STRUCTURES  
 * HashMap: Access
 * Use the get method to print out the price of the "Naan Pizza" item.
 */

package com.gmail.granovskiy.s;

import java.util.HashMap;

public class Restaurant {
	public static void main(String[] args) {
		HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();
		restaurantMenu.put("Turkey Burger", 13);
		restaurantMenu.put("Naan Pizza", 11);
		restaurantMenu.put("Cranberry Kale Salad", 10);

		System.out.println(restaurantMenu.get("Naan Pizza"));

	}
}