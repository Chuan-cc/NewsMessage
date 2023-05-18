package controller;

import domain.Comment;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CommentService;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping
    public boolean save(@RequestBody Comment comment){
        commentService.save(comment);
        return true;
    }

    @GetMapping("{id}")
    public List<Comment> getSome(@PathVariable Integer id){
        return commentService.getSome(id);
    }

    @GetMapping("/getByUser/{id}")
    public List<Comment> getByUserId(@PathVariable Integer id){
        return commentService.getByUserId(id);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id){
        commentService.delete(id);
        return true;
    }
}
