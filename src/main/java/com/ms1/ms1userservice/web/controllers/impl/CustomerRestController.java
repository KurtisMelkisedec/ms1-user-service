package com.ms1.ms1userservice.web.controllers.impl;

import com.ms1.ms1userservice.entities.Customer;
import com.ms1.ms1userservice.services.ICustomerService;
import com.ms1.ms1userservice.web.controllers.IRestCustomerController;
import com.ms1.ms1userservice.web.dtos.response.ApiResponseDto;
import com.ms1.ms1userservice.web.mappers.PageMetaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController implements IRestCustomerController {
    private final ICustomerService customerService;
    public CustomerRestController(ICustomerService customerService){
        this.customerService = customerService;
    }
    @Override
    public ResponseEntity<ApiResponseDto<?>> findAllCustomers(int page, int size) {
        Page<Customer> customers = customerService.findAllCustomers(PageRequest.of(page, size));

        ApiResponseDto<List<Customer>> response = ApiResponseDto.success(
            HttpStatus.OK.value(),
            customers.isEmpty() ? "Aucun client" : "Liste des clients",
            customers.getContent(),
            PageMetaMapper.from(customers)
        );

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<ApiResponseDto<?>> findCustomerById(Long customerId) {
        Customer customer = customerService.findCustomerById(customerId);
        ApiResponseDto<Customer> response = ApiResponseDto.success(
            HttpStatus.OK.value(),
            "Customer trouvé",
            customer,
            null
        );
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<ApiResponseDto<?>> saveCustomer(Customer customer) {
        System.out.println(customer.getFullName());
        System.out.println(customer.getPhoneNumber());
        Customer savedCustomer = customerService.saveCustomer(customer);
        ApiResponseDto<Customer> response = ApiResponseDto.success(
            HttpStatus.OK.value(),
            "Customer trouvé",
            savedCustomer,
            null
        );

        return ResponseEntity.ok(response);
    }
}
