import config.SpringConfig;
import domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class ServiceTest {
    @Autowired
    private CustomerService customerService;

    @Test
    public void testGetById(){
        System.out.println(customerService.getById(1));
    }
    @Test
    public void testGetAll(){
        System.out.println(customerService.getAll());
    }
//    @Test
////    public void testSave(){
////        customerService.save(customer1);
////    }
//    @Test
//    public void testDelete(){
//        customerService.delete(3);
//    }
//    @Test
//    public void testUpDate(){
//        customerService.update(customer2);
//    }
}
