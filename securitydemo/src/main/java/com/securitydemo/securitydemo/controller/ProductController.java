package com.securitydemo.securitydemo.controller;

import com.securitydemo.securitydemo.models.Product;
import com.securitydemo.securitydemo.services.CustomerService;
import com.securitydemo.securitydemo.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping("/insert")
    public Map<String, Product> insert(@RequestBody Product product){

        Map<String,Product> hm = new HashMap<>();

        hm.put("Result",productService.Save(product));

        return hm;
    }

    @GetMapping("/list")
    public Map<String, Product> list(){

        Map<String,Product> hm = new HashMap<>();
        List<Product> products = productService.getProducts();
        for (Product product : products) {
            hm.put("Result",product);
        }

        return hm;
    }

}
