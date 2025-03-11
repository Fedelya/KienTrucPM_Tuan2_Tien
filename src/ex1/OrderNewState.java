package ex1;

public class OrderNewState implements State {
    @Override
    public void doAction(OrderContext context) {
        System.out.println("Order is new");
        context.setState(new OrderProcessingState());
    }
}
