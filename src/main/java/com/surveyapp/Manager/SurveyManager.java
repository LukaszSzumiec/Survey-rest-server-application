package com.surveyapp.Manager;

import com.surveyapp.Model.Answer.Answer;
import com.surveyapp.Model.Survey.Survey;
import com.surveyapp.Model.Survey.SurveyRepository;
import com.surveyapp.Model.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Service
public class SurveyManager {

    @Autowired
    private SurveyRepository surveyRepository;

    @Autowired
    private UserRepository userRepository;

    @ManyToOne
    @JoinColumn
    private Answer answer;


    public Iterable<Survey> findAll(){
        return surveyRepository.findAll();
    }

    public Survey createSurveyInManager(Survey survey, Long userId) throws Exception {
        return userRepository.findById(userId).map(user -> {
            survey.setUser(user);
            return surveyRepository.save(survey);
        }).orElseThrow(()-> new Exception("User not found"));
    }


}
