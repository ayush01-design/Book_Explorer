package com.bookexplorer.service;

import com.bookexplorer.dto.AuthResponse;
import com.bookexplorer.dto.LoginRequest;
import com.bookexplorer.dto.RegisterRequest;
import com.bookexplorer.dto.UserResponse;

import java.util.List;

public interface   UserService {

    AuthResponse register(RegisterRequest request);

    AuthResponse login(LoginRequest request);

    UserResponse getUserById(Long id);

    UserResponse registerUser(RegisterRequest request);

    List<UserResponse> getAllUsers();

    UserResponse updateUser(Long id, RegisterRequest request);

    void deleteUser(Long id);


}
