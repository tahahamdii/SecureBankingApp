package com.taha.securebankingapp.service.Impl;

import com.taha.securebankingapp.dto.BankResponse;
import com.taha.securebankingapp.dto.UserRequest;
import com.taha.securebankingapp.entity.User;
import com.taha.securebankingapp.utils.AccountUtils;

public class UserServiceImpl implements UserService {

    @Override
    public BankResponse createAccount(UserRequest userRequest) {
        User newUser = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .otherName(userRequest.getOtherName())
                .gender(userRequest.getGender())
                .address(userRequest.getAddress())
                .stateOfOrigin(userRequest.getStateOfOrigin())
                .accountNumber(AccountUtils.generateAccountNumber())
                .build();
    }
}
