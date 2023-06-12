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
public class UserDTO implements Serializable {
    @Autowired
    @JsonIgnore
    private ModelMapper modelMapper;

    private Long id;

    private String firstName;
    private String lastName;

    private String emailId;
    private String mobileNumber;

    private long createdAt;

    private String loginName;

    private Set<ReviewDTO> reviews;

    public User convertToUser() {
        User user = modelMapper.map(this, User.class);
        return user;
    }
}
