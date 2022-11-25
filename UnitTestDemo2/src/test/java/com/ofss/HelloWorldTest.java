package com.ofss;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
	@Test
	public void testinterestCalc() {
		HelloWorld hw= new HelloWorld();
		Double actual= hw.interestCalc(10000, 0.1, 1);
		Double expected= 11000.0;
		assertEquals(actual, expected);
		
				
	} 
	@Test
	public void testsayHello() {
		HelloWorld hw= new HelloWorld();
		String actual= hw.sayHello("Sayantan");
		String expected= "Sayantan";
		assertEquals(actual, expected);
				
	}
}
