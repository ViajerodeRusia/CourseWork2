package com.project.CourseWork2.service;

import com.project.CourseWork2.domain.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public interface QuestionService {
    Question add(String question, String answer);
    Question remove(Question question);
    Collection<Question> getAll();
    Question getRandomQuestion();
}
