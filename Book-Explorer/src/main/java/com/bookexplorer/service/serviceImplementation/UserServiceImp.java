package com.bookexplorer.service.serviceImplementation;

import com.bookexplorer.dto.AuthResponse;
import com.bookexplorer.dto.LoginRequest;
import com.bookexplorer.dto.RegisterRequest;
import com.bookexplorer.dto.UserResponse;
import com.bookexplorer.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Override
    public AuthResponse register(RegisterRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }

    @Override
    public UserResponse getUserById(Long id) {
        return null;
    }
}
