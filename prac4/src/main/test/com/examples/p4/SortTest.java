package com.examples.p4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    @Test
    public void testSort1() throws Exception {
        //Arrange
        String expectedValue[] = {"apple","band","mangp","xaokda"};
        Sort s = new Sort();
        //Act
        String[] actualValue=s.sortWord("apple mangp band xaokda");
        //Assert
        assertEquals(expectedValue, actualValue);
    }


}