package com.thoughtworks;


import org.junit.Test;

public class PowerTest {
    @Test
    public void givenOneRaisedOneWhenCalculatedShouldEquateToOne() {
        assert Power.of(1,1) == 1;
    }

    @Test
    public void givenTwoRaisedOneWhenCalculatedShouldEquateToTwo() {
        assert Power.of(2,1) == 2;
    }

    @Test
    public void givenTwoRaisedTwoWhenCalculatedShouldEquateToFour() {
        assert Power.of(2, 2) == 4;
    }

    @Test
    public void givenTwoRaisedThreeWhenCalculatedShouldEquateToSix() {
        assert Power.of(3, 2) == 3*3;
    }
}
