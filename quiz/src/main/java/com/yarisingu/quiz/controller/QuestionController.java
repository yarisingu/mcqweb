package com.yarisingu.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yarisingu.quiz.dto.Question;
import com.yarisingu.quiz.service.QuestionService;

@RestController
@RequestMapping("questions")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allquestions")
    public List<Question> getAllQuestions()
    {
        return questionService.getAllQuestions();
    }

    @PostMapping("save")
    public Question saveQuestions()
    {
         return questionService.saveQuestions();
    }
    
}
