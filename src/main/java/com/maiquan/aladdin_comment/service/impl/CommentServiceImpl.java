package com.maiquan.aladdin_comment.service.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiquan.aladdin_comment.domain.Comment;
import com.maiquan.aladdin_comment.domain.CommentImg;
import com.maiquan.aladdin_comment.mapper.CommentImgMapper;
import com.maiquan.aladdin_comment.mapper.CommentMapper;
import com.maiquan.aladdin_comment.service.ICommentService;
import com.maiquan.aladdin_comment.util.LogUtil;


@Service
public class CommentServiceImpl implements ICommentService{

	@Autowired 
	private CommentMapper commentMapper;
	
	@Autowired
	private CommentImgMapper commentImgMapper;
	
	@Override
	public List<Comment> getCommentNoDeletedList(int productID, int pageIndex, int pageSize, String requestID) {
		
		LogUtil.logInput("评论微服务", "getCommentNoDeletedList", requestID, productID, pageIndex, pageSize);
		
		Comment comment = new Comment();
		comment.setProductID(productID);
		comment.setStatus(Comment.STATUS_OK);
		List<Comment> comments = commentMapper.selectByCondition(comment, pageIndex, pageSize);
		
		LogUtil.logOutput("评论微服务", "getCommentNoDeletedList", requestID, comments);
		
		return comments;
		
		
	}

	@Override
	public Comment getCommentDetail(int orderProdID, String requestID) {
		
		LogUtil.logInput("评论微服务", "getCommentDetail", requestID, orderProdID);
		
		Comment comment = commentMapper.selectByOrderProdID(orderProdID);
		
		LogUtil.logOutput("评论微服务", "getCommentDetail", requestID, comment);
		
		return comment;
	}

	@Override
	public int comment(Comment comment, String requestID) {
		
		
		LogUtil.logInput("评论微服务", "comment", requestID, comment);
		
		List<CommentImg> imgs = comment.getImgs();
		commentMapper.insert(comment);
		for(int i=0;i<imgs.size();i++){
			commentImgMapper.insert(imgs.get(i));
		}
		
		LogUtil.logOutput("评论微服务", "comment", requestID, "无");
		
		return 0;
	}

	@Override
	public int getCountNoDeletedByProductID(int productID, String requestID) {
		
		LogUtil.logInput("评论微服务", "getCountNoDeletedByProductID", requestID, productID);
		
		Comment comment = new Comment();
		comment.setProductID(productID);
		int count = commentMapper.getCountByCondition(comment);
		
		LogUtil.logOutput("评论微服务", "getCountNoDeletedByProductID", requestID, count);
		
		return count;
	}

}
