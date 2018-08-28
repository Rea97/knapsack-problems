package me.readeveloper.knapsacks;

import java.util.List;

public class BinaryKnapsack {
    private int maxSize = 4;
    private int weightCapacity;

    private List<Item> items;

    private List<Item> infeasibleItems;

    public BinaryKnapsack(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    public int getWeightCapacity() {
        return this.weightCapacity;
    }

    public BinaryKnapsack add(Item item) throws Exception {
        if (this.getWeightCapacity() < item.getWeight()) {
            this.infeasibleItems.add(item);
            return this;
        }

        if (this.items.size() == this.maxSize) {
            throw new Exception("Cantidad máxima alcanzada");
        }

        this.items.add(item);

        return this;
    }
}
