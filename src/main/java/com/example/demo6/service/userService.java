package com.example.demo6.service;

import com.example.demo6.entity.User;
import com.example.demo6.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class userService {
    @Autowired
    private UserRepository userEntityRepository;

    public List<User> getUserInformation(String email)
    {
        return userEntityRepository.findAll();
    }

}
