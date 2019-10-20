package com.surveyapp.Manager;

import com.surveyapp.Model.Answer.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerManager {

    private AnswerRepository answerRepository;

    @Autowired
    public AnswerManager(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }


}
