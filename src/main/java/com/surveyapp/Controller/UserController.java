package com.surveyapp.Controller;


import com.surveyapp.Manager.UserManager;
import com.surveyapp.Model.User.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserManager userManager;

    public  UserController(UserManager userManager){
        this.userManager = userManager;
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userManager.findAll();
    }
    @PostMapping
    public User addUser(@RequestBody User user){
        return userManager.save(user);
    }
}
