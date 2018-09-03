package me.readeveloper.utils;

public class TruthTable {
    public static int[][] make(int quantity) {
        int n = (int) Math.pow(2, quantity);
        int[][] truthTable = new int[n][quantity];
        for (int i = 0; i < n; ++i) {
            boolean first = (i & 1) == 0;
            boolean second = (i & 2) == 0;
            boolean third = false;
            boolean fourth = false;
            boolean fifth = false;

            truthTable[i][quantity-1] = !first ? 1 : 0;
            truthTable[i][quantity-2] = !second ? 1 : 0;
            if (quantity > 2) {
                third = (i & 4) == 0;
                truthTable[i][quantity-3] = !third ? 1 : 0;
            }
            if (quantity > 3) {
                fourth = (i & 8) == 0;
                truthTable[i][quantity-4] = !fourth ? 1 : 0;
            }
            if (quantity > 4) {
                fifth = (i & 16) == 0;
                truthTable[i][quantity-5] = !fifth ? 1 : 0;
            }
        }

        return truthTable;
    }
}
