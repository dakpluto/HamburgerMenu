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

    public Topping selectTopping(List<Topping> toppingList, boolean healthyOptionCheck) {
        Scanner scanner = new Scanner(System.in);
        Topping topping = null;
        System.out.println("Please select a topping to add to your Hamburger: ");
        for(int i = 0; i < toppingList.size(); i++) {
            if(healthyOptionCheck && toppingList.)
        }

        return topping;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return this.name + " $" + df.format(this.price);
    }
}
