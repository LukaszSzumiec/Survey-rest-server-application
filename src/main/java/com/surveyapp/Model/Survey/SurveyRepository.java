package com.surveyapp.Model.Survey;

import com.surveyapp.Model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
    List<Survey> findByUserId(Long userId);
    Optional<User> findByIdAndUserId(Long id, Long user_id);
}
