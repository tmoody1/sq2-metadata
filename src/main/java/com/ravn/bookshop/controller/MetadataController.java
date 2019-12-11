package com.ravn.bookshop.controller;

import com.ravn.bookshop.Book;
import com.ravn.bookshop.storage.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class MetadataController {

    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return booksRepository.findAll();
    }

    @PostMapping("/books")
    public Book addBook(Book book) {
        return booksRepository.insert(book);
    }
}
