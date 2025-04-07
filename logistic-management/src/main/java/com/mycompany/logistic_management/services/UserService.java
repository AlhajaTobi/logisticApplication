package com.mycompany.logistic_management.services;


import com.mycompany.logistic_management.dto.UserDto;
import com.mycompany.logistic_management.dto.UserResponse;
import com.mycompany.logistic_management.data.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserResponse createUser(UserDto user);
    User getUserById(String id);
}
