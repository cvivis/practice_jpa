package com.example.practicejpa.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "book")
@NoArgsConstructor
public class Book {

    @Id
    private Integer bookId;
    private String bookName;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
