package com.surveyapp.Model.User;

import com.surveyapp.Model.Survey.Survey;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

//    @OneToMany(mappedBy = "user", cascade = {
//            CascadeType.
//    })
    @OneToMany(mappedBy = "user")
    private Set<Survey> surveyList;

    public User(){}

    public Set<Survey> getSurveyList() {
        return surveyList;
    }

    public void setSurveyList(Set<Survey> surveyList) {
        this.surveyList = surveyList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
