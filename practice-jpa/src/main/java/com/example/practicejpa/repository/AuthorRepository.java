package com.example.practicejpa.repository;

import com.example.practicejpa.domain.Author;
import com.example.practicejpa.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
