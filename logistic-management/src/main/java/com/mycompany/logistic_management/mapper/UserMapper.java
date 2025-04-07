package com.mycompany.logistic_management.mapper;

import com.mycompany.logistic_management.dto.UserDto;
import com.mycompany.logistic_management.data.model.User;
import com.mycompany.logistic_management.dto.UserResponse;



public class UserMapper {

    public  static User mapToUser(UserDto userDto){
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setRole(userDto.getRole());
        user.setPassword(userDto.getPassword());
        return user;

    }


    public static UserResponse mapToUserResponseDto(User user){
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getUserId());
        userResponse.setFirstName( user.getFirstName());
        userResponse.setLastName(user.getLastName());
        userResponse.setEmail(user.getEmail());
        userResponse.setRole(user.getRole());
        userResponse.setMessage("successful");
        return userResponse;




    }


}
