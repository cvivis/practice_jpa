package com.example.practicejpa.controller;


import com.example.practicejpa.domain.Book;
import com.example.practicejpa.dto.GetBookRes;
import com.example.practicejpa.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<GetBookRes>> getBookList(){
        List<GetBookRes> books = bookService.getBookList();
        return ResponseEntity.ok().body(books);
    }


}
