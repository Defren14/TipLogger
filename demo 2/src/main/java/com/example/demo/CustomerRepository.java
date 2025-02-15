package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<customer, Long> {
    @Query("SELECT c.tipAmount FROM customer c WHERE c.transactionID = :transactionID")
    float getTipFromTransactionID(int transactionID);
    //customer save(customer cust);
}