package com.vinay.prg5.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class VinayPrg4 {
	public static void main(String[] args) throws IOException {

		// Before Java-8 we have following approach for reading file contents
		File file = new File(
				"D:/_VinayWork/MyTestWorkSpace-4/Programming_Java1.8/src/com/vinay/prg5/stream/MyData.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
			if (line.contains("Java")) {
				System.out.println("Found String : " + line);
			}
		}
		br.close();
		fr.close();

		// Now in Java-8 we could have following approach
		Stream<String> lines = Files.lines(Paths
				.get("D:/_VinayWork/MyTestWorkSpace-4/Programming_Java1.8/src/com/vinay/prg5/stream", "MyData.txt"));
		Optional<String> contents = lines.filter(s -> s.contains("Java")).findFirst();
		if (contents.isPresent()) {
			System.out.println("Found String : " + contents.get());
		}
		lines.close();

	}
}
