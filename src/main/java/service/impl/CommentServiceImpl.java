package service.impl;

import dao.CommentDao;
import domain.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CommentService;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentDao commentDao;
    @Override
    public boolean save(Comment comment) {
        commentDao.Save(comment);
        return true;
    }

    @Override
    public List<Comment> getSome(Integer integer) {
        return commentDao.getSome(integer);
    }

    @Override
    public List<Comment> getByUserId(Integer integer) {
        return commentDao.getByUserId(integer);
    }

    @Override
    public boolean delete(Integer integer) {
        commentDao.delete(integer);
        return true;
    }
}
