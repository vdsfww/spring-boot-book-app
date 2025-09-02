package org.example.spring.bookStore.repository;

import org.example.spring.bookStore.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}