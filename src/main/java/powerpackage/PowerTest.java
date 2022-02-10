package main.java.powerpackage;//changed package name


import org.junit.Test;

public class PowerTest {
    //below methods used snake case as naming convention and java uses camel case
    @Test
    public void oneRaisedToOneIsOnew() {
        assert PowerFinder.of(1,1) == 1;
    }
    @Test
    public void twoRaisedToOneIsTwo() {
        assert PowerFinder.of(2,1) == 2;
    }
    @Test
    public void twoPowerTwoIsFour() {
        assert PowerFinder.of(2, 2) == 4;
    }
    @Test
    public void powerOfTwoAndThreeIsSix() {
        assert PowerFinder.of(3, 2) == 3*3;
    }
}
