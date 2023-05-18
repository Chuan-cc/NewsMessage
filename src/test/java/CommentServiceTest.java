import config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.CommentService;
import domain.Comment;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class CommentServiceTest {
    @Autowired
    private CommentService commentService;
    Comment comment=new Comment(0,11,"fdsa","test test test",1000,"张三","2022-2-2");
    @Test
    public void testSave(){
        commentService.save(comment);
    }

    @Test
    public void testGet(){
        System.out.println(commentService.getSome(11));
    }

    @Test
    public void testGetByUserId(){
        System.out.println(commentService.getByUserId(1000));
    }

    @Test
    public void testDelete(){
        System.out.println(commentService.delete(1));
    }
}
