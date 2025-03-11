package ex1;

public class OrderCanceledState implements State {
    @Override
    public void doAction(OrderContext context) {
        System.out.println("Order is canceled");
    }
}