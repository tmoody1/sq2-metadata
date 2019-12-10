package com.ravn.bookshop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class Book implements Serializable {
private String title;
private String author;
private String publishDate;
private String isbn;
}
