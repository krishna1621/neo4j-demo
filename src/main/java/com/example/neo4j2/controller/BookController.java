package com.example.neo4j2.controller;


import com.example.neo4j2.Node.Book;
import com.example.neo4j2.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Allbook")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @PostMapping
    public Book addBook(@RequestBody Book book){
        Book books = bookRepository.save(book);
        return books;
    }

    @GetMapping
    public List<Book> allBooks (){
       List<Book>  book = bookRepository.findAll();
        return book;
    }

    @GetMapping("/{id}")
    public Book getBooks( @PathVariable int id){
        Book book1 = bookRepository.findById(id);
        return book1;

    }
}
