package com.hasan;

public class Order {
    private int count;
    private String price;
    private OrderItem orderItem;

    public Order() {
    }

    public Order(int count, String price, OrderItem orderItem) {
        this.count = count;
        this.price = price;
        this.orderItem = orderItem;
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

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public String toString() {
        return "Order{" +
                "count=" + count +
                ", price='" + price + '\'' +
                ", orderItem=" + orderItem +
                '}';
    }
}
