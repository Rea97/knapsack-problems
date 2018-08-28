package me.readeveloper.knapsacks;

import java.util.Arrays;
import java.util.List;

public class KnapsackSolver {
    private List<Item> feasibleSolutions;

    public void solve() {
        Item item1 = new Item("A", 30, 50);
        Item item2 = new Item("B", 50, 40);
        Item item3 = new Item("C", 60, 80);
        BinaryKnapsack knapsack = new BinaryKnapsack(150);

    }
}
