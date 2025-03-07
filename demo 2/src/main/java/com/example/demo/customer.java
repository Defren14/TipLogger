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

    @Column(name = "address")
    private String address;

    // Constructors (default required by JPA)
    public customer() {}

    public customer(int transactionID, float tipAmount, String customerName, String orderSize, String notes, String date, String address) {
        this.transactionID = transactionID;
        this.tipAmount = tipAmount;
        this.customerName = customerName;
        this.orderSize = orderSize;
        this.notes = notes;
        this.date = date;
        this.address = address;
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
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public String getOrderSize() {
        return orderSize;
    }
    public void setOrderSize(String orderSize) {
        this.orderSize = orderSize;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}