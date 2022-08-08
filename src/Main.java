import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Topping testTopping = new Topping("Onions", 0.75, true);
        Topping secondTopping = new Topping("Cheese", 0.50, false);
        System.out.println(testTopping);
        Bread testBread = new Bread("White", 0.00);
        System.out.println(testBread);
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(testTopping);
        Hamburger testBurger = new Hamburger("Test Burger", 3.50, testBread, toppingList);
        System.out.println(testBurger);
        testBurger.addTopping(secondTopping);
        testBurger.removeTopping(testTopping);
        System.out.println(testBurger);
        HealthyBurger healthyBurger = new HealthyBurger(4.75, toppingList, testBread);
        healthyBurger.addTopping(secondTopping);
        System.out.println(healthyBurger);
    }
}
