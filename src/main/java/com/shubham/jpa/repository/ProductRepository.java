package com.shubham.jpa.repository;

import com.shubham.jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author shubhamSaurabh
 **/
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
