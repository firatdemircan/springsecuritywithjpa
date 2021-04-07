package com.securitydemo.securitydemo.util;

import com.securitydemo.securitydemo.models.UserAuth;
import com.securitydemo.securitydemo.models.UserRole;
import com.securitydemo.securitydemo.repostory.UserRoleRepostory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class MyUserDetails implements UserDetails {



    final UserRoleRepostory userRoleRepostory;

    private UserAuth userAuth;


    public MyUserDetails(UserRoleRepostory userRoleRepostory, UserAuth userAuth) {
        this.userRoleRepostory = userRoleRepostory;
        this.userAuth = userAuth;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> cl = new ArrayList<>();
        Optional<UserRole> us = userRoleRepostory.findByEmail(userAuth.getEmail());

        GrantedAuthority pr = new SimpleGrantedAuthority(us.get().getUserRol());
        cl.add(pr);
        return cl;
    }

    @Override
    public String getPassword() {
        return userAuth.getPassword();
    }

    @Override
    public String getUsername() {
        return userAuth.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return userAuth.getIsEnabled();
    }
}
