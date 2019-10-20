package com.surveyapp.Model.Survey;

import com.surveyapp.Model.User.User;

import javax.persistence.*;

@Entity
@Table(name = "survey")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String survey_title;

    private String question;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    public Survey(){}

//    public User getUser() {
//        return user;
//    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurvey_title() {
        return survey_title;
    }

    public void setSurvey_title(String survey_title) {
        this.survey_title = survey_title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "id=" + id +
                ", survey_title='" + survey_title + '\'' +
                ", question='" + question + '\'' +
                '}';
    }
}
