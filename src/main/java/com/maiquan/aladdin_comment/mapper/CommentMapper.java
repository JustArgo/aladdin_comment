package com.maiquan.aladdin_comment.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.maiquan.aladdin_comment.domain.Comment;

public interface CommentMapper {
	
    int deleteByPrimaryKey(Integer ID);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer ID);
    
    List<Comment> selectAll();
    
    List<Comment> selectByCondition(@Param("comment")Comment comment,@Param("pageIndex") Integer pageIndex,@Param("pageSize") Integer pageSize);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
    
    int getCountByCondition(Comment comment);
    
    Comment selectByOrderProdID(Integer OrderProdID);
}