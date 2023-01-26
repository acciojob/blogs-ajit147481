package com.driver.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("user")
    private List<Blog> blogList;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    public List<Blog> getBlogList() {
        return blogList;
    }
}