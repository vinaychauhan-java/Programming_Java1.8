package com.vinay.prg10.encodingDecoding;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * For many years, Java has provided support for base 64 via a non-public class
 * (therefore non-usable) java.util.prefs.Base64 an undocumented class
 * sun.misc.BASE64Encoder. This class has also very limited information in
 * public domain. But now Java 8 has added a class for Base 64 encoding and
 * decoding purpose i.e. java.util.Base64.
 */
public class VinayPrg1 {

	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getEncoder();
		String data = "Vipin Chauhan";
		System.out.println(encoder.encodeToString(data.getBytes(StandardCharsets.UTF_8)));
	}

}
