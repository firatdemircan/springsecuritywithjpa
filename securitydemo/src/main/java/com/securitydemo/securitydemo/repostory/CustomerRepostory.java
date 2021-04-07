package com.securitydemo.securitydemo.repostory;

import com.securitydemo.securitydemo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepostory extends JpaRepository<Customer,Integer> {
}
