package me.readeveloper;

import me.readeveloper.utils.Input;
import me.readeveloper.utils.Tools;
import me.readeveloper.utils.TruthTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int knapsackCapacity = Input.getCapacity(scanner);
        int quantity = Input.getQuantity(scanner);
        double[] weights = Input.getWeights(scanner, quantity);
        double[] values = Input.getValues(scanner, quantity);

        int n = (int) Math.pow(2, quantity);
        double[] totalValues = new double[n];
        double[] totalWeights = new double[n];
        int[][] combinations = TruthTable.make(quantity);

        for (int i = 0; i < n; i++) {
            values[values.length - 1] = 0;
            weights[weights.length - 1] = 0;
            for (int j = 0; j < quantity; j++) {
                values[values.length - 1] += combinations[i][j] * values[j];
                weights[weights.length - 1] += combinations[i][j] * weights[j];
            }
            totalValues[i] = values[quantity];
            totalWeights[i] = weights[quantity];
        }
        /* Print truth table*/
        Tools.printHeaders(quantity);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < quantity; j++) {
                System.out.print(combinations[i][j] + "\t");
            }
            System.out.print("Valor: "+ totalValues[i] + "\t" + "Peso: " + totalWeights[i]);
            if (totalWeights[i] > knapsackCapacity) {
                System.out.print("\tSe excede capacidad de mochila\n");
            } else {
                if (Tools.isOptimalSolution(totalValues[i], totalValues, totalWeights, knapsackCapacity)) {
                    System.out.print("\tSOLUCION OPTIMA\n");
                } else {
                    System.out.print("\n");
                }
            }
        }
    }
}
