package com.securitydemo.securitydemo.services.servicesimpl;

import com.securitydemo.securitydemo.models.UserAuth;
import com.securitydemo.securitydemo.models.UserRole;
import com.securitydemo.securitydemo.repostory.UserRoleRepostory;
import com.securitydemo.securitydemo.services.UserRoleServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRoleServiceImpl implements UserRoleServices {

    UserRoleRepostory userRoleRepostory;

    @Override
    public List<UserRole> getByEmail(String email) {

        List<UserRole> result = new ArrayList<>();

        Optional<UserRole> userRole = userRoleRepostory.findByEmail(email);
        userRole.ifPresent(result::add);

        return result;
    }
}
