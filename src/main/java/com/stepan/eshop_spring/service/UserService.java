package com.stepan.eshop_spring.service;

import com.stepan.eshop_spring.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    boolean save(UserDTO userDTO);
}
