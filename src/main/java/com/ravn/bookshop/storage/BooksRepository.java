package com.ravn.bookshop.storage;

import com.ravn.bookshop.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BooksRepository extends MongoRepository<Book, String> {}