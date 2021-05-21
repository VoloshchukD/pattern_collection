package by.voloshchuk.command;

import by.voloshchuk.command.model.Cleaner;
import by.voloshchuk.command.model.Workplace;

public class CleaningCommand implements Command {

    private Cleaner cleaner;

    private Workplace workplace;

    public CleaningCommand(Cleaner cleaner, Workplace workplace) {
        this.cleaner = cleaner;
        this.workplace = workplace;
    }

    @Override
    public void execute() {
        cleaner.cleanUp(workplace);
    }

}
