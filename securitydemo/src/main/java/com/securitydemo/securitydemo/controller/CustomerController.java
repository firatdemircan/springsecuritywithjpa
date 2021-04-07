package com.securitydemo.securitydemo.controller;

import com.securitydemo.securitydemo.models.Customer;
import com.securitydemo.securitydemo.models.Product;
import com.securitydemo.securitydemo.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping("/insert")
    public Map<String, Customer> insert(@RequestBody Customer customer){

        Map<String,Customer> hm = new HashMap<>();

        hm.put("Result",customerService.Save(customer));

        return hm;
    }

    @GetMapping("/list")
    public Map<String, Customer> list(){

        Map<String,Customer> hm = new HashMap<>();
        List<Customer> customers = customerService.getCustomers();
        for (Customer customer : customers) {
            hm.put("Result",customer);
        }

        return hm;
    }
}
