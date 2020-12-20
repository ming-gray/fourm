package com.example.community.mapper;

import com.example.community.model.Comment;
import org.springframework.stereotype.Repository;
@Repository
public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}
