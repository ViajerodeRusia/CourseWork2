package com.project.CourseWork2.service;

import com.project.CourseWork2.domain.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {
    private JavaQuestionService questionService;
    private List<Question> questionList;
    private final Question newQuestion1 = new Question("Question1", "Answer1");
    private final Question newQuestion2 = new Question("Question2", "Answer2");

    @BeforeEach
    void setUp() {
        questionList = new ArrayList<>();
        questionService = new JavaQuestionService(questionList);
    }

    @Test
    void add() {
        assertTrue(questionList.contains(newQuestion1));
    }

    @Test
    void remove() {
        questionList.add(newQuestion1);
        assertNotNull(questionService.remove(newQuestion1));
        assertFalse(questionList.contains(newQuestion1));
    }

    @Test
    void getAll() {
        questionList.add(newQuestion1);
        questionList.add(newQuestion2);
        assertEquals(2,questionList.size());
    }

    @Test
    void getRandomQuestion() {
        questionList.add(newQuestion1);
        questionList.add(newQuestion2);
        Question randomQuestion = questionService.getRandomQuestion();
        assertTrue(questionList.contains(randomQuestion));
    }
}