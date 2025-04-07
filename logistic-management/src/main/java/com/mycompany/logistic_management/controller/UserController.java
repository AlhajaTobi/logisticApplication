package com.mycompany.logistic_management.controller;

import com.mycompany.logistic_management.dto.UserDto;
import com.mycompany.logistic_management.dto.UserResponse;
import com.mycompany.logistic_management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create_user")
    public UserResponse createUser(@RequestBody UserDto user) {
        return userService.createUser(user);
    }


}
