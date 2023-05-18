package dao;
import domain.News;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsDao {
    @Insert("insert into news(news_id,writer_id,title,type,context,publish_date) Values(0,#{writer_id},#{title},#{type},#{context},#{publish_date})")
    public void save(News news);
    @Delete("delete from news where news_id=#{news_id};")
    public void delete(Integer news_id);
    @Select("select * from news where news_id=#{news_id};")
    public News getById(Integer news_id);
    @Select("select * from news;")
    public List<News> getAll();
    @Select("select liked from news where news_id=#{news_id}")
    public Integer getLiked(Integer news_id);
    @Select("select * from news where writer_id=#{writer_id}")
    public List<News> getOneSelf(Integer writer_id);
    @Select("select * from news where type=#{type}")
    public List<News> getTypeNews(String type);
    @Select("SELECT * FROM news WHERE CONCAT(title,context) LIKE CONCAT(CONCAT('%', #{keyword}), '%');")
    public List<News> fuzzyQuery(String keyword);
    @Select("SELECT * FROM news order by liked desc limit 0,10;")
    public List<News> likedSort();
    @Update("update news set liked=#{liked} where news_id=#{news_id};")
    public void setLiked(News news);

}
