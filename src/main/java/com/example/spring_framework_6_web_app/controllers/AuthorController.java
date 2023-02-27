package com.example.spring_framework_6_web_app.controllers;

import com.example.spring_framework_6_web_app.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @RequestMapping("/authors")
    public String getauthors(Model model) {
        model.addAttribute("authors", authorService.findall());
        return "authors";
    }
}
