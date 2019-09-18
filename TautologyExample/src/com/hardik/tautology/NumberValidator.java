package com.hardik.tautology;

public class NumberValidator {

	public boolean isItPrime(int number) {
		int flag=0;
		for(int i=2;i<number;i++){
			if(number%i==0){
				flag=1;
				break;
			}
		}
		if(number==1){
			return false;
		}
		if(flag==0){return true;}
		else{return false;}
	}

	
}
