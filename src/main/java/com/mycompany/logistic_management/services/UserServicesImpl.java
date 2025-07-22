package com.mycompany.logistic_management.services;

import com.mycompany.logistic_management.dto.UserDto;
import com.mycompany.logistic_management.dto.UserResponse;
import com.mycompany.logistic_management.data.model.User;
import com.mycompany.logistic_management.data.repositories.UserRepository;
import com.mycompany.logistic_management.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserService {

    @Autowired
    private   UserRepository userRepository;



    @Override
    public UserResponse createUser(UserDto user) {
        User newUser = UserMapper.mapToUser(user);
         userRepository.save(newUser);
         return UserMapper.mapToUserResponseDto(newUser);



    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
