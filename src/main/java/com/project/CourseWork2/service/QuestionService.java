package com.project.CourseWork2.service;

import com.project.CourseWork2.domain.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface QuestionService {
    Question add(String question, String answer);
    void addAll(List<Question> questions);
    void removeAll();
    Question remove(Question question);
    Collection<Question> getAll();
    Question getRandomQuestion();
}
