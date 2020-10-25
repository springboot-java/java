package com.shubham.jpa.repository;

import com.shubham.jpa.dto.CartResponse;
import com.shubham.jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author shubhamSaurabh
 **/
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT new com.shubham.jpa.dto.CartResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<CartResponse> getJoinInformation();
}
