package com.example.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController {

    @GetMapping(value = "/books/{id}")
    public List <Book> getBooksDetails(@PathVariable("id") Long id) {

        List<Book> book = new ArrayList<>();

        List<Author> authors = new ArrayList<>();
        authors.add(new Author("will"));


        List <ImageUrl> imageUrls = new ArrayList<>();
        imageUrls.add(new ImageUrl("img1"));
        imageUrls.add(new ImageUrl("img2"));

        book.add(new Book("Famous Five", 12, 1500, "Novel", imageUrls, authors));


        return book;

    }
    @GetMapping(value = "/books",headers = "A=1")
    public void getBooks(){
        System.out.println("A");
    }
    @GetMapping(value = "/books",headers = "A=2")
    public void getAllBooks(){
        System.out.println("B");
    }

    @GetMapping(value = "/vehicles")
    public void getVehicles(@RequestParam ("brand") String brand
    , @RequestParam ("model") String model){

        System.out.println("brand "+brand);
        System.out.println("model "+model);
    }

}
