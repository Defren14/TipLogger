package com.example.demo;

import com.example.demo.customer;
import com.example.demo.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/add")
    public customer addCustomer(@RequestParam float tipAmount, @RequestParam String customerName) {
        return customerService.addCustomer(tipAmount, customerName);
    }
}
