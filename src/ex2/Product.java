package ex2;

public class Product {
    private String name;
    private double price;
    private TaxStrategy taxStrategy;

    public Product(String name, double price, TaxStrategy taxStrategy) {
        this.name = name;
        this.price = price;
        this.taxStrategy = taxStrategy;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return taxStrategy.calculate(price);
    }

    public double getPriceWithTax() {
        return price + getTax();
    }

    public String toString() {
        return name + ": " + getPriceWithTax();
    }
}
