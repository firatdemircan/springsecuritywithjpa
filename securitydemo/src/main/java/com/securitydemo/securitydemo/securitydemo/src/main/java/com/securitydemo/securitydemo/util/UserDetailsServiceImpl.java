package com.securitydemo.securitydemo.util;

import com.securitydemo.securitydemo.models.UserAuth;
import com.securitydemo.securitydemo.repostory.UserAuthRepostory;
import com.securitydemo.securitydemo.repostory.UserRoleRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserAuthRepostory userAuthRepostory;
    @Autowired
    private UserRoleRepostory userRoleRepostory;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        UserAuth userAuth = userAuthRepostory.findByEmail(email);

        if (userAuth == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
        return new MyUserDetails(userRoleRepostory,userAuth);
    }
}
