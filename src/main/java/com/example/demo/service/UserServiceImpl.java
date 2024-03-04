package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.UserRepo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepo userRepository;
    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
