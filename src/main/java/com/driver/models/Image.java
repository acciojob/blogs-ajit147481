package com.driver.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
public class Image{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private String dimensions;
    @ManyToOne
    @JoinColumn
    private Blog blog;

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public Blog getBlog() {
        return blog;
    }

    public int getId() {
        return id;
    }

    public String getDimensions() {
        return dimensions;
    }
}