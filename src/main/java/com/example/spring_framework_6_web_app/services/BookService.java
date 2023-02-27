package com.example.spring_framework_6_web_app.services;

import com.example.spring_framework_6_web_app.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
