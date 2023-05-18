package controller;

import domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRegister {
    @Autowired
    CustomerService customerService;

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        System.out.println("customer save success ...");
        return customerService.save(customer);
    }

    @PutMapping
    public boolean update(@RequestBody Customer customer) {
        return customerService.update(customer);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return customerService.delete(id);
    }

    @GetMapping("{id}")
    public Customer getById(@PathVariable Integer id) {
        return customerService.getById(id);
    }

    @GetMapping
    public List<Customer> getAll() {
        return customerService.getAll();
    }
}
