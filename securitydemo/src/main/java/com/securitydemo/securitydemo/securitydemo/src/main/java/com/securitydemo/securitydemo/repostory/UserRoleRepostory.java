package com.securitydemo.securitydemo.repostory;

import com.securitydemo.securitydemo.models.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRoleRepostory extends JpaRepository<UserRole,Integer> {

    Optional<UserRole> findByEmail(String email);

}
