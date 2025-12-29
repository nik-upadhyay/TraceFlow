package com.traceflow.repository;

import com.traceflow.model.Story;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story, Long>{
    
}
