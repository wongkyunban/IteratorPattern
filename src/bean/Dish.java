package bean;

public class Dish {
    private String dishName;
    private String description;
    private int price;

    public Dish(String dishName,String description,int price){

        this.dishName = dishName;
        this.description = description;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }
}
