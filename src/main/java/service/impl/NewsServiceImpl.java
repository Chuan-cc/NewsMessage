package service.impl;

import dao.NewsDao;
import domain.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.NewsService;

import java.util.List;
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsDao newsDao;

    @Override
    public boolean save(News news) {
        newsDao.save(news);
        return true;
    }

    @Override
    public boolean delete(Integer news_id) {
        newsDao.delete(news_id);
        return true;
    }

    @Override
    public News getById(Integer news_id) {
        return newsDao.getById(news_id);
    }

    @Override
    public List<News> getAll() {
        return newsDao.getAll();
    }

    @Override
    public Integer getLiked(Integer news_id) {
        return newsDao.getLiked(news_id);
    }

    @Override
    public Integer setLiked(Integer integer) {
        News news=newsDao.getById(integer);
        int temp=news.getLiked();
        int like=temp+1;
        news.setLiked(like);
        newsDao.setLiked(news);
        return newsDao.getLiked(news.getNews_id());
    }

    @Override
    public List<News> getOneself(Integer writer_id) {
        return newsDao.getOneSelf(writer_id);
    }

    @Override
    public List<News> getTypeNews(String type) {
        return newsDao.getTypeNews(type);
    }

    @Override
    public List<News> fuzzyQuery(String keyword) {
        return newsDao.fuzzyQuery(keyword);
    }

    @Override
    public List<News> likedSort() {
        return newsDao.likedSort();
    }

}
