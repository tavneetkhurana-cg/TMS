package com.capg.service;

import org.springframework.stereotype.Service;

import com.capg.entity.User;

@Service
public interface UserService {
    User registerUser(User user);
    String login(User user);
}
