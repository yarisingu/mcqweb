package com.yarisingu.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yarisingu.quiz.dto.Question;
import com.yarisingu.quiz.helper.QuestionDaoRepository;

@Service
public class QuestionService {

    @Autowired
    QuestionDaoRepository questionDao;

    public List<Question> getAllQuestions() {

        return null;
    }

    public Question saveQuestions() {

        Question que = new Question();
       que.setQuestionTitle("tarun");
       que.setOption1("1A");
       que.setOption2("2B");
       que.setOption3("3C");
       que.setOption4("4D");
       que.setDifficultyLevel("easy");
       que.setRightAnswer("4D");
        return questionDao.save(que);
    }
    
}
