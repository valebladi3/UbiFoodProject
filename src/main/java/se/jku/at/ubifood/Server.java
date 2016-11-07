package se.jku.at.ubifood;

import java.util.ArrayList;
import java.util.List;

import se.jku.at.ubifood.Order.Ingredient;
import se.jku.at.ubifood.Settings.ShopDataContainer;

/**
 * Created by Thomas on 04.11.2016.
 */

public class Server {
    public static List<ShopDataContainer> GetShopData(){
        List<ShopDataContainer> shopDataContainer = new ArrayList<>();
        shopDataContainer.add(new ShopDataContainer("Penny", "Johann-Wilhelm-Klein-Straße 50, 4040 Linz", "8h"));
        shopDataContainer.add(new ShopDataContainer("Spar", "Johann-Wilhelm-Klein-Straße 13, 4040 Linz", "10h"));
        shopDataContainer.add(new ShopDataContainer("Billa AG", "Dornacher Str. 3, 4040 Linz", "12h"));
        shopDataContainer.add(new ShopDataContainer("Konditorei Preining", "Dornacher Str. 13, 4040 Linz", "24h"));
        shopDataContainer.add(new ShopDataContainer("Amazon", "-", "24h"));
        shopDataContainer.add(new ShopDataContainer("Dornacher Stub'n", "Niedermayrweg 7, 4040 Linz", "48h"));
        return shopDataContainer;
    }

    public static List<Ingredient> GetCurrentWeekingredients(int weekNumber){
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("Zucchini", 9, 4.5f));
        ingredients.add(new Ingredient("Chicken meat", 14, 34.99f));
        ingredients.add(new Ingredient("Sugar", 1, 0.99f));
        ingredients.add(new Ingredient("Milk", 10, 0.95f));
        ingredients.add(new Ingredient("Cheese", 4, 15.0f));
        ingredients.add(new Ingredient("Tee", 4, 4.99f));
        ingredients.add(new Ingredient("Rice", 1, 8.25f));
        ingredients.add(new Ingredient("Butter", 2, 4.5f));
        ingredients.add(new Ingredient("Fish", 6, 34.85f)); //
        ingredients.add(new Ingredient("Pepper", 1, 2.9f));
        ingredients.add(new Ingredient("Salt", 1, 2.9f));
        ingredients.add(new Ingredient("Yogurt", 7, 0.99f));
        ingredients.add(new Ingredient("Vanilla", 2, 2.15f));
        ingredients.add(new Ingredient("Flour", 35, 9.99f));
        ingredients.add(new Ingredient("Salsa", 1, 2.99f));
        ingredients.add(new Ingredient("Chips", 2, 0.99f));
        ingredients.add(new Ingredient("Beer", 9999, 0.01f));
        ingredients.add(new Ingredient("Carrots", 6, 4.99f));
        ingredients.add(new Ingredient("Pasta", 6, 2.85f));
        return ingredients;
    }
}
