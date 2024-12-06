package com.example.library;

import lombok.Getter;

import java.util.List;

@Getter
public class Book {

    String name;
    int isbn;
    double price;
    String category;
    List<ImageUrl> image;
    List<Author> author;

    public Book(String name, int isbn, double price, String category, List<ImageUrl> image, List<Author> author) {
        this.name = name;
        this.isbn = isbn;
        this.price = price;
        this.category = category;
        this.image = image;
        this.author = author;
    }
}

