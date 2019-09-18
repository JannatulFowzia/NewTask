package com.lambda.practice;

public class TestLambda {
public String wildAnimal = "Lion";
	interface DataWorld{
		String hello(String hellow);
	}
	public void lambdaTesting() {
		String domesticAnimal = "Cow";
		new Thread (() -> {System.out.println("Class Level: " + this.wildAnimal);
						   System.out.println("Main Level: " + domesticAnimal);}).start();
	}

	public static void main(String args[]) {
		String domesticAnimal = "Cow";
		DataWorld dW = (String hellow) -> { return "Hello " + hellow;};
		System.out.println(dW.hello("Fowzia"));
		new TestLambda().lambdaTesting();
		//new Thread (() -> {System.out.println("Class Level: " + this.wildAnimal);}).start();
	}
}
