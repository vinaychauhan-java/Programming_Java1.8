package com.vinay.prg9.stringParsingToDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VinayPrg1 {

	public static void main(String[] args) {

		String armisticeDate = "2016-12-20";
		LocalDate armisticeLocalDate = LocalDate.parse(armisticeDate);
		System.out.println("Local Date      : " + armisticeLocalDate);

		String armisticeDateTime = "2016-12-20T08:30";
		LocalDateTime armisticeLocalDateTime = LocalDateTime.parse(armisticeDateTime);
		// LocalDateTime armisticeLocalDateTime = LocalDateTime.parse(armisticeDateTime).plusHours(1);
		System.out.println("Local Date/Time : " + armisticeLocalDateTime);

	}

}

/**
 * By default, java dates are in ISO8601 format
 */