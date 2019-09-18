package com.pro.demo;

interface A1{
	default void a() {
		System.out.println("test");
	}
}

interface B1{
	default void a() {
		System.out.println("MyTEst");
	}
}
public class Test implements A1,B1{
	
	public static int duata() {
		try {
			int ae= 5, be=6, ce=8;
			
			int j = ae+be;
			return j;
		}catch(ArithmeticException e) {
			return 0;
		}finally {
			//return 1;
		}
	}
	
	public static void main(String args[]) {
		long a = 10;
		long C = 2*a;
		int x = 5;
		//System.out.println(x<4?x>6?10:8:7);
		byte d = 40, b=50;
		byte c = (byte) (d+b);
		System.out.println(c);
		int ab=50,bc=75;
		boolean cd = ab>=bc;
		if(cd = true) {
			System.out.println("asdfasdf"  + duata());
		}
		
		
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		A1.super.a();
	}

	

	
}
