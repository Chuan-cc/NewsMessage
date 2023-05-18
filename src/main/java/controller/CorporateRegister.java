package controller;

import domain.Corporate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CorporateService;

import java.util.List;
@RestController
@RequestMapping("/corporate")
public class CorporateRegister {
    @Autowired
    CorporateService corporateService;

    @PostMapping
    public Corporate save(@RequestBody Corporate corporate){
        System.out.println("corporate save success ...");
        return corporateService.save(corporate);
    }

    @PutMapping
    public boolean update(@RequestBody Corporate corporate) {
        return corporateService.update(corporate);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return corporateService.delete(id);
    }

    @GetMapping("{id}")
    public Corporate getById(@PathVariable Integer id) {
        return corporateService.getById(id);
    }

    @GetMapping
    public List<Corporate> getAll() {
        return corporateService.getAll();
    }
}
