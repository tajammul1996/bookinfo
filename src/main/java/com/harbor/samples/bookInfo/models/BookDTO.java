package com.harbor.samples.bookInfo.models;

import java.io.Serializable;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO implements Serializable {
    @Autowired
    @JsonIgnore
    private ModelMapper modelMapper;

    private Long id;

    private String title;
    private String author;
    private String isbn;
    private String publisher;

    private long createdAt;

    private String creditCardNumber;
    private Set<ReviewDTO> reviews;

    public Book convertToBook() {
        Book book = modelMapper.map(this, Book.class);
        return book;
    }
}
