package com.algebra.calculate;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//Carry out unit Tests for the CalculateNumbers Methods

@DisplayName("Write Unit Tests for CalculateNumbers Methods")
public class CalculateNumbersTest {

	public double a;
	public double b;
	
	CalculateNumbers num = new CalculateNumbers();
	@Test
	public void testAddNumbers(double a,double b){
		a=10;
		b=5;
		double c = a+b;
		assertEquals(c, num.AddNumbers(a, b));
	
		
	}
}
