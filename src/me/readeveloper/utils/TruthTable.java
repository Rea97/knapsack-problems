package me.readeveloper.utils;

public class TruthTable {
    public static boolean[][] make(int quantity) {
        int n = (int) Math.pow(2, quantity);
        boolean[][] truthTable = new boolean[n][quantity];
        for (int i = 0; i < n; ++i) {
            boolean first = (i & 1) == 0;
            boolean second = (i & 2) == 0;
            boolean third = false;
            boolean fourth = false;
            boolean fifth = false;

            truthTable[i][quantity-1] = !first;
            truthTable[i][quantity-2] = !second;
            if (quantity > 2) {
                third = (i & 4) == 0;
                truthTable[i][quantity-3] = !third;
            }
            if (quantity > 3) {
                fourth = (i & 8) == 0;
                truthTable[i][quantity-4] = !fourth;
            }
            if (quantity > 4) {
                fifth = (i & 16) == 0;
                truthTable[i][quantity-5] = !fifth;
            }
        }

        return truthTable;
    }
}
