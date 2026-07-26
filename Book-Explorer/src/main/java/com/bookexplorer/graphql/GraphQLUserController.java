package com.bookexplorer.graphql;


import com.bookexplorer.dto.UserResponse;
import com.bookexplorer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class GraphQLUserController {

    private final UserService userService;

    @QueryMapping
    public List<UserResponse> getAllUsers() {
        return userService.getAllUsers();
    }

    @QueryMapping
    public UserResponse getUserById(@Argument Long id) {
        return userService.getUserById(id);
    }
}

