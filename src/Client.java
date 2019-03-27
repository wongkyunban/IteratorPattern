import bean.Dish;
import concrete_agg.ARestaurantMenuAggregate;
import concrete_agg.BRestaurantMenuAggregate;
import inter.Iterator;

public class Client {


    public void showMenu(){
        ARestaurantMenuAggregate aCollection = new ARestaurantMenuAggregate();
        BRestaurantMenuAggregate bCollection = new BRestaurantMenuAggregate();

        Iterator<Dish> iteratorA = aCollection.createIterator();
        Iterator<Dish> iteratorB = bCollection.createIterator();

        printMenu(iteratorA);
        printMenu(iteratorB);
    }

    public void printMenu(Iterator<Dish> iterator){
        while (iterator.hasMore()){
            Dish dish = iterator.next();
            String dec = "Dish Name:"+dish.getDishName() +"\nDiscription:"+dish.getDescription()+"\nPrice:"+dish.getPrice();
            System.out.println(dec);
            System.out.print("\n\n");
        }
    }

}
