package com.project.CourseWork2.service;

import com.project.CourseWork2.domain.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface ExaminerService {
    Collection<Question> getQuestions(Integer amount);
}
