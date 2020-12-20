package com.example.community.dto;

import com.example.community.model.User;
import lombok.Data;

@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long likeCount;
    private Long gmtCreate;
    private Long gmtModified;
    private String content;
    private User user;
    private Integer commentCount;
}
