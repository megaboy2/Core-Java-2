package com.hackbulgaria.corejava;

public class FaultyProblem6 {
    public static long pow(int a, int b) {
        if (b == 0){
            return 1;
        }
        if (b % 2 == 1) {
            return a * pow(a, b - 1);
        } else {
            //long power = pow(a, b / 2);
            return pow(a, b / 2) * pow(a, b / 2);
        }
    }
}
