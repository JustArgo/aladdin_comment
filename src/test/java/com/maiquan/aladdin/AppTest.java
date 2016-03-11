package com.maiquan.aladdin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.maiquan.aladdin_comment.domain.Comment;
import com.maiquan.aladdin_comment.domain.CommentImg;
import com.maiquan.aladdin_comment.mapper.CommentImgMapper;
import com.maiquan.aladdin_comment.mapper.CommentMapper;
import com.maiquan.aladdin_comment.service.ICommentService;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AppTest {
	
	@Autowired
	private CommentMapper commentMapper;
	
	@Autowired
	private CommentImgMapper commentImgMapper;
	
	@Autowired 
	private ICommentService commentService;
	
	@Test
	public void testMapper(){
		
		Comment comment = new Comment();
		comment.setProductID(1);
		comment.setStatus(Comment.STATUS_OK);
		List<Comment> comments = commentMapper.selectByCondition(comment, 0, 3);
		
		System.out.println(comments.size());
		
		for(int i=0;i<comments.size();i++){
			System.out.println("----------------------------------------------------");
			System.out.println(comments.get(i));
		}
		
	}
	
	public void testSelectByOrderProdID(){
		Comment comment = commentMapper.selectByOrderProdID(19);
		System.out.println(comment);
	}
	
	public void testInsertComment(){
		Comment comment = new Comment();
		comment.setID(19);
		comment.setMqID("1");
		comment.setProductID(2);
		comment.setOrderID(1);
		comment.setOrderProdID(19);
		comment.setStatus(Comment.STATUS_OK);
		comment.setCommentDesc("很好");
		comment.setCreateTime(new Date());

		CommentImg img1 = new CommentImg();
		CommentImg img2 = new CommentImg();
		
		img1.setID(3);
		img1.setImgPath("images/img/thumbnail.png");
		img1.setCommentID(19);
		img1.setCreateTime(new Date());
		img1.setSortOrder(1);
		img1.setStatus(CommentImg.STATUS_OK);
		
		img2.setID(4);
		img2.setImgPath("images/img/thumbnail.png");
		img2.setCommentID(19);
		img2.setCreateTime(new Date());
		img2.setSortOrder(2);
		img2.setStatus(CommentImg.STATUS_OK);
		
		List<CommentImg> imgs = new ArrayList<CommentImg>();
		imgs.add(img1);
		imgs.add(img2);
		
		comment.setImgs(imgs);
		
		commentService.comment(comment,UUID.randomUUID().toString());
		
	}
	
	@Test
	public void test4Install(){
		Assert.assertEquals(1, 1);
	}
	
	
}
