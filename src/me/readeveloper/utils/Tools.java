package me.readeveloper.utils;

public class Tools {
    public static boolean isOptimalSolution(double number, double[] values, double[] weights, int capacity) {
        double max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max && weights[i] <= capacity) {
                max = values[i];
            }
        }

        return number == max;
    }


    public static void printHeaders(int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.print("e" + (i + 1) + "\t");
            if (i == quantity - 1) {
                System.out.print("\n");
            }
        }
    }
}
