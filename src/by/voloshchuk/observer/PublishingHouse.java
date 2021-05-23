package by.voloshchuk.observer;

import java.util.List;

public class PublishingHouse implements Observable {

    private List<Reading> readings;

    private List<Observer> observers;

    public PublishingHouse() {
    }

    public Reading getNewReading() {
        return readings.get(readings.size() - 1);
    }

    public PublishingHouse(List<Observer> observers, List<Reading> readings) {
        this.observers = observers;
        this.readings = readings;
    }

    public void addReading(Reading reading) {
        if (readings != null) {
            readings.add(reading);
        }
        notifyObservers();
    }

    public void removeReading(Reading reading) {
        if (readings != null) {
            readings.remove(reading);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        if (observers != null) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers != null) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        ObservableEvent event = new ObservableEvent(this);
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

}
