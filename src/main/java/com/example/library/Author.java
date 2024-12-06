package com.example.library;

import lombok.Getter;

import java.util.List;

@Getter
public class Author {

    String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }
}
