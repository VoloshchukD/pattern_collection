package by.voloshchuk.observer;

import java.util.Objects;

public class Reading {

    private String name;

    private String author;

    private String text;

    public Reading() {
    }

    public Reading(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reading reading = (Reading) o;
        return Objects.equals(name, reading.name) && Objects.equals(author, reading.author)
                && Objects.equals(text, reading.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, text);
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "@name=" + name +
                ", author=" + author +
                ", text=" + text;
    }

}
