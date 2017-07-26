package com.vinay.prg9.stringParsingToDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VinayPrg2 {

	public static void main(String[] args) {

		String currentDate = "20 Dec 2016";

		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");

		LocalDate transformedDate = LocalDate.parse(currentDate, dateFormatter).plusDays(1);

		System.out.println("Transformed Date : " + transformedDate);

	}

}
