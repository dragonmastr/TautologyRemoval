package com.hardik;


import static org.junit.Assert.*;

import org.junit.Test;

import com.hardik.tautology.NumberValidator;

public class NumberValidatorTest {
	
	@Test
	public void checkPrimeNumber(){
		NumberValidator nm=new NumberValidator();
		Integer numbers[]={23,61,79};
		for(int i=0;i<numbers.length;i++){
			assertEquals(true,nm.isItPrime(numbers[i]));
		}
		
	}
	
	@Test
	public void checkNotPrimeNumber(){
		NumberValidator hj=new NumberValidator();
	Integer numbers[]={4,8,88,12,45};
	for(int i=0;i<numbers.length;i++){
		assertEquals(false,hj.isItPrime(numbers[i]));
	}
		
	}
	@Test
	public void checkForOne(){
		NumberValidator hj=new NumberValidator();
	Integer number=1;
		assertEquals(false,hj.isItPrime(number));
	
	}
	

}
