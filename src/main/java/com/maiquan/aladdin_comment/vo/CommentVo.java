package com.maiquan.aladdin_comment.vo;

import java.io.Serializable;
import java.util.List;

import com.maiquan.aladdin_comment.domain.Comment;

public class CommentVo implements Serializable{

	private static final long serialVersionUID = 334506374625462550L;

	private Comment comment;
	
	private String userHeadImg;
	
	private String userName;
	
	private List<String> skuStrs;

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public String getUserHeadImg() {
		return userHeadImg;
	}

	public void setUserHeadImg(String userHeadImg) {
		this.userHeadImg = userHeadImg;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<String> getSkuStrs() {
		return skuStrs;
	}

	public void setSkuStrs(List<String> skuStrs) {
		this.skuStrs = skuStrs;
	}

	@Override
	public String toString() {
		return "CommentVo [comment=" + comment + ", userHeadImg=" + userHeadImg
				+ ", userName=" + userName + ", skuStrs=" + skuStrs + "]";
	}
	
	
	
	
	
}
