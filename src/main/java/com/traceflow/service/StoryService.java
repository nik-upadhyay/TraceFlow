package com.traceflow.service;

import com.traceflow.dto.CreateStoryRequestDTO;
import com.traceflow.model.Story;
import com.traceflow.repository.StoryRepository;
import com.traceflow.util.InputSanitizer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryService {
    private final StoryRepository storyRepository;

    public StoryService(StoryRepository storyRepository){
        this.storyRepository = storyRepository;
    }
    
    public List<Story> getAllStories(){
        return storyRepository.findAll();
    }

    public Story createStory(CreateStoryRequestDTO request){
        Story story = new Story();
        story.setTitle(InputSanitizer.sanitizeAndValidate(request.getTitle(),"Title"));
        story.setDescription(InputSanitizer.sanitizeAndValidate(request.getDescription(), "Description"));
        story.setAuthor(InputSanitizer.sanitizeAndValidate(request.getAuthor(), "Author"));
        
        return storyRepository.save(story);
    }
}
