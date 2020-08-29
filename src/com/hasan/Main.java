
package com.hasan;

public class Main {

    public static void main(String[] args) {

        Store myStore = Store.builder("orders.xml");
        Order max = myStore.getOrderWithMaxCount();

        System.out.println("############### Print info of the order with max count #################");
        System.out.println("Count: " + max.getCount());
        System.out.println("Title: " + ((Book)max.getOrderItem()).getTitle());
        System.out.println("Price: " + max.getPrice());

        System.out.println();
        System.out.println();

        System.out.println("############### Print count of a book by title #################");
        String title = "Core Web Programming Second Edition";
        System.out.println("Title: " + title);
        System.out.println("Total Count: " + myStore.getCountByBookTitle(title));
        System.out.println();

    }
}


