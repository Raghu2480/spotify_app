package com.niit.service;

import com.niit.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserByUserName(String userName);
}
