package com.vinay.prg10.encodingDecoding;

import java.util.Base64;

public class VinayPrg2 {

	public static void main(String[] args) {

		String encodedData = "VmlwaW4gQ2hhdWhhbg==";
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] decodedByteArray = decoder.decode(encodedData);
		System.out.println(new String(decodedByteArray));

	}

}
