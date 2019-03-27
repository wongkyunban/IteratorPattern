package concrete_agg;

import bean.Dish;
import concrete_iterator.BRestaurantMenuIterator;
import inter.Aggregate;
import inter.Iterator;

import java.util.ArrayList;

public class BRestaurantMenuAggregate implements Aggregate<Dish> {
    private ArrayList<Dish> dishes = new ArrayList<>();
    public BRestaurantMenuAggregate(){

        Dish dish1 = new Dish("B: potato curry","cook patato and curry together",10);
        Dish dish2 = new Dish("B: potato curry","cook patato and curry together",14);
        Dish dish3 = new Dish("B: chicken tomato","fry chicken,water pot tomato",16);
        Dish dish4 = new Dish("B: cheese egg","fry egg and egg",17);
        Dish dish5 = new Dish("B: potato chicken","cook patato and chicken together",19);
        Dish dish6 = new Dish("B: potato onion chicken","cook potato onion and chicken with electric cooker",41);
        dishes.add(dish1);
        dishes.add(dish2);
        dishes.add(dish3);
        dishes.add(dish4);
        dishes.add(dish5);
        dishes.add(dish6);

    }

    @Override
    public Iterator<Dish> createIterator() {

        return new BRestaurantMenuIterator(dishes);
    }
}
