import config.SpringConfig;
import domain.News;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.NewsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class NewsServiceTest {

    @Autowired
    private NewsService newsService;
    News news1=new News(1,3,"junit测试111111123412341","生1234活","1111111111111111111111","2022/02/02");
    News news2=new News(39,3,"junit测试111111123412341","生活","1111111111111111111111","2022/02/02");
    @Test
    public void testSave(){
        newsService.save(news1);
    }

    @Test
    public void testDelete(){
        System.out.println(newsService.delete(1));
    }

    @Test
    public void testGetById(){
        System.out.println(newsService.getById(1));
    }

    @Test
    public void testGetAll(){
        System.out.println(newsService.getAll());
    }

    @Test
    public void testGetLiked(){
        System.out.println(newsService.getLiked(39));
    }

    @Test
    public void testSetLiked(){
        System.out.println(newsService.setLiked(39));
    }

    @Test
    public void testGetOneSelf(){
        System.out.println(newsService.getOneself(2));
    }

    @Test
    public void testGetTypeNews(){
        System.out.println(newsService.getTypeNews("生活"));
    }

    @Test
    public void testFuzzyQuery(){
        System.out.println(newsService.fuzzyQuery("junit"));
    }

}
