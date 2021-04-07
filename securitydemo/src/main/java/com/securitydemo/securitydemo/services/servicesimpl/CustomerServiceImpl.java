package com.securitydemo.securitydemo.services.servicesimpl;

import com.securitydemo.securitydemo.models.Customer;
import com.securitydemo.securitydemo.repostory.CustomerRepostory;
import com.securitydemo.securitydemo.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepostory customerRepostory;

    public CustomerServiceImpl(CustomerRepostory customerRepostory) {
        this.customerRepostory = customerRepostory;
    }

    @Override
    public Customer Save(Customer customer) {
       return customerRepostory.save(customer);
    }

    @Override
    public Customer getCustomer(int id) {
        return customerRepostory.getOne(id);
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepostory.findAll();
    }
}
