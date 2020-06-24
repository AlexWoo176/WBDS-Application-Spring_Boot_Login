package com.codegym.education.service;

import com.codegym.education.model.User;
import com.codegym.education.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);

    void updatePassword(String password, Long userId);
}
