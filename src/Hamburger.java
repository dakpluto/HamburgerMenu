import java.text.DecimalFormat;
import java.util.List;

public class Hamburger {
    private String name;
    private double price;
    private Bread breadType;
    private List<Topping> toppingList;
    private int toppingLimit;

    public Hamburger(String name, double price, Bread breadType, List<Topping> toppingList) {
        this.name = name;
        this.price = price;
        this.breadType = breadType;
        this.toppingList = toppingList;
        this.toppingLimit = 4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Bread getBreadType() {
        return breadType;
    }

    public void setBreadType(Bread breadType) {
        this.breadType = breadType;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public void setToppingList(List<Topping> toppingList) {
        this.toppingList = toppingList;
    }

    public int getToppingLimit() {
        return toppingLimit;
    }

    public void setToppingLimit(int toppingLimit) {
        this.toppingLimit = toppingLimit;
    }

    public double totalPrice() {
        double totalPrice = this.price;
        for (Topping topping : toppingList) {
            totalPrice += topping.getPrice();
        }
        totalPrice += this.breadType.getAdditionalPrice();
        return totalPrice;
    }

    public String displayToppingList() {
        DecimalFormat df = new DecimalFormat("0.00");
        StringBuilder sb = new StringBuilder().append("Toppings: ");
        for (Topping topping : toppingList) {
            sb.append("\n\t").append(topping.getName()).append(" $").append(df.format(topping.getPrice()));
        }
        return sb.toString();
    }

    public void addTopping(Topping topping) {
        if (this.toppingList.size() == toppingLimit) {
            System.out.println("Maximum amount of toppings has been added.");
        } else {
            toppingList.add(topping);
            System.out.println(displayToppingList());
        }
    }

    public void removeTopping(Topping topping) {
        this.toppingList.removeIf(t -> t == topping);
        System.out.println(displayToppingList());
    }

    @Override
    public String toString() {
        return this.name + "\nBread: " + breadType.getName() + "\n" + displayToppingList() + "\nPrice: $" + totalPrice();
    }
}
