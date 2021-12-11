package com.homework;

public class Book {
    private String name;
    private double price;
    private int quantity;
    private String publicationDate;

    public Book() {
    }

    public Book(String name, double price, int quantity, String publicationDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
