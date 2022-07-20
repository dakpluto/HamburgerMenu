import java.text.DecimalFormat;
import java.util.ArrayList;
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

    public void displayCurrentToppings(List<Topping> toppingList) {
        DecimalFormat df = new DecimalFormat("0.00");
        double totalToppings = 0.00;

        System.out.print("Current toppings: ");
        for (Topping t : toppingList) {
            System.out.print(t.getName() + " - $" + df.format(t.getPrice()) + " | ");
            totalToppings += t.getPrice();
        }
        System.out.println("\nTotal Topping Price: " + df.format(totalToppings));
    }

    public List<Topping> selectTopping(List<Topping> toppingList, List<Topping> completeToppingList, int toppingLimit) {
        Scanner scanner = new Scanner(System.in);
        List<Topping> availableToppings = new ArrayList<>();
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
                if(t.healthyOption && !(toppingList.contains(t))){
                    availableToppings.add(t);
                }
            }
            for(Topping top : availableToppings){
                System.out.println(availableToppings.indexOf(top) + ") " + top.getName() + " - $" + top.getPrice());
            }
            System.out.print("Selection: ");
            int toppingInput = scanner.nextInt();
            if (toppingInput > availableToppings.size() || toppingInput < 1) {
                System.out.println("Invalid Selection.  Returning to menu.");
                return toppingList;
            } else if(toppingList.contains(availableToppings.get((toppingInput - 1)))) {
                System.out.println(availableToppings.get((toppingInput - 1)).getName() + " is already on your Burger.  Please try again.");
            }
            else {
                toppingList.add(availableToppings.get((toppingInput - 1)));
                System.out.println(availableToppings.get((toppingInput - 1)).getName() + " added to your burger!");
                return toppingList;
            }
        } catch (Exception e) {
            System.out.println("Invalid Selection. Please try again.");
        }
        return toppingList;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return this.name + " $" + df.format(this.price);
    }
}
