package org.example.spring.bookstore.service;

import java.util.List;
import org.example.spring.bookstore.model.Book;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
