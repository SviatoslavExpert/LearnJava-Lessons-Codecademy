/*
 * Decisions
 * Take a look at the code in the editor. 
 * If it looks confusing to you right now, don't worry! 
 * After this lesson, you'll be able to read and write 
 * Java programs that use control flow.
 */

package com.gmail.granovskiy.s;

public class Main {

	public static void main(String[] args) {

		if (1 < 4 && 0 > 5) {
			System.out.println("You ordered a cup of hot, mint tea.");
		} else if (21 <= 19 || 17 >= 28) {
			System.out.println("You ordered freshly squeezed orange juice!");
		} else if (!(true == true)) {
			System.out.println("You ordered hot cocoa!");
		} else {
			System.out.println("You ordered a cup of Java!");
		}

		char answerChoice = 'C';

		switch (answerChoice) {

		case 'A':
			System.out.println("You answered: " + answerChoice + ". Please try again.");
			break;

		case 'B':
			System.out.println("You answered: " + answerChoice + ". Please try again.");
			break;

		case 'C':
			System.out.println("You answered: " + answerChoice + ". That is correct!");
			break;

		case 'D':
			System.out.println("You answered: " + answerChoice + ". Please try again.");
			break;

		default:
			System.out.println("Please select a valid answer choice.");

		}

	}

}
