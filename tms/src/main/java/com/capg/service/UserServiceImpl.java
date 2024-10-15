package com.capg.service;

import com.capg.entity.User;
import com.capg.repository.UserRepository;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {
        // Save the user to the repository
        return userRepository.save(user);
    }

    @Override
    public String login(User user) {
        // Validate user credentials
        User foundUser = userRepository.findByUsername(user.getUsername());
        if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }

}
