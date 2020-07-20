package com.epam.java8_features;

import java.util.*;

/**
 * @author Sushanth Reddy Udumula
 */
public class App {

	public static void main(String[] args) {
		/**
		 * Task - 1
		 * 
		 * Task : Write a method that returns the average of a list of integers.
		 * 
		 */

		ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 6, 7, 6, 5));
		System.out.println(
				"Average of List : " + integers + " is : " + IntegerListAverage.getAverage(integers));

		/**
		 * Task - 2
		 * 
		 * Task : Given a list of Strings, write a method that returns a list of all
		 * strings that start with the letter 'a' (lower case) and have exactly 3
		 * letters. TIP: Use Java 8 Lambdas and Streams API's.
		 * 
		 */

		ArrayList<String> strings = new ArrayList<>(
				Arrays.asList("afdasf", "abc", "sdf", "agc", "asfasf", "ertw", "sdfg"));

		System.out.println("String List : " + strings + " after filtering is : " + FilterStringList.filter(strings));

		/**
		 * Task - 3
		 * 
		 * Task - Given a list of Strings (that contains both palindromes and non-
		 * palindromes), write a method that returns a list of all the palindrome
		 * strings. TIP: Use static method references of Functional Interfaces
		 */

		ArrayList<String> palStringList = new ArrayList<>(
				Arrays.asList("anna", "civic", "volleball", "basketball", "destiny", "noon", "rotor"));

		System.out.println("Palindromes in List : " + palStringList + " are : "
				+ StringListPalindromes.getPalindromes(palStringList));
	}

}
