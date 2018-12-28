package com.examples.p4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccuranceTest {
    @Test
    public void testCount1() throws Exception {
        //Arrange
        int  expectedValue = 3;
        MultipleOccurance s = new MultipleOccurance();
        //Act
        int actualValue=s.count("She sells seashells by the seashore","se");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testCount2() throws Exception {
        //Arrange
        int  expectedValue = 1;
        MultipleOccurance s = new MultipleOccurance();
        //Act
        int actualValue=s.count("She sells seashells by the seashore","by");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

}