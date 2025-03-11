package ex2;

public class VAT implements TaxStrategy {
    public double calculate(double price) {
        return price * 0.1;
    }
}
