package com.maiquan.aladdin_comment.service;

import java.util.Map;

import com.maiquan.aladdin_comment.domain.CommonParam;


public interface ICommentRestService {
	
	/**
	 * 获得评论列表
	 * @param param 
	 * @return
	 */
	Map<String,Object> getCommentList(CommonParam param);
	/**
	 * 根据订单商品ID获得评论详情
	 * @param param
	 * @return
	 */
	Map<String,Object> getCommentDetail(CommonParam param);
	/**
	 * 对某个订单商品进行评论
	 * @return
	 */
	Map<String,Object> comment(CommonParam param);
	
}
