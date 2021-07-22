package com.example.SpringPlusHtml.web;

import com.example.SpringPlusHtml.domain.Customer;
import com.example.SpringPlusHtml.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class MainController {
    @Autowired

    ICustomerRepository iCustomerRepository;

    @GetMapping("/customer/new")
    public String initCreationForm(Model model){
        model.addAttribute("customer",new Customer());
        return "customerForm";
    }


    @PostMapping("/customer/new")
    public String processCreationForm (@ModelAttribute Customer customer, Model model) {
        iCustomerRepository.save(customer);
        model.addAttribute("customer", customer);
        return "redirect: customerlist";
    }


    @GetMapping("/customer/edit/{customerId}")
    public String initUpdateCustomerForm(@PathVariable("customerId") int id, Model model) {
        Customer customer = iCustomerRepository.findCustomerById(id);
        model.addAttribute("customer", customer);
        return "customerForm";
    }

    @PostMapping("/customer/edit/{customerId}")
    public String processUpdateCustomerForm(Customer customer, @PathVariable("customerId") int id) {
        customer.setId(id);
        iCustomerRepository.save(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/customer/list")
    public String showAllCustomers(Model model){
        List<Customer> customerList = iCustomerRepository.findAll();
        model.addAttribute("customerList",customerList);
        return "customerList";
    }

    @GetMapping("/customer/delete/{customerId}")
    public String deleteCustomer(@PathVariable("customerId") int id, Model model){
        iCustomerRepository.deleteById(id);
        List<Customer> customerList = iCustomerRepository.findAll();
        model.addAttribute("customerList", customerList);
        return "customerList";
    }

    @GetMapping("/customer/view/{customerId}")
    public String viewCustomer(@PathVariable("customerId") int id, Model model){
        Customer customer = iCustomerRepository.findCustomerById(id);
        model.addAttribute("customer", customer);
        return "customerDetails";
    }

}
