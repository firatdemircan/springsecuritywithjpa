package com.securitydemo.securitydemo.repostory;

import com.securitydemo.securitydemo.models.UserAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAuthRepostory extends JpaRepository<UserAuth,Integer> {

    UserAuth findByEmail(String email);

}
