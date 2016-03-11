package com.maiquan.aladdin_comment.service;

import com.maiquan.aladdin_comment.vo.CommentVo;

public interface ICommentVoService {

	//根据评论id获得 评论的封装对象
	CommentVo getCommentVo(Integer commentID);
	
}
