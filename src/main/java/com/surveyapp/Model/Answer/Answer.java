package com.surveyapp.Model.Answer;


import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;

    protected Answer() {}
}
