package com.example.best_blog_writer_game.model;

import jakarta.persistence.*;

@Entity
public class BlogEntry {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id ;
    private String author;
    @Column(length = 500)
    private String text;

    private int referenceCount;

    // Constructors
    public BlogEntry() {
    }
    public BlogEntry(String author, String text, int referenceCount) {
        this.author = author;
        this.text = text;
        this.referenceCount = referenceCount;
    }
    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public int getReferenceCount() {
        return referenceCount;
    }
    public void setReferenceCount(int referenceCount) {
        this.referenceCount = referenceCount;
    }
}
