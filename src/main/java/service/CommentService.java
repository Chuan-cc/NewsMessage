package service;

import domain.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {
    public boolean save(Comment comment);
    public List<Comment> getSome(Integer integer);
    public List<Comment> getByUserId(Integer integer);
    public boolean delete(Integer integer);
}
