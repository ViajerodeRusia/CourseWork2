package com.project.CourseWork2.service;

import com.project.CourseWork2.domain.Question;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ExaminerServiceImplTest {
    @Autowired
    QuestionService questionService;
    @Autowired
    ExaminerServiceImpl examinerService;
    private final Question newQuestion1 = new Question("Question1", "Answer1");
    private final Question newQuestion2 = new Question("Question2", "Answer2");
    private final Question newQuestion3 = new Question("Question3", "Answer3");
    private final Question newQuestion4 = new Question("Question4", "Answer4");
    private final Question newQuestion5= new Question("Question5", "Answer5");
    @BeforeEach
    void innit() {
//        questionService.add(newQuestion1);
    }
    @Test
    void getQuestions() {

    }
}