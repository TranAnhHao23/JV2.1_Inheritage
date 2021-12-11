package com.homework;

public class Novel extends Book {
    private String author;

    public Novel() {
    }

    public Novel(String name, double price, int quantity, String publicationDate, String author) {
        super(name, price, quantity, publicationDate);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Author of this novel is " + this.author+ " " + super.toString();
    }
}
