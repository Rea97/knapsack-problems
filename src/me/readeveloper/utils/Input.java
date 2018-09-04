package me.readeveloper.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static int getCapacity(Scanner scanner) {
        int capacity = 1;
        try {
            System.out.println("Ingresa la capacidad de la mochila:");
            capacity = scanner.nextInt();
            if (capacity <= 0) {
                System.out.println("Capacidad no puede ser menor o igual a 0, se usará 20 como capacidad");
                capacity = 20;
            }
        } catch (InputMismatchException e) {
            System.out.println("Solo son validos numeros enteros, se usará 20 como capacidad.");
            capacity = 20;
        }

        return capacity;
    }

    public static int getQuantity(Scanner scanner) {
        int quantity = 2;
        try {
            System.out.println("Ingresa la cantidad de elementos a analizar (min 2, max 5):");
            quantity = scanner.nextInt();
            if (quantity < 2) {
                System.out.println("Cantidad de elementos es menor al minimo, se establecerá en 2");
                quantity = 2;
            }
            if (quantity > 5) {
                System.out.println("Cantidad de elementos supera el maximo, se establecerá en 5");
                quantity = 5;
            }
        } catch (InputMismatchException e) {
            System.out.println("Solo son validos numeros enteros, se establecerá la cantidad de objetos en 3.");
            quantity = 3;
        }

        return quantity;
    }

    public static double[] getWeights(Scanner scanner, int quantity) {
        double[] weights = new double[quantity + 1];
        for (int i = 0; i < quantity; i++) {
            try {
                System.out.println("Ingresa peso para el elemento " + (i + 1));
                weights[i] = scanner.nextDouble();
                if (weights[i] <= 0) {
                    System.out.println("No puede haber pesos menor o igual a 0. Se usará 10 como peso por defecto");
                    weights[i] = 10;
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo son validos numeros, se usará 10 como peso por defecto.");
                weights[i] = 10;
            }
        }
        weights[weights.length - 1] = 0;

        return weights;
    }

    public static double[] getValues(Scanner scanner, int quantity) {
        double[] values = new double[quantity + 1];
        for (int i = 0; i < quantity; i++) {
            try {
                System.out.println("Ingresa el valor para el elemento " + (i + 1));
                values[i] = scanner.nextDouble();
                if (values[i] <= 0) {
                    System.out.println("No puede haber valores menor o igual a 0. Se usará 10 como valor por defecto.");
                    values[i] = 10;
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo son validos numeros. Se usará 10 como valor por defecto.");
                values[i] = 10;
            }
        }
        values[values.length - 1] = 0;

        return values;
    }
}
