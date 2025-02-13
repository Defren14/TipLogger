package com.example.demo;

import com.example.demo.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<customer, Long> {
    // Spring Boot automatically provides save(), findAll(), findById(), deleteById()
}