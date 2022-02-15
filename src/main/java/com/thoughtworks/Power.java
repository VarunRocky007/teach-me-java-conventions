package com.thoughtworks;

public class Power {
    public static int OF(int xyz, int pqr) {
        int p = 1;
        for (int i = 0; i<pqr; i++) {
            p *= xyz;
        }
        return p;
    }
}
