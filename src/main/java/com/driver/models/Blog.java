package com.driver.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String content;
    private Date pubDate;
    @OneToMany(mappedBy = "blog",cascade = CascadeType.ALL)
    private List<Image> imageList;
    @ManyToOne
    @JoinColumn
    private User user;

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public User getUser() {
        return user;
    }
}