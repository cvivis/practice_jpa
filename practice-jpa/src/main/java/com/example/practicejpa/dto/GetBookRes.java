package com.example.practicejpa.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class GetBookRes {
    private Integer bookId;
    private String bookName;
    private String authorName;
}
