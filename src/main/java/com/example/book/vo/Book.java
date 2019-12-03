package com.example.book.vo;

public class Book {

    private String name;

    private long price;

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Book(String name, long price) {
        this.name = name;
        this.price = price;
    }
}
