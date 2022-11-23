package com.example.practicejpa.repository;

import com.example.practicejpa.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Author, Integer> {
}
