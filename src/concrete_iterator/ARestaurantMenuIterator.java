package concrete_iterator;

import bean.Dish;
import inter.Iterator;

public class ARestaurantMenuIterator implements Iterator<Dish> {
    private Dish[] dishes;
    public ARestaurantMenuIterator(Dish[] dishes){
        this.dishes = dishes;
    }

    private int position = 0; //记录当前的位置
    @Override
    public boolean hasMore() {
        if(position >= dishes.length || dishes[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Dish next() {
        Dish dish = dishes[position];
        position = position + 1;
        return dish;
    }
}
