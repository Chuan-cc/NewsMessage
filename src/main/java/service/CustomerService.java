package service;

import domain.Customer;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public interface CustomerService {
    public Customer save(Customer customer);

    public boolean update(Customer customer);

    public boolean delete(Integer id);
    public Customer getById(Integer id);
    public List<Customer> getAll();

}
