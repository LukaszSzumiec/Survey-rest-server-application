package com.surveyapp.Controller;


import com.surveyapp.Manager.AnswerManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/answer")
public class AnswerController {

    private AnswerManager answerManager;

    public AnswerController(AnswerManager answerManager) {
        this.answerManager = answerManager;
    }

}
