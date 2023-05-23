package com.harbor.samples.bookInfo.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

import lombok.Getter;
import lombok.Setter;

@Table(name = "book")
@Entity(name = "book")
@Getter
@Setter
public class Book implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String author;

    @Nullable
    private String isbn;
    @Nullable
    private String publisher;

    private long createdAt;

    @Nullable
    private String creditCardNumber;
}
