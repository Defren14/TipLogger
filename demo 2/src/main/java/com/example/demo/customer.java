package com.example.demo;

import jakarta.persistence.*;

@Entity  // Tells Spring Boot this is a database table
@Table(name = "customer")  // Match the table name in MySQL
public class customer {

    @Id  // Primary Key
    @Column(name = "tipAmount")
    private float tipAmount;

    @Column(name = "customerName")
    private String customerName;

    // Constructors (default required by JPA)
    public customer() {}

    public customer(float tipAmount, String customerName) {
        this.tipAmount = tipAmount;
        this.customerName = customerName;
    }

    // Getters and Setters
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public float getTipAmount() { return tipAmount; }
    public void setTipAmount(float tipAmount) { this.tipAmount = tipAmount; }
}