package com.examen.api.service;

import com.examen.api.model.User;
import com.examen.api.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserService {

    private final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public String login(String username){
      User user = userRepository.findByUsername(username).orElseThrow(() -> {
          logger.error("ERROR: findUserById -> User not found");
          return new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
      });
      return user.getUsername();
    }

}
