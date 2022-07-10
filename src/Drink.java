import java.text.DecimalFormat;

public class Drink {
    private String name;
    private double price;

    public Drink(String name, String size) {
        this.name = name;
        if(size.equals("small")){
            price = 0.99;
        }
        if(size.equals("medium")){
            price = 1.49;
        }
        if(size.equals("large")){
            price = 1.99;
        }
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

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return this.name + " $" + df.format(this.price);
    }
}
