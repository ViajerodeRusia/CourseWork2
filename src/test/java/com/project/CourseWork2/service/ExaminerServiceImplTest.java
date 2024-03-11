package com.project.CourseWork2.service;

import com.project.CourseWork2.domain.Question;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
        questionService.addAll(new ArrayList<>(List.of(
                newQuestion1,
                newQuestion2,
                newQuestion3,
                newQuestion4,
                newQuestion5
        )));
    }
    @AfterEach
    void destruction() {
        questionService.removeAll();
    }
    @Test
    void getQuestions() {
        Collection<Question> actual = examinerService.getQuestions(4);
        Assertions.assertThat(actual.size()).isEqualTo(4);
        Collection<Question> allQuestions = questionService.getAll();
        Assertions.assertThat(allQuestions).containsAll(actual);
    }
}