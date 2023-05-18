package service.impl;

import dao.CorporateDao;
import domain.Corporate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CorporateService;

import java.util.List;
@Service
public class CorporateServiceImpl implements CorporateService {
    @Autowired
    CorporateDao corporateDao;
    @Override
    public Corporate save(Corporate corporate) {
        corporateDao.save(corporate);
        return corporateDao.getId(corporate);
    }

    @Override
    public boolean update(Corporate corporate) {
        corporateDao.update(corporate);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        corporateDao.delete(id);
        return true;
    }

    @Override
    public Corporate getById(Integer id) {
        return corporateDao.getById(id);
    }

    @Override
    public List<Corporate> getAll() {
        return corporateDao.getAll();
    }
}
