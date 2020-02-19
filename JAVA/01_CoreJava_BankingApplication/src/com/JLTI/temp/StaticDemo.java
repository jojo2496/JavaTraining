package com.JLTI.temp;

public class StaticDemo {
	private static int num1=10;
	private  int num2=10;
	
	public void Display() {
		System.out.println("Num1 :: "+num1);
		System.out.println("Num2 :: "+num2);
		
		num1+=10;
		num2+=10;
		
		System.out.println("Num1 :: "+num1);
		System.out.println("Num2 :: "+num2);
		
	}
	public static void main(String[] args) {
		StaticDemo demo=new StaticDemo();
		demo.Display();
	}

}
