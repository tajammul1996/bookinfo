package com.harbor.samples.bookInfo.models;

import java.io.Serializable;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDTO implements Serializable {
    @Autowired
    @JsonIgnore
    private ModelMapper modelMapper;

    private Long id;

    private int rating;
    private String comment;

    private String sentiment;

    private long createdAt;

    private Long byUserId;

    private Long forBookId;

    public Review convertToReview() {
        Review review = modelMapper.map(this, Review.class);
        return review;
    }
}
