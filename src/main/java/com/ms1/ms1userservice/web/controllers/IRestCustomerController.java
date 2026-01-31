package com.ms1.ms1userservice.web.controllers;

import com.ms1.ms1userservice.entities.Customer;
import com.ms1.ms1userservice.web.dtos.response.ApiResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/customers")
public interface IRestCustomerController {

    @GetMapping()
    ResponseEntity<ApiResponseDto<?>>findAllCustomers(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "5") int size
    );

    @GetMapping("/{customerId}")
    ResponseEntity<ApiResponseDto<?>>findCustomerById(
        @PathVariable Long customerId
    );

    @PostMapping()
    ResponseEntity<ApiResponseDto<?>> saveCustomer(@RequestBody  Customer customer);

}
