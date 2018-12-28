package com.examples.p4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    @Test
    public void testReplace2() throws Exception {
        //Arrange
        String expectedValue="a kciuq nworb xof spmuj revo eht yzal god";
        Transpose t = new Transpose();
        //Act
        String actualValue=t.transpose("a quick brown fox jumps over the lazy dog");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

}