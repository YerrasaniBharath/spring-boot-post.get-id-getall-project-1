package com.store.bharath_book_store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/bookstore")
public class ControllerBarath {
/*
POST -> Store into Database
GET  -> Fetch from database and sent back to frontend
PUT  -> Update the already available book in the database
DELETE -> Delete the book
 */
    @Autowired
    private Services bookServices;


    @PostMapping("/book")
    public String createBook(@RequestBody Book book){
        bookServices.createBook(book);
        return "Book Stored in DB";
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable int id){
        return bookServices.getBookById(id);
    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookServices.getAllBooks();
    }






}