/*
 * CONDITIONALS AND CONTROL FLOW 
 * If-ElseIf-Else Statement
 * Set the value of the round variable so that the code in 
 * the else if block runs.
 */

package com.gmail.granovskiy.s;

public class Main {

	public static void main(String[] args) {

		int round = 5;

		if (round > 12) {
			System.out.println("The match is over!");
		} else if (round > 0) {
			System.out.println("The match is underway!");
		} else {
			System.out.println("The boxing match hasn't started yet.");
		}
	}

}
