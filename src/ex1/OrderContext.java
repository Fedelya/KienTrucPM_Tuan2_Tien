package ex1;

public class OrderContext {
    private State state;

    public OrderContext() {
        this.state = new OrderNewState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public void processOrder() {
        this.state.doAction(this);
    }
}
