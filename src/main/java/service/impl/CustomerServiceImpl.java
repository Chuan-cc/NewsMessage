package service.impl;

import dao.CustomerDao;
import domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CustomerService;

import java.util.List;
@Service
public class CustomerServiceImpl implements service.CustomerService {
    @Autowired
    CustomerDao customerDao;
    @Override
    public Customer save(Customer customer) {
        customerDao.save(customer);
        return customerDao.getId(customer);
    }

    @Override
    public boolean update(Customer customer) {
        customerDao.update(customer);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        customerDao.delete(id);
        return true;
    }

    @Override
    public Customer getById(Integer id) {
        return customerDao.getById(id);
    }


    @Override
    public List<Customer> getAll() {
        return customerDao.getAll();
    }
}
