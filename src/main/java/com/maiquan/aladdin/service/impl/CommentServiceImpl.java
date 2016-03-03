package com.maiquan.aladdin.service.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiquan.aladdin.domain.Comment;
import com.maiquan.aladdin.domain.CommentImg;
import com.maiquan.aladdin.mapper.CommentImgMapper;
import com.maiquan.aladdin.mapper.CommentMapper;
import com.maiquan.aladdin.service.ICommentService;


@Service
public class CommentServiceImpl implements ICommentService{

	private static Logger logger = Logger.getLogger(CommentServiceImpl.class);
	
	@Autowired 
	private CommentMapper commentMapper;
	
	@Autowired
	private CommentImgMapper commentImgMapper;
	
	@Override
	public List<Comment> getCommentNoDeletedList(int productID, int pageIndex, int pageSize, String requestID) {
		
		if(logger.isInfoEnabled()){
			try {
				logger.info("本机ip:"+InetAddress.getLocalHost().getHostAddress()+" 创建时间:"+new Date().toLocaleString()+" 服务名称:商品评价服务 方法名:getCommentNoDeletedList"+" 请求ID:"+requestID+" 输入参数: productID:"+productID+" pageIndex:"+pageIndex+" pageSize:"+pageSize);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}
		
		Comment comment = new Comment();
		comment.setProductID(productID);
		comment.setStatus(Comment.STATUS_OK);
		List<Comment> comments = commentMapper.selectByCondition(comment, pageIndex, pageSize);
		
		if(logger.isInfoEnabled()){
			try {
				logger.info("本机ip:"+InetAddress.getLocalHost().getHostAddress()+" 创建时间:"+new Date().toLocaleString()+" 服务名称:商品评价服务 方法名:getCommentNoDeletedList"+" 请求ID:"+requestID+" 输出参数:"+comments);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}
		
		return comments;
		
		
	}

	@Override
	public Comment getCommentDetail(int orderProdID, String requestID) {
		
		if(logger.isInfoEnabled()){
			try {
				logger.info("本机ip:"+InetAddress.getLocalHost().getHostAddress()+" 创建时间:"+new Date().toLocaleString()+" 服务名称:商品评价服务 方法名:getCommentDetail"+" 请求ID:"+requestID+" 输入参数: orderProdID:"+orderProdID);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}
		
		Comment comment = commentMapper.selectByOrderProdID(orderProdID);
		
		if(logger.isInfoEnabled()){
			try {
				logger.info("本机ip:"+InetAddress.getLocalHost().getHostAddress()+" 创建时间:"+new Date().toLocaleString()+" 服务名称:商品评价服务 方法名:getCommentNoDeletedList"+" 请求ID:"+requestID+" 输出参数:"+comment);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}
		
		return comment;
	}

	@Override
	public Boolean comment(Comment comment, String requestID) {
		
		Boolean ret = false;
		
		if(logger.isInfoEnabled()){
			try {
				logger.info("本机ip:"+InetAddress.getLocalHost().getHostAddress()+" 创建时间:"+new Date().toLocaleString()+" 服务名称:商品评价服务 方法名:comment"+" 请求ID:"+requestID+" 输入参数:"+comment);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}
		
		List<CommentImg> imgs = comment.getImgs();
		commentMapper.insert(comment);
		for(int i=0;i<imgs.size();i++){
			commentImgMapper.insert(imgs.get(i));
		}
		ret = true;
		
		if(logger.isInfoEnabled()){
			try {
				logger.info("本机ip:"+InetAddress.getLocalHost().getHostAddress()+" 创建时间:"+new Date().toLocaleString()+" 服务名称:商品评价服务 方法名:comment"+" 请求ID:"+requestID+" 输出参数:"+ret);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}
		
		return ret;
	}

	@Override
	public int getCountNoDeletedByProductID(int productID, String requestID) {
		
		if(logger.isInfoEnabled()){
			try {
				logger.info("本机ip:"+InetAddress.getLocalHost().getHostAddress()+" 创建时间:"+new Date().toLocaleString()+" 服务名称:商品评价服务 方法名:getCountNoDeletedByProductID"+" 请求ID:"+requestID+" 输入参数: productID:"+productID);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}
		
		Comment comment = new Comment();
		comment.setProductID(productID);
		int count = commentMapper.getCountByCondition(comment);
		
		if(logger.isInfoEnabled()){
			try {
				logger.info("本机ip:"+InetAddress.getLocalHost().getHostAddress()+" 创建时间:"+new Date().toLocaleString()+" 服务名称:商品评价服务 方法名:getCountNoDeletedByProductID"+" 请求ID:"+requestID+" 输出参数:"+count);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}
		
		return count;
	}

}
