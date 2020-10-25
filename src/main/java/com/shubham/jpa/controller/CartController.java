package com.shubham.jpa.controller;

import com.shubham.jpa.dto.CartResponse;
import com.shubham.jpa.dto.OrderRequest;
import com.shubham.jpa.entity.Customer;
import com.shubham.jpa.repository.CustomerRepository;
import com.shubham.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shubhamSaurabh
 **/
@RestController
public class CartController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/addToCart")
    public Customer addToCart(@RequestBody OrderRequest request) {
        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAll")
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<CartResponse> getJoinInformation() {
        return customerRepository.getJoinInformation();
    }
}
