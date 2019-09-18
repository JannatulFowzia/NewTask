package com.lambda.practice;

public class TestAnimalLambda{
	
	public static void main(String args[]) {
		AnimalFunctions af = (String id) -> {System.out.println("Cattie  "+  id);
											 System.out.println("Dogie  "+ id);
											 return "Hamster " + id;};
		String d = af.Animal_id("I am Domestic");
		System.out.println(d);
	}
	
}
