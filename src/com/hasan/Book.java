package com.hasan;

import java.util.ArrayList;
import java.util.List;

public class Book implements OrderItem {
    private String isbn, title;
    private List<String> authors = new ArrayList<>();

    public Book() {
    }

    public Book(String isbn, String title, List<String> authors) {
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String author){
        authors.add(author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                '}';
    }

    @Override
    public String getType() {
        return "book";
    }
}
