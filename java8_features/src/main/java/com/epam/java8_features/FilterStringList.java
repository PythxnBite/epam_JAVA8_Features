package com.epam.java8_features;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 
 * @author Sushanth Reddy Udumula
 *
 */

public class FilterStringList {

	public static ArrayList<String> filter(ArrayList<String> list) {

		/**
		 * Lambda function which uses a stream to filter out strings which start with
		 * 'a' and have 3 letters
		 */
		StringList filterStrList = (strList) -> (ArrayList<String>) strList.stream().filter(str -> {
			return str.charAt(0) == 'a' && str.length() == 3 ? true : false;
		}).collect(Collectors.toList());

		return filterStrList.filterList(list);

	}

	// Functional Interface used by the Lambda Function
	@FunctionalInterface
	interface StringList {
		ArrayList<String> filterList(ArrayList<String> strList);
	}
}
