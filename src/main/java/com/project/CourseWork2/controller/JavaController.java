package com.project.CourseWork2.controller;

import com.project.CourseWork2.domain.Question;
import com.project.CourseWork2.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/java")
public class JavaController {
    private final QuestionService questionService;

    public JavaController(@Autowired QuestionService questionService) {
        this.questionService = questionService;
    }
    //TODO: Добавить: “/exam/java/add?question=QuestionText&answer=QuestionAnswer”
    @GetMapping(path = "/add")
    public Question add(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        return questionService.add(question, answer);
    }
    //TODO: Удалить: “/exam/java/remove?question=QuestionText&answer=QuestionAnswer”
    @PostMapping(path = "/remove") //request body - этот параметр спринг должен достать именно из тела http запроса
    public Question remove(@RequestBody Question question) {
        return questionService.remove(question);
    }
    //TODO: Получить все вопросы: “/exam/java”
    @GetMapping
    public Collection<Question> getRandomQuestion() {
        return questionService.getAll();
    }
}
