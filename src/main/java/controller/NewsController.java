package controller;

import domain.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.NewsService;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    NewsService newsService;

    @PostMapping
    public boolean save(@RequestBody News news){
        newsService.save(news);
        return true;
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return newsService.delete(id);
    }

    @GetMapping("/{id}")
    public News getById(@PathVariable Integer id) {
        return newsService.getById(id);
    }

    @GetMapping
    public List<News> getAll() {
        return newsService.getAll();
    }

    @GetMapping("/liked/{id}")
    public Integer getLiked(@PathVariable Integer id){
        return newsService.getLiked(id);
    }

    @GetMapping("/addLiked/{id}")
    public Integer setLiked(@PathVariable Integer id){
        return newsService.setLiked(id);
    }

    @GetMapping("/getNews/{id}")
    public List<News> getOneSelf(@PathVariable Integer id){
        return newsService.getOneself(id);
    }

    @GetMapping("/search/{type}")
    public List<News> getTypeNews(@PathVariable String type){
        return newsService.getTypeNews(type);
    }

    @GetMapping("/fuzzyQuery/{keyword}")
    public List<News> fuzzyQuery(@PathVariable String keyword){
        return newsService.fuzzyQuery(keyword);
    }

    @GetMapping("/likedSort")
    public List<News> likedSort(){
        return newsService.likedSort();
    }

}
