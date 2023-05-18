package dao;

import domain.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao {
    @Insert("insert into commented Values(0,#{news_id},#{news_title},#{com},#{publisher_id},#{publisher},#{time})")
    public void Save(Comment comment);

    @Select("select * from commented where news_id=#{news_id}")
    public List<Comment> getSome(Integer news_id);

    @Select("Select * from commented where publisher_id=#{publisher_id}")
    public List<Comment> getByUserId(Integer publisher_id);

    @Delete("delete from commented where id=#{id};")
    public void delete(Integer integer);
}
