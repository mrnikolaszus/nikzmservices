package com.nickz.customer.service;

import com.nickz.customer.entity.Customer;
import com.nickz.customer.entity.SomeApiCheckResponse;
import com.nickz.customer.repository.CustomerRepository;
import com.nickz.customer.request.CustomerRegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService{

    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();


        customerRepository.saveAndFlush(customer);
        // TODO: 2/29/2024
        var someApiCheckResponse = restTemplate.getForObject(
                "http://SOMEAPI/api/v1/check/{customerId}",
                SomeApiCheckResponse.class,
                customer.getId()
        );

        if(someApiCheckResponse.isSomApiEx()){
            throw new IllegalStateException("exter");
        }
    }
}
