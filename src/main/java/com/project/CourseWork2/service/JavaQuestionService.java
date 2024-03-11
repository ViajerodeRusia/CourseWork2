package com.project.CourseWork2.service;

import com.project.CourseWork2.domain.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    private List<Question> questionList = new ArrayList<>();
    Random random = new Random();

    public JavaQuestionService() {
    }

    public JavaQuestionService(List<Question> questionList) {
        this.questionList = questionList;
    }

    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        questionList.add(newQuestion);
        return newQuestion;
    }

    @Override
    public void addAll(List<Question> questions) {
        questionList.addAll(questions);
    }

    @Override
    public void removeAll() {
        questionList.clear();
    }

    @Override
    public Question remove(Question question) {
       questionList.remove(question);
       return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questionList;
    }

    @Override
    public Question getRandomQuestion() {
        int randomIndex = random.nextInt(questionList.size());
        return questionList.get(randomIndex);
    }
}
