package com.examples.p4;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoOfOccurancesTest {
    @Test
    public void testNoOfOccurances1() throws Exception {
        //Arrange
        int expectedValue=2;
        NoOfOccurances n = new NoOfOccurances();
        //Act
        int actualValue=n.noOfOccurances("apple","p");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testNoOfOccurance2() throws Exception {
        //Arrange
        int expectedValue=0;
        NoOfOccurances n = new NoOfOccurances();
        //Act
        int actualValue=n.noOfOccurances("apple","j");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

}