package com.homework;

public class Science extends Book {
    private String type;

    public Science() {
    }

    public Science(String name, double price, int quantity, String publicationDate, String type) {
        super(name, price, quantity, publicationDate);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Science book has type of " + this.type+ " " + super.toString();
    }
}
