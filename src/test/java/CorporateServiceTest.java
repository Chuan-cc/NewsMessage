import config.SpringConfig;
import domain.Corporate;
import domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.CorporateService;
import service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class CorporateServiceTest {
    @Autowired
    private CorporateService corporateService;
    Corporate corporate1=new Corporate("新浪新闻221111","李四221111","12345678911","1234");
//    Corporate corporate2=new Corporate("李四","男","1998/03/21","12345678911","1234","影视，生活");
    @Test
    public void testGetById(){
        System.out.println(corporateService.getById(1));
    }
    @Test
    public void testGetAll(){
        System.out.println(corporateService.getAll());
    }
    @Test
    public void testSave(){
        System.out.println(corporateService.save(corporate1));
    }
    @Test
    public void testDelete(){
        corporateService.delete(1);
    }
    @Test
    public void testUpDate(){
        corporateService.update(corporate1);
    }
}