import java.text.DecimalFormat;

public class Bread {
    private String name;
    private Double additionalPrice;

    public Bread(String name, Double additionalPrice) {
        this.name = name;
        this.additionalPrice = additionalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAdditionalPrice() {
        return additionalPrice;
    }

    public void setAdditionalPrice(Double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return this.name + " $" + df.format(this.additionalPrice);
    }
}
