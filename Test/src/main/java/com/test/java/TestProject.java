package com.test.java;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestProject {

	public static void main(String args[]) {

		Path filePath = Paths.get("C:\\POC\\test\\myFile.txt");
		System.out.println(filePath);
		ArrayList<String> nList = new ArrayList();
		List<String> myList = new ArrayList();
		try {
			String line = "";
			InputStream in = Files.newInputStream(filePath);
			BufferedReader bf = new BufferedReader(new InputStreamReader(in));
			while ((line = bf.readLine()) != null) {
				nList.addAll(Arrays.asList(line));

			}
			System.out.println(nList);
			nList.forEach(tl -> {

				myList.add(tl.replace(" ", ","));
			});
			System.out.println(myList.parallelStream().findFirst());
			FileWriter writer = new FileWriter("C:\\POC\\test\\myModFile.txt");
			myList.parallelStream().forEach(s -> 
			{
				try {
					writer.write(s.replace(",", " "));
				} catch (IOException e) {
					e.printStackTrace();
				}

			});
			writer.close();

		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
