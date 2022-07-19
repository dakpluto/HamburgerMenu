import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class Topping {
    private String name;
    private Double price;
    private boolean healthyOption;

    public Topping (String name, Double price, boolean healthyOption) {
        this.name = name;
        this.price = price;
        this.healthyOption = healthyOption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isHealthyOption() {
        return healthyOption;
    }

    public void setHealthyOption(boolean healthyOption) {
        this.healthyOption = healthyOption;
    }

    public List<Topping> selectTopping(List<Topping> toppingList, List<Topping> completeToppingList, int toppingLimit) {
        Scanner scanner = new Scanner(System.in);
        List<Topping> returnToppingList = toppingList;
        try {
            if (toppingList.size() > toppingLimit) {
                System.out.println("Too many toppings!  You need to remove some.");
                return toppingList;
            } else if (toppingList.size() == toppingLimit) {
                System.out.println("Maximum number of toppings reached.  Unable to add more toppings.");
                return toppingList;
            }
            System.out.println("Please select a topping to add to your Hamburger: ");
            for (Topping t : completeToppingList) {
                for(Topping tl : toppingList) {
                    if(t.healthyOption && )
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid Selection please try again.");
        }
        return returnToppingList;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return this.name + " $" + df.format(this.price);
    }
}
