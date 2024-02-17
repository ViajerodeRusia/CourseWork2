package com.project.CourseWork2.controller;

import com.project.CourseWork2.domain.Question;
import com.project.CourseWork2.service.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping
    public Collection<Question> getQuestions(@RequestParam ("amount") Integer amount) {
        return examinerService.getQuestions(amount);
    }
}
