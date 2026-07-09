package com.bookexplorer.service;

import com.bookexplorer.dto.AuthResponse;
import com.bookexplorer.dto.LoginRequest;
import com.bookexplorer.dto.RegisterRequest;
import com.bookexplorer.dto.UserResponse;

public interface UserService {

    AuthResponse register(RegisterRequest request);

    AuthResponse login(LoginRequest request);

    UserResponse getUserById(Long id);

    UserResponse registerUser(RegisterRequest request);


}
