package com.yarisingu.quiz.helper;

import org.springframework.data.jpa.repository.JpaRepository;


import com.yarisingu.quiz.dto.Question;


public interface QuestionDaoRepository extends JpaRepository<Question,Integer>{
    
}
