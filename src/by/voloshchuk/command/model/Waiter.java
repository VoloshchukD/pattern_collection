package by.voloshchuk.command.model;

import by.voloshchuk.command.OrderCommand;

public class Waiter {

    private OrderCommand orderCommand;

    public Waiter(OrderCommand orderCommand) {
        this.orderCommand = orderCommand;
    }

    public void takeOrder(Order order) {
        orderCommand.setOrder(order);
    }

    public void orderUp() {
        orderCommand.execute();
    }

}
