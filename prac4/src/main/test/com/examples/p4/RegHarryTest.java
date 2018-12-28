package com.examples.p4;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegHarryTest {


    @Test
    public void testHarry() throws Exception {
        //Arrange
        Boolean expectedValue = true;
        RegHarry s = new RegHarry();
        //Act
         Boolean actualValue=s.harry("Is a Harry faff");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testHarry2() throws Exception {
        //Arrange
        Boolean expectedValue = false;
        RegHarry s = new RegHarry();
        //Act
        Boolean actualValue=s.harry("Is a harry faff");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

}