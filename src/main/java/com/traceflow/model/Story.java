package com.traceflow.model;

public class Story {

    private Long id;
    private String title;
    private String description;
    private String module;
    
    //constructor
    public Story(Long id, String title, String description, String module)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        this.module = module;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getModule() { return module; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setModule(String module) { this.module = title; }
}
