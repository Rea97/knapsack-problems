package me.readeveloper.knapsacks;

public class Item {
    private String name;

    private int weight;

    private int benefit;

    public Item(String name, int weight, int benefit) {
        this.name = name;
        this.weight = weight;
        this.benefit = benefit;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getBenefit() {
        return this.benefit;
    }

    public String getName() {
        return this.name;
    }
}
