package com.surveyapp.Controller;

import com.surveyapp.Manager.SurveyManager;
import com.surveyapp.Model.Survey.Survey;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/survey")
public class SurveyController {

    private SurveyManager surveyManager;

    public SurveyController(SurveyManager surveyManager) {
        this.surveyManager = surveyManager;
    }

    @GetMapping("/all")
    public Iterable<Survey> getAll(){
        return surveyManager.findAll();
    }

//    @PutMapping
//    public Survey editSurvey(@RequestBody Survey survey){
//        return surveyManager.save(survey);
//    }

    @RequestMapping(
            value = "/{userId}",
            method = RequestMethod.POST,
            produces = "application/json"
    )
    @PostMapping
    public void createSurvey(@PathVariable Long userId, @RequestBody Survey survey) throws Exception {
        surveyManager.createSurveyInManager(survey, userId);
    }
}
