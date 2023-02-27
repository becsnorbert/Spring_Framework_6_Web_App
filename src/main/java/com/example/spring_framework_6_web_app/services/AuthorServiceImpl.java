package com.example.spring_framework_6_web_app.services;

import com.example.spring_framework_6_web_app.domain.Author;
import com.example.spring_framework_6_web_app.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findall() {
        return authorRepository.findAll();
    }
}
