package com.epam.java8_features;

import java.util.*;
import java.util.function.*;

/**
 * @author Sushanth Reddy Udumula
 *
 */

class StrPredicates {
	/**
	 * 
	 * @param s
	 * @return boolean
	 * 
	 * Checks if a String is Palindrome or not
	 */
	public static boolean isPalindrome(String s) {
		int n = s.length();

		for (int i = 0; i < n / 2; i++) {
			if (s.charAt(i) != s.charAt(n - i - 1))
				return false;
		}

		return true;
	}
}

public class StringListPalindromes {

	public static ArrayList<String> getPalindromes(ArrayList<String> strList) {
		
		/**
		 * The Required Static method reference
		 */
		return filterStringList(strList, StrPredicates::isPalindrome);
	}

	/**
	 * 
	 * @param strList
	 * @param predicate
	 * @return ArrayList<String>
	 */
	private static ArrayList<String> filterStringList(ArrayList<String> strList, Predicate<String> predicate) {
		ArrayList<String> finalList = new ArrayList<>();

		for (String str : strList) {
			if (predicate.test(str))
				finalList.add(str);
		}
		return finalList;

	}

}
