package org.example.spring.bookStore.service;

import org.example.spring.bookStore.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
