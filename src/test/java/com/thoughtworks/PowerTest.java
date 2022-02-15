package com.thoughtworks;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerTest {
    @Test
    public void givenOneRaisedOneWhenCalculatedShouldEquateToOne() {
        int base = 1;
        int power = 1;

        int actualResult = Power.of(base,power);
        int expectedResult = 1;

        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void givenTwoRaisedOneWhenCalculatedShouldEquateToTwo() {
        int base = 2;
        int power = 1;

        int actualResult = Power.of(base,power);
        int expectedResult = 2;

        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void givenTwoRaisedTwoWhenCalculatedShouldEquateToFour() {
        int base = 2;
        int power = 2;

        int actualResult = Power.of(base,power);
        int expectedResult = 4;

        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void givenTwoRaisedThreeWhenCalculatedShouldEquateToEight() {
        int base = 2;
        int power = 3;

        int actualResult = Power.of(base,power);
        int expectedResult = 8;

        assertEquals(actualResult,expectedResult);
    }
}
