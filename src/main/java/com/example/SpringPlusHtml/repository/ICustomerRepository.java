package com.example.SpringPlusHtml.repository;

import com.example.SpringPlusHtml.domain.Customer;
import org.springframework.data.repository.CrudRepository;


import java.util.List;


public interface ICustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findAll();
    Customer findCustomerById(int id);
}
