package com.project.CourseWork2.service;

import com.project.CourseWork2.domain.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(Integer amount) {
        Set<Question> selectedQuestions = new HashSet<>();
        while (selectedQuestions.size() < amount) {
            selectedQuestions.add(questionService.getRandomQuestion());
        }
        return selectedQuestions;
    }
}
