package com.study.ajax.controller;

import com.study.ajax.model.UserRequest;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class UserController {
    @PostMapping("/user/object")
    public UserRequest postMapping(@RequestBody UserRequest userRequest) {
        System.out.println(userRequest);
        return userRequest;
    }
}
