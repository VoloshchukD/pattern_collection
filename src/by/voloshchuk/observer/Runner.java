package by.voloshchuk.observer;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        PublishingHouse publishingHouse = new PublishingHouse(new ArrayList<>(), new ArrayList<>());
        Reading reading = new Reading("A", "A", "A");
        Reading reading2 = new Reading("D", "D", "D");

        Reader reader = new Reader(1);
        Reader reader2 = new Reader(2);

        publishingHouse.addObserver(reader);
        publishingHouse.addObserver(reader2);
        publishingHouse.addReading(reading);
        publishingHouse.addReading(reading2);

    }
}
