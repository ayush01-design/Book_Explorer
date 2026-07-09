package com.bookexplorer.service.serviceImplementation;

import com.bookexplorer.dto.AuthResponse;
import com.bookexplorer.dto.LoginRequest;
import com.bookexplorer.dto.RegisterRequest;
import com.bookexplorer.dto.UserResponse;
import com.bookexplorer.entity.User;
import com.bookexplorer.exception.UserAlreadyExistsException;
import com.bookexplorer.mapper.UserMapper;
import com.bookexplorer.repository.UserRepository;
import com.bookexplorer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    public UserResponse registerUser(RegisterRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {

            throw new UserAlreadyExistsException("Email already exists");
        }

        User user = userMapper.toEntity(request);

        User savedUser = userRepository.save(user);

        return userMapper.toResponse(savedUser);

    }


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
