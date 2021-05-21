package by.voloshchuk.command.model;

import by.voloshchuk.command.CleaningCommand;

public class Cook {

    private CleaningCommand cleaningCommand;

    public static Workplace workplace = Workplace.KITCHEN;

    public Cook(CleaningCommand cleaningCommand) {
        this.cleaningCommand = cleaningCommand;
    }

    public CleaningCommand getCleaningCommand() {
        return cleaningCommand;
    }

    public void setCleaningCommand(CleaningCommand cleaningCommand) {
        this.cleaningCommand = cleaningCommand;
    }

    public void cook(Order order) {
        System.out.println(order.getText() + " done");
    }

    public void cleanUp() {
        cleaningCommand.execute();
    }

}
