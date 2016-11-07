package se.jku.at.ubifood.Order;

/**
 * Created by Thomas on 04.11.2016.
 */

public class Ingredient {

    public Ingredient(String name, int amount, float price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    private String name;
    private int amount;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
