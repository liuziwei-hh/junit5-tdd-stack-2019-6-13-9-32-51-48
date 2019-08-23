package com.thoughtworks.tdd;

public class FizzBuzzNumber {

	public FizzBuzzNumber() {
		// TODO Auto-generated constructor stub
	}

	public String fizzBuzz(int number) {
		// TODO Auto-generated method stub
		if ((number%3)==0) {
		return "Fizz";
		}else{
			if((number%5)==0) {
				return "Buzz";
			}else {
				if((number%7)==0) {
					return "Whizz";
				}
			}
		}
		return number+"";
	}

}
