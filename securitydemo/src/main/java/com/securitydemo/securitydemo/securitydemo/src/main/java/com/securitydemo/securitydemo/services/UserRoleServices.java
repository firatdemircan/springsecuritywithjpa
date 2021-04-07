package com.securitydemo.securitydemo.services;

import com.securitydemo.securitydemo.models.UserAuth;
import com.securitydemo.securitydemo.models.UserRole;

import java.util.List;

public interface UserRoleServices {

    List<UserRole> getByEmail(String email);

}
