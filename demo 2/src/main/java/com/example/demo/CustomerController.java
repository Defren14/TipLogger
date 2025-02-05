package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/add")
    public customer addCustomer(@RequestParam float tipAmount, @RequestParam String customerName, @RequestParam String orderSize, @RequestParam String notes) {
        if (customerName.equals("NULL")) {
            customerName = null;
        }
        if (orderSize.equals("NULL")) {
            orderSize = null;
        }
        if (notes.equals("NULL")) {
            notes = null;
        }
        return customerService.addCustomer(tipAmount, customerName, orderSize, notes);
    }
}
