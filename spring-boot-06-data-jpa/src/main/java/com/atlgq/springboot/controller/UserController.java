package com.atlgq.springboot.controller;

import com.atlgq.springboot.entites.User;
import com.atlgq.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/get/{id}")
    public Optional<User> getUserById(@PathVariable("id") Integer id){
        return userRepository.findById(id);
    }

    @GetMapping(value = "/save")
    public User saveUser(){
        User user = new User();
        user.setLastName("张三");
        User save = userRepository.save(user);
        return user;
    }
}
