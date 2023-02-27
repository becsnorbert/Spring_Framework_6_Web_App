package com.example.spring_framework_6_web_app.services;

import com.example.spring_framework_6_web_app.domain.Book;
import com.example.spring_framework_6_web_app.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
