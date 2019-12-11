package com.ravn.bookshop.controller;

import com.ravn.bookshop.Book;
import com.ravn.bookshop.storage.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class BookController {

    @Autowired
    private BooksRepository booksRepository;

    @GetMapping(value = "/books", produces = { MediaType.APPLICATION_JSON_VALUE})
    public List<Book> getBooks() {
        return booksRepository.findAll();
    }

    @PostMapping(value = "/books", produces = { MediaType.APPLICATION_JSON_VALUE}, consumes = { MediaType.APPLICATION_JSON_VALUE})
    public Book addBook(@RequestBody Book book) {
        return booksRepository.insert(book);
    }

    @PutMapping(value = "/books/{isbn}", produces = { MediaType.APPLICATION_JSON_VALUE}, consumes = { MediaType.APPLICATION_JSON_VALUE})
    public Book updateBook(@PathVariable String isbn, @RequestBody Book book) {
        book.setIsbn(isbn);
        return booksRepository.save(book);
    }

    @DeleteMapping("/books/{isbn}")
    public void deleteBook(@PathVariable String isbn) {
        booksRepository.deleteById(isbn);
    }
}
