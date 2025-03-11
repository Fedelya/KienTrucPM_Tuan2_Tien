package ex2;

public class Demo {
    public static void main(String[] args) {
        Product book = new Product("Book", 100, new ConsumptionTax());
        Product phone = new Product("Phone", 5000, new VAT());
        Product car = new Product("Car", 100000, new LuxuryTax());
        System.out.println(book);
        System.out.println(phone);
        System.out.println(car);
    }
}
