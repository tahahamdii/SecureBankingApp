package com.taha.securebankingapp.controller;

import com.taha.securebankingapp.dto.BankResponse;
import com.taha.securebankingapp.dto.UserRequest;
import com.taha.securebankingapp.service.Impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping
    public BankResponse createdAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount(userRequest);
    }
}
