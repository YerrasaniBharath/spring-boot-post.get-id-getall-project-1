package com.store.bharath_book_store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Services {

    @Autowired
    private BookRepository bookRepo;

    public void createBook(Book book) {
        bookRepo.save(book);
    }

    public Book getBookById(int id){
//        return bookRepo.getBookById(id);
        return bookRepo.findById(id).orElse(null);
    }

    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }




}
