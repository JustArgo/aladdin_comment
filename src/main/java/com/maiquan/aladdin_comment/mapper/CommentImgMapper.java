package com.maiquan.aladdin_comment.mapper;

import com.maiquan.aladdin_comment.domain.CommentImg;

public interface CommentImgMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(CommentImg record);

    int insertSelective(CommentImg record);

    CommentImg selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(CommentImg record);

    int updateByPrimaryKey(CommentImg record);
}