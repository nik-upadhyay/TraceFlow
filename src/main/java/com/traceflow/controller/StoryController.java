package com.traceflow.controller;

import com.traceflow.dto.*;
import com.traceflow.model.Story;
import com.traceflow.service.StoryService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/stories")
public class StoryController {

    private final StoryService storyService;

    public StoryController(StoryService storyService){
        this.storyService = storyService;
    }
    
    @PostMapping
    public StoryResponseDTO createStory(@Valid @RequestBody CreateStoryRequestDTO request){
        Story story = storyService.createStory(request);
        return new StoryResponseDTO(story.getId(), story.getTitle(), story.getDescription(), story.getAuthor());
    }

    @GetMapping
    public List<StoryResponseDTO> getStories(){
        return storyService.getAllStories()
        .stream()
        .map(story -> new StoryResponseDTO(story.getId(), story.getTitle(), story.getDescription(), story.getAuthor()))
        .collect(Collectors.toList()
    );
    }
}
