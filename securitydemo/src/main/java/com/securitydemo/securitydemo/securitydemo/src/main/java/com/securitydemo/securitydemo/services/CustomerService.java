package com.securitydemo.securitydemo.services;

import com.securitydemo.securitydemo.models.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    Customer Save(Customer customer);
    Customer getCustomer(int id);
    List<Customer> getCustomers();

}
