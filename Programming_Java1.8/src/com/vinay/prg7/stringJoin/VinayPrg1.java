package com.vinay.prg7.stringJoin;

import java.time.ZoneId;

/**
 * Till Java 7, we had String.split() method which can split a string based on
 * some token passed as parameter. It returned list of string tokens as string
 * array. But, if you want to join a string or create a CSV by concatenating
 * string tokens using some separator between them, you have to iterate through
 * list of Strings, or array of Strings, and then use StringBuilder or
 * StringBuffer object to concatenate those string tokens and finally get the
 * CSV
 * 
 * Now, Java 8 made the task easy. Now you have String.join() method where first
 * parameter is separator and then you can pass either multiple strings or some
 * instance of Iterable having instances of strings as second parameter. It will
 * return the CSV in return.
 */
public class VinayPrg1 {

	public static void main(String[] args) {
		String joinedString = String.join("/", "Users", "VinayChauhan", "Desktop");
		System.out.println(joinedString);

		String zoneIds = String.join(", ", ZoneId.getAvailableZoneIds());
		System.out.println(zoneIds);

	}

}
