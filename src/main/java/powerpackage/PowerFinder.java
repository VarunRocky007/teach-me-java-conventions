package main.java.powerpackage;//changed package name

public class PowerFinder { // changed filename as well as class name in terms of naming convention
    public static int of(int number, int power) {// changed method name to smaller case according to naming convention
        int p = 1;
        for (int index = 0; index<power; index++) {
            p *= number;
        }
        return p;
    }
}
