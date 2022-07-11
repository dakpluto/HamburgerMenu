import java.util.List;

public class HealthyBurger extends Hamburger{
    public HealthyBurger(double price, List<Topping> toppingList, Bread bread) {
        super("Deluxe Burger", price, bread,toppingList);
        setToppingLimit(6);
    }
}
