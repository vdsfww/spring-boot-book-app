package org.example.spring.bookStore.service;

import lombok.RequiredArgsConstructor;
import org.example.spring.bookStore.model.Book;
import org.example.spring.bookStore.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
