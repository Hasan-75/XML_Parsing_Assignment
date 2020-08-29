package com.hasan;

import jdk.nashorn.internal.runtime.regexp.joni.constants.NodeType;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Order> orders;
    private int numberOfOrders;

    private Store(){
        orders = new ArrayList<>();
    }

    public static Store builder(String filename){
        Store store = new Store();
        store.parseAll(filename);
        return store;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    private void parseAll(String filename){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(filename);
            NodeList list = doc.getElementsByTagName("order");
            for (int o = 0; o < list.getLength(); o++) {
                Node n = list.item(o);
                if(n.getNodeType()==Node.ELEMENT_NODE){
                    Element order = (Element) n;
                    //System.out.println(e.getElementsByTagName("count").item(0).getTextContent());
                    NodeList books = order.getElementsByTagName("book");
                    for(int b=0; b<books.getLength(); b++){
                        Node bn = books.item(b);
                        if(bn.getNodeType()==Node.ELEMENT_NODE){
                            Element book = (Element) bn;
                            Order orderObj = new Order();
                            orderObj.setCount(Integer.parseInt(order.getElementsByTagName("count").item(0).getTextContent()));
                            orderObj.setPrice(order.getElementsByTagName("price").item(0).getTextContent());

                            Book bookObj = new Book();
                            bookObj.setTitle(book.getElementsByTagName("title").item(0).getTextContent());
                            bookObj.setIsbn(book.getElementsByTagName("isbn").item(0).getTextContent());

                            Node authorsNode = book.getElementsByTagName("authors").item(0);
                            NodeList authors = authorsNode.getChildNodes();
                            for(int a=0; a<authors.getLength(); a++){
                                if(authors.item(a).getNodeType()== Node.ELEMENT_NODE){
                                    Element author = (Element) authors.item(a);
                                    bookObj.addAuthor(author.getTextContent());
                                }
                            }
                            orderObj.setBook(bookObj);
                            orders.add(orderObj);
                        }
                    }
                }

            }

            setNumberOfOrders(list.getLength());
            //System.out.println(orders);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Order getOrderWithMaxCount(){
        Order max = null;
        int curMax = 0;
        for(Order o:orders){
            if(o.getCount()>curMax){
                curMax = o.getCount();
                max = o;
            }
        }
        return max;
    }

    public int getCountByBookTitle(String title){
        int c = 0;
        for(Order o : orders){
            if(o.getBook().getTitle().equals(title.trim()))
                c+=o.getCount();
        }
        return c;
    }
}
