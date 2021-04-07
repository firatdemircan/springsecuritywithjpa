package com.securitydemo.securitydemo.services;

import com.securitydemo.securitydemo.models.Customer;
import com.securitydemo.securitydemo.models.UserAuth;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserAuthService {

    UserAuth Save(UserAuth userAuth);
    UserAuth getUserAuth(int id);
    List<UserAuth> getUserAuth();

    UserAuth getByEmail(String email);

}
