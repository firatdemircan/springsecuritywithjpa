package com.securitydemo.securitydemo.repostory;

import com.securitydemo.securitydemo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepostory extends JpaRepository<Product,Integer> {
}
