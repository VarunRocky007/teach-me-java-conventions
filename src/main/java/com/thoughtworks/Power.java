package com.thoughtworks;

public class Power {
    public static int of(int base, int power) {
        int result = 1;
        for (int index = 0; index<power; index++) {
            result *= base;
        }
        return result;
    }
}
