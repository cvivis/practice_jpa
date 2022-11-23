package com.example.practicejpa.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "author")
@NoArgsConstructor
public class Author {

    @Id
    private Integer authorId;
    private String name;

}
