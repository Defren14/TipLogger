package com.example.demo;

import jakarta.persistence.*;

@Entity  // Tells Spring Boot this is a database table
@Table(name = "customer")  // Match the table name in MySQL
public class customer {

    @Id  // Primary Key
    @Column(name = "transactionID")
    private int transactionID;

    @Column(name = "tipAmount")
    private float tipAmount;

    @Column(name = "customerName")
    private String customerName;

    @Column(name = "orderSize")
    private String orderSize;

    @Column(name = "notes")
    private String notes;

    @Column(name = "date")
    private String date;

    // Constructors (default required by JPA)
    public customer() {}

    public customer(int transactionID, float tipAmount, String customerName, String orderSize, String notes, String date) {
        this.transactionID = transactionID;
        this.tipAmount = tipAmount;
        this.customerName = customerName;
        this.orderSize = orderSize;
        this.notes = notes;
        this.date = date;
    }

    // Getters and Setters
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public float getTipAmount() { return tipAmount; }
    public void setTipAmount(float tipAmount) { this.tipAmount = tipAmount; }

    public int getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }
}