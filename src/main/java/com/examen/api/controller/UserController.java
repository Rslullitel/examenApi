package com.examen.api.controller;

import com.examen.api.model.User;
import com.examen.api.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.examen.api.constants.Paths.*;

@RestController
@RequestMapping(USERS_PATH)
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper mapper;

    @PostMapping(value = LOGIN_PATH)
    public ResponseEntity<String> login(@RequestParam String username) {
        logger.debug("GET request getUser: {}", username);
        return new ResponseEntity<>(userService.login(username), HttpStatus.OK);
    }

}
