package com.example.jpa.h2.sample.repository;

import com.example.jpa.h2.sample.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean publised);
    List<Tutorial> findByTitle(String title);
}
