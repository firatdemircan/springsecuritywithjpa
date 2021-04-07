package com.securitydemo.securitydemo.services.servicesimpl;

import com.securitydemo.securitydemo.models.UserAuth;
import com.securitydemo.securitydemo.repostory.UserAuthRepostory;
import com.securitydemo.securitydemo.services.UserAuthService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAuthServiceImpl implements UserAuthService {

    private final UserAuthRepostory userAuthRepostory;

    public UserAuthServiceImpl(UserAuthRepostory userAuthRepostory) {
        this.userAuthRepostory = userAuthRepostory;
    }

    @Override
    public UserAuth Save(UserAuth userAuth) {
        String password = userAuth.getPassword();
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(password);

        userAuth.setPassword(encodedPassword);
        return userAuthRepostory.save(userAuth);
    }

    @Override
    public UserAuth getUserAuth(int id) {
        return userAuthRepostory.getOne(id);
    }

    @Override
    public List<UserAuth> getUserAuth() {
        return userAuthRepostory.findAll();
    }

    @Override
    public UserAuth getByEmail(String email) {
        return userAuthRepostory.findByEmail(email);
    }
}
