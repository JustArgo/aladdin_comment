package com.maiquan.aladdin_comment.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.maiquan.aladdin_comment.domain.Comment;
import com.maiquan.aladdin_comment.mapper.CommentMapper;
import com.maiquan.aladdin_comment.service.ICommentVoService;
import com.maiquan.aladdin_comment.vo.CommentVo;
import com.maiquan.aladdin_product.service.IProductSkuService;

public class CommentVoServiceImpl implements ICommentVoService{

	@Autowired
	private CommentMapper commentMapper;
	
	@Autowired
	private IProductSkuService productSkuService;
	
	//@Autowired
	//private IUserService userService;
	
	@Override
	public CommentVo getCommentVo(Integer commentID) {
		
		CommentVo commentVo = new CommentVo();
		
		Comment comment = commentMapper.selectByPrimaryKey(commentID);
		String userHeadImg = "http://7xrd9k.com2.z0.glb.qiniucdn.com/head_portrait.png";//userService.getUserHeadImg();
		String userName = "xiMi"; //userService.getUserName();
		
		//OrderProduct orderProduct = orderProductService.getOrderProductByID(comment.getOrderProdID(), UUID.randomUUID().toString());
		//System.out.println("skuID--------------"+orderProduct.getSkuID());
		List<String> skuStrs = productSkuService.getSkuStr(33,UUID.randomUUID().toString());

		commentVo.setComment(comment);
		commentVo.setUserHeadImg(userHeadImg);
		commentVo.setUserName(userName);
		
		System.out.println("skuStrs------"+skuStrs);
		commentVo.setSkuStrs(skuStrs);
		
		return commentVo;
	}

}
