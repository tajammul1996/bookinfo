package com.harbor.samples.bookInfo.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import lombok.Getter;
import lombok.Setter;

@Table(name = "user")
@Entity(name = "user")
@Getter
@Setter
public class User implements Serializable {
    @Autowired
    @Transient
    private ModelMapper modelMapper;

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;

    private String emailId;
    @Nullable
    private String mobileNumber;

    private long createdAt;

    private String loginName;

    @OneToMany(mappedBy="byUser")
    private Set<Review> reviews;

    public UserDTO convertToDto() {
        UserDTO userDto = modelMapper.map(this, UserDTO.class);
        return userDto;
    }
}
