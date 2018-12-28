package com.examples.p4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {
    @Test
    public void testReplace1() throws Exception {
        //Arrange
        String expectedValue="aptte mango trip canfy";
        Replace r = new Replace();
        //Act
        String actualValue=r.replace("aplle mango trip candy");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testReplace2() throws Exception {
        //Arrange
        String expectedValue="fffff tttttttt";
        Replace r = new Replace();
        //Act
        String actualValue=r.replace("ddddd llllllll");
        //Assert
        assertEquals(expectedValue, actualValue);
    }


}