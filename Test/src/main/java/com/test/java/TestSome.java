package com.test.java;

public abstract class TestSome {
	public int chick = 3;
	public void fly(){
		System.out.println("Bird");
	}

	public static void main(String args[]) {
		TestSome d = new TestOther();
		d.fly();
		int f = d.chick;
		System.out.println(f);
	}

}

class TestOther extends TestSome{
	public int chick = 5;
	public void fly() {
		System.out.println("Pelican");
	}
}