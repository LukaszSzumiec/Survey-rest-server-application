package com.surveyapp.Manager;

import com.surveyapp.Model.User.User;
import com.surveyapp.Model.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager {

    @Autowired
    private UserRepository userRepository;


    public User save(User user){
        return userRepository.save(user);
    }


    public List<User> findAll() {
        return userRepository.findAll();
    }
}
