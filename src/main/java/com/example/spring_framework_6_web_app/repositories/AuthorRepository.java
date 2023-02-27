package com.example.spring_framework_6_web_app.repositories;

import com.example.spring_framework_6_web_app.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
