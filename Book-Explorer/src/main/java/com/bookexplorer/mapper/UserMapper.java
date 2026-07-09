package com.bookexplorer.mapper;

import com.bookexplorer.dto.RegisterRequest;
import com.bookexplorer.dto.UserResponse;
import com.bookexplorer.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static User toEntity(RegisterRequest request) {

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        return user;
    }

    public static UserResponse toResponse(User user) {

        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }

}
