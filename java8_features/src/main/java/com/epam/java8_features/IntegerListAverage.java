package com.epam.java8_features;

import java.util.*;

/**
 * @author Sushanth Reddy Udumula
 */

public class IntegerListAverage{

	/**
	 * 
	 * @param intList
	 * @return double
	 * 
	 *         Returns the average of List of Integers passed to it using streams
	 */
	public static double getAverage(ArrayList<Integer> intList) {

		OptionalDouble average = intList.stream().mapToInt(Integer::intValue).average();

		return average.getAsDouble();
	}

}
