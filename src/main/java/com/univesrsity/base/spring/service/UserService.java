package com.univesrsity.base.spring.service;

import com.univesrsity.base.spring.entity.User;
import com.univesrsity.base.spring.service.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
  User save(UserRegistrationDto userRegistrationDto);
}
