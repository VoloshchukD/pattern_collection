package by.voloshchuk.observer;

import java.util.Objects;

public class Reader implements Observer {

    private int id;

    public Reader() {
    }

    public Reader(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void update(ObservableEvent event) {
        System.out.println(id + " reader get: " + event.getSource().getNewReading());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return id == reader.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                '}';
    }

}
