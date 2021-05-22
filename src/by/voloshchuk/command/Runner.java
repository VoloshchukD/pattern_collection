package by.voloshchuk.command;

import by.voloshchuk.command.model.Cleaner;
import by.voloshchuk.command.model.Cook;
import by.voloshchuk.command.model.Order;
import by.voloshchuk.command.model.Waiter;

public class Runner {
    public static void main(String[] args) {

        Cleaner cleaner = new Cleaner();
        CleaningCommand cookCleaningCommand = new CleaningCommand(cleaner, Cook.workplace);
        Cook cook = new Cook(cookCleaningCommand);

        Waiter waiter = new Waiter(new OrderCommand(cook));
        Order currentOrder = new Order();
        currentOrder.setText("food");
        waiter.takeOrder(currentOrder);
        waiter.orderUp();
        cook.cleanUp();
    }
}
