import java.util.List;

public class DeluxeBurger extends Hamburger{
    private Drink drink;
    private Side side;

    public DeluxeBurger(String name, double price, Bread breadType, List<Topping> toppingList, Drink drink, Side side) {
        super(name, price, breadType, toppingList);
        this.drink = drink;
        this.side = side;
        setToppingLimit(4);
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    @Override
    public double totalPrice() {
        double totalPrice = this.getPrice();
        for (Topping topping : getToppingList()) {
            totalPrice += topping.getPrice();
        }
        totalPrice += (this.getBreadType().getAdditionalPrice() + this.side.getPrice() + this.drink.getPrice());
        return totalPrice;
    }



}
