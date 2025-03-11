package ex1;

public class OrderDeliveredState implements State {
    @Override
    public void doAction(OrderContext context) {
        System.out.println("Order is delivered");
    }
}

