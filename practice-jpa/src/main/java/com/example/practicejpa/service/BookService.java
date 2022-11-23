package com.example.practicejpa.service;

import com.example.practicejpa.domain.Author;
import com.example.practicejpa.domain.Book;
import com.example.practicejpa.dto.GetBookRes;
import com.example.practicejpa.repository.AuthorRepository;
import com.example.practicejpa.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public List<GetBookRes> getBookList() {
        List<Book> books = bookRepository.findAll();
        List<GetBookRes> getBooks = new ArrayList<>();
        for (Book book : books) {
            Optional<Author> author = authorRepository.findById(book.getAuthor().getAuthorId());
            getBooks.add(GetBookRes.builder()
                    .bookId(book.getBookId())
                    .bookName(book.getBookName())
                    .authorName(author.get().getName())
                    .build());
        }
        return getBooks;
    }
}
