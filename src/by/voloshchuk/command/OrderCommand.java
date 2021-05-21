package by.voloshchuk.command;

import by.voloshchuk.command.model.Cook;
import by.voloshchuk.command.model.Order;

public class OrderCommand implements Command {

    private Order order;

    private Cook cook;

    public OrderCommand(Cook cook) {
        this.cook = cook;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Cook getCook() {
        return cook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.cook(order);
    }

}
