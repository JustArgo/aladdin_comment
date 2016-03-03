package com.maiquan.aladdin.service;

import java.util.List;

import com.maiquan.aladdin.domain.Comment;


public interface ICommentService {

	List<Comment> getCommentNoDeletedList(int productID,int pageIndex,int pageSize,String requestID);
	Comment getCommentDetail(int orderProdID,String requestID);
	Boolean comment(Comment comment,String requestID);
	int getCountNoDeletedByProductID(int productID,String requestID);
	
}
