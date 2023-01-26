package com.driver.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
public class Image{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descriprion;
    private String dimensions;
    @ManyToOne
    @JoinColumn
    private Blog blog;

    public void setId(int id) {
        this.id = id;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }

    public void setDimension(String dimensions) {
        this.dimensions = dimensions;
    }

    public int getId() {
        return id;
    }

    public Blog getBlog() {
        return blog;
    }

    public String getDescriprion() {
        return descriprion;
    }

    public String getDimensions() {
        return dimensions;
    }
}