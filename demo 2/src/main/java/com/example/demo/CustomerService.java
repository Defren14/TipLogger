package com.example.demo;

import com.example.demo.customer;
import com.example.demo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public customer addCustomer(float tipAmount, String customerName) {
        customer newCustomer = new customer(tipAmount, customerName);
        return customerRepository.save(newCustomer);  // Saves the user to MySQL
    }
}
