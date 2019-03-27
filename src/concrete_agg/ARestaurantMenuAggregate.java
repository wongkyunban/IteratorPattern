package concrete_agg;

import bean.Dish;
import concrete_iterator.ARestaurantMenuIterator;
import inter.Aggregate;
import inter.Iterator;

public class ARestaurantMenuAggregate implements Aggregate<Dish> {
    private Dish[] dishes;
    public ARestaurantMenuAggregate(){
        dishes = new Dish[]{new Dish("potato curry","cook patato and curry together",10),
                new Dish("potato curry","cook patato and curry together",14),
                new Dish("chicken tomato","fry chicken,water pot tomato",16),
                new Dish("cheese egg","fry egg and egg",17),
                new Dish("potato chicken","cook patato and chicken together",19),
                new Dish("potato onion chicken","cook potato onion and chicken with electric cooker",41)};
    }

    @Override
    public Iterator<Dish> createIterator() {

        return new ARestaurantMenuIterator(dishes);
    }
}
