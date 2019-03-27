package concrete_iterator;

import bean.Dish;
import inter.Iterator;

import java.util.ArrayList;

public class BRestaurantMenuIterator implements Iterator<Dish> {
    private ArrayList<Dish> dishes = new ArrayList<>();
    public BRestaurantMenuIterator(ArrayList<Dish> dishes){
        this.dishes = dishes;
    }

    private int position = 0; //记录当前的位置
    @Override
    public boolean hasMore() {
        if(position >= dishes.size() || dishes.get(position) == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Dish next() {
        Dish dish = dishes.get(position);
        position = position + 1;
        return dish;
    }
}
