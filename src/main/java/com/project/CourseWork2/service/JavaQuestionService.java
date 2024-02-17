package com.project.CourseWork2.service;

import com.project.CourseWork2.domain.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    private List<Question> questionList;

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
    public Question remove(Question question) {
        if (questionList.contains(question)) {
            questionList.removeIf(q -> q.equals(question));
            return question;
        } else {
            return null;
        }
    }

    @Override
    public Collection<Question> getAll() {
        return questionList;
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        int randomIndex = random.nextInt(questionList.size());
        return questionList.get(randomIndex);
    }
}
