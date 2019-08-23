package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzNumberTest {
      @Test
      public void should_return_normal_when_fizzBuzz_given_normal() {
    	  //given
    	  int number=1;
    	  FizzBuzzNumber fizzBuzzNumber=new FizzBuzzNumber();
    	  //when
    	  String word=fizzBuzzNumber.fizzBuzz(number);
    	  //then
    	  Assertions.assertEquals("1",word);
      }
}
