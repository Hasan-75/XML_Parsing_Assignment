package com.hasan;

public class Order {
    private int count;
    private String price;
    private Book book;

    public Order() {
    }

    public Order(int count, String price, Book book) {
        this.count = count;
        this.price = price;
        this.book = book;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Order{" +
                "count=" + count +
                ", price='" + price + '\'' +
                ", book=" + book +
                '}';
    }
}
