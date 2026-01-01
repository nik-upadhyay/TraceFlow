package com.traceflow.dto;

public class StoryResponseDTO {

    private Long id;
    private String title;
    private String description;
    private String author;

    public StoryResponseDTO(Long id, String title, String description, String author){
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
    }

    // Getters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getAuthor() {return author; }
    
}
