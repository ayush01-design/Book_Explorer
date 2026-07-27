package com.bookexplorer.graphql;


import com.bookexplorer.dto.RegisterRequest;
import com.bookexplorer.dto.UserResponse;
import com.bookexplorer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
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

    @MutationMapping
    public UserResponse registerUser(@Argument RegisterRequest request) {
        return userService.registerUser(request);
    }

    @MutationMapping
    public UserResponse updateUser(@Argument Long id,
                                   @Argument RegisterRequest request) {
        return userService.updateUser(id, request);
    }

    @MutationMapping
    public String deleteUser(@Argument Long id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }




}



