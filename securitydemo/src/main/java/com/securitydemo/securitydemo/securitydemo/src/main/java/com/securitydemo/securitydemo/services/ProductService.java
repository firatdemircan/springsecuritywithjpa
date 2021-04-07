package com.securitydemo.securitydemo.services;

import com.securitydemo.securitydemo.models.Customer;
import com.securitydemo.securitydemo.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    Product Save(Product product);
    Product getProduct(int id);
    List<Product> getProducts();

}
