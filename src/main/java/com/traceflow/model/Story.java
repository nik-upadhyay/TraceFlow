package com.traceflow.model;

import jakarta.persistence.*;

@Entity
@Table(name = "stories")

public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String title;
    private String description;
    private String author;
    
    public Story(){
    }

    public Story(String title, String description, String author)
    {
        this.title = title;
        this.description = description;
        this.author = author;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getAuthor() { return author; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setAuthor(String author) { this.author = author; }
}
