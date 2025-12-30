package com.traceflow.service;

import com.traceflow.model.Story;
import com.traceflow.repository.StoryRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryService {
    private final StoryRepository storyRepository;

    public StoryService(StoryRepository storyRepository){
        this.storyRepository = storyRepository;
    }

    public Story createStory(Story story){
        return storyRepository.save(story);
    }
    
    public List<Story> getAllStories(){
        return storyRepository.findAll();
    }

    public Story createStory(String title, String description){
        Story story = new Story();
        story.setTitle(title);
        story.setDescription(description);
        return storyRepository.save(story);
    }
}
