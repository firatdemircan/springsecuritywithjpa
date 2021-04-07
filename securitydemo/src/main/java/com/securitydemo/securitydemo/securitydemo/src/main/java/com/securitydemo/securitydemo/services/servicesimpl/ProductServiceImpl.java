package com.securitydemo.securitydemo.services.servicesimpl;

import com.securitydemo.securitydemo.models.Product;
import com.securitydemo.securitydemo.repostory.ProductRepostory;
import com.securitydemo.securitydemo.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepostory productRepostory;

    public ProductServiceImpl(ProductRepostory productRepostory) {
        this.productRepostory = productRepostory;
    }

    @Override
    public Product Save(Product product) {
        return productRepostory.save(product);
    }

    @Override
    public Product getProduct(int id) {
        return productRepostory.getOne(id);
    }

    @Override
    public List<Product> getProducts() {
        return productRepostory.findAll();
    }
}
