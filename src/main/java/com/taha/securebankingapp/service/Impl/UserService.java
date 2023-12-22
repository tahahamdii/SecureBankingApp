package com.taha.securebankingapp.service.Impl;

import com.taha.securebankingapp.dto.BankResponse;
import com.taha.securebankingapp.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
