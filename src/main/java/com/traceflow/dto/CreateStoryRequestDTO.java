package com.traceflow.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateStoryRequestDTO {

    @NotBlank(message = "Title cannot be blank")
    @Size(max = 255, message = "Title too long")
    @Size(min = 4, message = "Title min length : 4")
    private String title;

    @NotBlank(message = "Description cannot be blank!")
    private String description;

    @NotBlank(message = "Author name cannot be blank!")
    @Size(max = 50, message = "Author Name too long")
    @Size(min = 2, message = "Author Name min length : 2")
    private String author;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    
}
