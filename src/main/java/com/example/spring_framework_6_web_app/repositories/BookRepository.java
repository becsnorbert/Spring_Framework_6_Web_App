package com.example.spring_framework_6_web_app.repositories;

import com.example.spring_framework_6_web_app.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book, Long> {
}
