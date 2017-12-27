package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

    @Value("${book.name}")
    private String name;
    @Value("${book.author}")
    private String author;

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "The book,name: " + name + ",author: " + author;
    }
}
