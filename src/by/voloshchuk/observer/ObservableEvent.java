package by.voloshchuk.observer;

import java.util.EventObject;

public class ObservableEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ObservableEvent(PublishingHouse source) {
        super(source);
    }

    @Override
    public PublishingHouse getSource() {
        return (PublishingHouse) super.getSource();
    }

}
