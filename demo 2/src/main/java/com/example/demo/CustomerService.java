package com.example.demo;

import java.util.Random;
import com.example.demo.customer;
import com.example.demo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    Random rand = new Random();

    public customer addCustomer(float tipAmount, String customerName) {
        int transactionID = rand.nextInt(99999999); // Random 8 digit ID;

        customer newCustomer = new customer(transactionID, tipAmount, customerName);
        return customerRepository.save(newCustomer);  // Saves the user to MySQL
    }
}
