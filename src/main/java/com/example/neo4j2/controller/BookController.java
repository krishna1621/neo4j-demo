package com.example.neo4j2.controller;


import com.example.neo4j2.Node.Book;
import com.example.neo4j2.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
        Book books = bookRepository.save(book);
        return books;
    }

    @GetMapping("/getBooks")
    public List<Book> allBooks (){
       List<Book>  book = bookRepository.findAll();
        return book;
    }

    @GetMapping("/{id}")
    public Book getBooks( @PathVariable int id){
        Book book1 = bookRepository.findBybookId(id);
        return book1;

    }
    @GetMapping("/{id}")
    public Book getBooksIn( @PathVariable int id) {
        Book book1 = bookRepository.findBybook(id);
        return book1;
    }
}
