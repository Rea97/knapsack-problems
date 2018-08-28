package me.readeveloper;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int cantidad = 3;
        int n = (int) Math.pow(2, cantidad);
        boolean[][] truthTable = new boolean[n][cantidad];
        for (int i = 0; i < n; ++i) {
            boolean first = (i & 1) == 0;
            boolean second = (i & 2) == 0;
            boolean third = false;
            boolean fourth = false;
            boolean fifth = false;

            truthTable[i][cantidad-1] = !first;
            truthTable[i][cantidad-2] = !second;
            if (cantidad > 2) {
                third = (i & 4) == 0;
                truthTable[i][cantidad-3] = !third;
            }
            if (cantidad > 3) {
                fourth = (i & 8) == 0;
                truthTable[i][cantidad-4] = !fourth;
            }
            if (cantidad > 4) {
                fifth = (i & 16) == 0;
                truthTable[i][cantidad-5] = !fifth;
            }

            //System.out.println(first + "\t" + second + "\t" + third);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cantidad; j++) {
                System.out.print(truthTable[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
