package com.traceflow.controller;

import com.traceflow.model.Story;
import com.traceflow.service.StoryService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stories")
public class StoryController {

    private final StoryService storyService;

    public StoryController(StoryService storyService){
        this.storyService = storyService;
    }
    
    @PostMapping
    public Story createStory(@RequestBody Story story){
        return storyService.createStory(story);
    }

    @GetMapping
    public List<Story> getStories(){
        return storyService.getAllStories();
    }
}
