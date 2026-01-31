package com.ms1.ms1userservice.services;

import com.ms1.ms1userservice.entities.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {


    Page<Customer> findAllCustomers(Pageable pageable);

    Customer findCustomerById(Long id);

    Customer saveCustomer(Customer customer);


}
