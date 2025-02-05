package com.example.demo;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    Random rand = new Random();

    public customer addCustomer(float tipAmount, String customerName, String orderSize, String notes) {
        int transactionID = rand.nextInt(99999999); // Random 8 digit ID;

        Date date = new Date(); // your date
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("CST"));
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String fullDate = String.valueOf(year);
        if (month < 10) {
            fullDate += "0" + month;
        }
        else {
            fullDate += String.valueOf(month);
        }
        if (day < 10) {
            fullDate += "0" + day;
        }
        else {
            fullDate += String.valueOf(day);
        }

        customer newCustomer = new customer(transactionID, tipAmount, customerName, orderSize, notes, fullDate);
        return customerRepository.save(newCustomer);  // Saves the user to MySQL
    }
}
