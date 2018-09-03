package me.readeveloper;

import me.readeveloper.utils.TruthTable;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int quantity = 3;
        int n = (int) Math.pow(2, quantity);
        boolean[][] truthTable = TruthTable.make(quantity);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < quantity; j++) {
                System.out.print(truthTable[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
