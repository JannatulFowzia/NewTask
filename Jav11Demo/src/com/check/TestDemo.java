package com.check;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestDemo {

	public static void main(String[] args) {
		String s = " ";
		System.out.println("Checking for blank" + s.isBlank());
		s = "My Name\nis\nFaizi";
		System.out.println("Checking if data is available " + s.isBlank());
		System.out.println("Checking if data is available " + s.lines().count());
		System.out.println("Checking if data is available " + s.lines().collect(Collectors.toList()));
		s = " ";
		System.out.println(s.isBlank());
		s = " ";
		System.out.println(s.isBlank());
		s = " ";
		System.out.println(s.isEmpty());
		
		s =  "  My Name ";
		System.out.println("Stripping" + s.strip());
		System.out.println("Strip leading" + s.stripLeading());
		System.out.println("Strip trailing" + s.stripTrailing());
		
		System.out.println("Enter the value of s");
		Scanner in = new Scanner(System.in);
		String i = in.nextLine();
		System.out.println("Here we repeat " + i.repeat(3));
		
		try {
			Path path = Files.writeString(Files.createTempFile("myFile", ".txt"), "My name is Faizi\n \nI am studying in ISGR\n I am six years old");
			System.out.println(path.toString());
			FileInputStream d = (FileInputStream) Files.newInputStream(path);
			BufferedReader read = Files.newBufferedReader(path);
			InputStream ins  = Files.newInputStream(path);
			BufferedReader re = new BufferedReader(new InputStreamReader(d));
			String line = "";
			while((line = re.readLine()) != null) {
				System.out.println(line);
			}
			
		//	String data= Files.readString(path);
			//System.out.println(data.lines());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
