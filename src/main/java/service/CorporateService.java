package service;

import domain.Corporate;
import domain.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CorporateService {
    public Corporate save(Corporate corporate);

    public boolean update(Corporate corporate);

    public boolean delete(Integer id);
    public Corporate getById(Integer id);


    public List<Corporate> getAll();
}
