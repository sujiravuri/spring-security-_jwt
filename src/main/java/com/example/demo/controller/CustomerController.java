package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.service.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    JWTService jwtService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Customer customer)
    {

        UsernamePasswordAuthenticationToken token =
                new UsernamePasswordAuthenticationToken
                        (customer.getEmail(),customer.getPwd());
Authentication auth= authenticationManager.authenticate(token);
boolean status = auth.isAuthenticated();
if(status)
    return new ResponseEntity<>("Welcome" , HttpStatus.OK);
else
    return new ResponseEntity<>("Failed",HttpStatus.BAD_REQUEST);
    }



    @PostMapping("/register")
    public ResponseEntity<String> saveCustomer(@RequestBody Customer c)
    {
        boolean status = customerService.saveCustomer(c);
        if(status)
        return new ResponseEntity<String>("success",
                HttpStatus.CREATED);
        else
        return new ResponseEntity<>("failed",
                HttpStatus.INTERNAL_SERVER_ERROR);
    }
    }

