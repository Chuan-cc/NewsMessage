package service;

import domain.News;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NewsService {
    public boolean save(News news);
    public boolean delete(Integer news_id);
    public News getById(Integer news_id);
    public List<News> getAll();
    public Integer getLiked(Integer news_id);
    public Integer setLiked(Integer integer);
    public List<News> getOneself(Integer writer_id);
    public List<News> getTypeNews(String type);
    public List<News> fuzzyQuery(String keyword);
    public List<News> likedSort();
}
