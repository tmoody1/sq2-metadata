package com.ravn.bookshop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class Book implements Serializable {

    @Id
    private String isbn;
    private String title;
    private String author;
    private String publishDate;
}
