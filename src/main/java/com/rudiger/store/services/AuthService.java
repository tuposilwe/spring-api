package com.rudiger.store.services;

import com.rudiger.store.entities.User;
import com.rudiger.store.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
  public User getCurrentUser(){
      var authentication = SecurityContextHolder.getContext().getAuthentication();
      var userId = (Long) authentication.getPrincipal();

      return userRepository.findById(userId).orElse(null);
  }
}
