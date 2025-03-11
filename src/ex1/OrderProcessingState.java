package ex1;

public class OrderProcessingState implements State {
    @Override
    public void doAction(OrderContext context) {
        System.out.println("Order is processing");
        context.setState(new OrderDeliveredState());
    }
}

