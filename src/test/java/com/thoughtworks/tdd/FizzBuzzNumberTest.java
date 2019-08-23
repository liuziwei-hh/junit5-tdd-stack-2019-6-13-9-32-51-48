package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzNumberTest {
      @Test
      public void should_return_1_when_fizzBuzz_given_1() {
    	  //given
    	  int number=1;
    	  FizzBuzzNumber fizzBuzzNumber=new FizzBuzzNumber();
    	  //when
    	  String word=fizzBuzzNumber.fizzBuzz(number);
    	  //then
    	  Assertions.assertEquals("1",word);
      }
      public void should_return_normal_when_fizzBuzz_given_normal() {
    	  //given
    	  for(int number=1;number<=120;number++) {
            int number1=3;
            int number2=5;
            int number3=7;
            int number4=6;
            int number5=15;
            int number6=21;
            int number7=35;
            int number8=105;
    	  FizzBuzzNumber fizzBuzzNumber=new FizzBuzzNumber();
    	  //when
    	  String word=fizzBuzzNumber.fizzBuzz(number);
    	  //then
    	  Assertions.assertEquals("Fizz",word);
    	  Assertions.assertEquals("Buzz",word);
    	  Assertions.assertEquals("Whizz",word);
    	  Assertions.assertEquals("Fizz",word);
    	  Assertions.assertEquals("FizzBuzz",word);
    	  Assertions.assertEquals("FizzWhizz",word);
    	  Assertions.assertEquals("BuzzWhizz",word);
    	  Assertions.assertEquals("FizzBuzzWhizz",word);
    	  }
      }
}
