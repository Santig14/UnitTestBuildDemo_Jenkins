package com.ofss;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hl= new HelloWorld();
		System.out.println(hl.sayHello("Sayantan"));
		System.out.println("Interest after cal: "+hl.interestCalc(10000, 0.1, 1));
		
	}

}
